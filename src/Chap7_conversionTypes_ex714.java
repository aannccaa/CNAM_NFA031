/*
Exercice 7.1.4 cryptographie élémentaire
L’encodage et le décodage sont deux opérations symétriques qui permettent de transformer 
un certain message soit pour conserver sa confidentialité (cryptographie) soit pour 
respecter des contraintes techniques. Par exemple, les ordinateurs utilisent des codages 
binaires de toutes les données qu’il manipulent : textes, nombres, images, sons, etc.

Question 1 code de Jules César
Pour crypter ses messages, Jules César a utilisé un code qui consistait à remplacer 
chaque lettre par la lettre située trois crans plus loin dans l’alphabet. Par exemple, 
le a est codé par un d, le b par un e, etc. Les trois dernières lettres de l’alphabet 
sont codées respectivement par a, b et c.
Ecrivez les fonctions d’encodage et de décodage pour ce code. Ces fonctions ne seront 
définies que pour les lettres, les autres caractères restant inchangés. Ces fonctions 
permettront d’encoder et de décoder des chaînes de caractère.
Notez qu’en Java, le type char est numérique : on peut lui appliquer les opération arithmétiques 
et notamment l’addition et la soustraction utiles dans cet exercice.
Question 2 un code à clé
On veut garder le principe de remplacement d’une lettre par une autre caractérisée par son 
décalage dans l’alphabet, mais on veut maintenant que ce décalage varie d’une lettre 
à l’autre selon une clé numérique. Chaque chiffre de la clé donne le décalage d’une lettre.
Prenons par exemple la clé 23781. Cette clé va s’appliquer successivement à plusieurs morceaux 
de chaîne de longueur 5. La première lettre sera remplacée par la deuxième lettre qui suit 
dans l’alphabet car 2 est le premier chiffre de la clé. La deuxième lettre sera remplacée par 
la 3ème suivante, la troisième par la septième suivante, etc.
Par exemple, le message: bonjour, comment va? sera codé comme suit:
   bonjourcommentva 
   2378123781237812 
   drurpwujwnohubwc
Donnez les fonctions d’encodage et de décodage pour cette méthode de codage. La clé sera 
donnée en paramètre sous la forme qui vous semble la plus pratique.
 */
public class Chap7_conversionTypes_ex714 {

	public static void main(String[] args) {

		// Q1
		int decalage = 3;
		int[] decalageClef = { 3 };
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		int len = alphabet.length;
		int[] test = { 0, 1, len - 5, len - 4, len - 3, len - 2, len - 1 };
		for (int i = 0; i < test.length; i++) {
			int indexDecalat = getIndexDecale(test[i], decalage, len);
			System.out.println(test[i] + "=>" + indexDecalat);
		}

		char[] codageAlphabet = codageCesarAlphabet(alphabet, decalage);
		afficherTab1D(codageAlphabet);

		// coder
		// coder un character
		char charACoder = 'b';
		char charCode = coderCharCesar(charACoder, alphabet, codageAlphabet);
		System.out.println("Codage char Cesar : " + charACoder + " => " + charCode);

		// coder un string
		String stringACoder = "abcxyz";
		String stringCode = coderStringCesar(stringACoder, alphabet, codageAlphabet);
		System.out.println("Codage string Cesar : " + stringACoder + " => " + stringCode);

		// variante Cata:
		//stringCode = coderDecoder(stringACoder, true, decalageClef);
		System.out.println("Codage string Cata : " + stringACoder + " => " + stringCode);

		// decoder un character
		char charAdecoder = 'a';
		char charDecode = decoderCharCesar(charAdecoder, alphabet, codageAlphabet);
		System.out.println("Decodage char Cesar : " + charAdecoder + " => " + charDecode);

		// decoder un string

		String stringAdecoder = "abcxyz";
		String stringDecode = decoderStringCesar(stringAdecoder, alphabet, codageAlphabet);
		System.out.println("Decodage string Cesar : " + stringAdecoder + " => " + stringDecode);

		// variante Cata:
		//stringDecode = coderDecoder(stringAdecoder, false, decalageClef);
		System.out.println("Decodage string Cata : " + stringAdecoder + " => " + stringDecode);

		// Q2
		int[] codeClef = { 2, 3, 7, 8, 1 };

	}

	public static void afficherTab1D(char[] tab) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = ";";
		}
		System.out.println("}");
	}

	public static int getIndexDecale(int index, int decalage, int len) {
		return (index + decalage) % len;
	}

	public static int getIndexNonDecale(int indexDecale, int decalage, int len) {
		return (indexDecale + len - decalage) % len;
	}

	public static char coderDecoder(char c, int decalage, boolean coder) {
		if (c >= 'a' && c <= 'z') {
			int indexChar = c - 'a';
			int len = 'z' - 'a' + 1;
			int indexDecale;
			if (coder) {
				indexDecale = getIndexDecale(indexChar, decalage, len);
			} else {
				indexDecale = getIndexNonDecale(indexChar, decalage, len);
			}
			char codedChar = (char) ('a' + indexDecale);
			return codedChar;
		} else {
			return c;
		}
	}

//	public static String coderDecoder(String s, boolean coder, int[] clef) {
//		String result = "";
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			int indexDecalage = i % clef.length;
//			int decalage = 
//[indexDecalage];
//			char encodedChar = coderDecoder(c, decalage, coder);
//			result = result + encodedChar;
//		}
//		return result;
//	}

	public static char[] codageCesarAlphabet(char[] alphabet, int decalage) {

		char[] codageAlphabet = new char[alphabet.length];
		for (int i = 0; i < alphabet.length; i++) {
			if (i < alphabet.length - decalage) {
				codageAlphabet[i] = alphabet[i + decalage];
			} else {
				for (int j = 0; j < decalage; j++) {
					if (i == alphabet.length - decalage) {
						codageAlphabet[alphabet.length - decalage + j] = alphabet[j];
					}
				}
			}
		}

		return codageAlphabet;
	}

	public static char coderCharCesar(char aCoder, char[] alphabet, char[] codageAlphabet) {
		char cc = 'a';
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] == aCoder) {
				cc = codageAlphabet[i];
			}
		}

		return cc;
	}

	public static char decoderCharCesar(char charAdecoder, char[] alphabet, char[] codageAlphabet) {
		char cd = 'a';
		for (int i = 0; i < alphabet.length; i++) {
			if (codageAlphabet[i] == charAdecoder) {
				cd = alphabet[i];
			}
		}

		return cd;
	}

	public static String coderStringCesar(String s, char[] alphabet, char[] codageAlphabet) {
		String cs = "";
		char temp;
		char cc = 'x';

		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			cc = coderCharCesar(temp, alphabet, codageAlphabet);
			cs = cs + cc;
		}

		return cs;
	}

	public static String decoderStringCesar(String s, char[] alphabet, char[] codageAlphabet) {
		String cs = "";
		char temp;
		char cc = 'a';

		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			cc = decoderCharCesar(temp, alphabet, codageAlphabet);
			cs = cs + cc;
		}

		return cs;
	}
}
