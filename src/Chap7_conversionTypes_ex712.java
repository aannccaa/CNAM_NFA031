/*
Exercice 7.1.2 extraction de mots
On va considérer qu’un mot est une suite de caractères qui ne comprend que des lettres. 
Tous les autres caractères seront considérés comme des séparateurs utilisés pour séparer les différents mots. 
Pour déterminer si un caractère est une lettre, on utilisera la méthode Character.isLetter.
Ecrire une méthode qui transforme une chaîne de caractères en un tableau contenant les mots de cette chaîne 
dans le même ordre.
Par exemple la chaîne:"bonjour mon ami" sera convertie dans le tableau de chaines {"bonjour","mon","ami"}. 
Pour ce faire, il faut parcourir la chaîne à convertir et mémoriser à tout moment le début déjà lu du mot courant. 
Il faut aussi distinguer si l’on est an train de lire un mot ou un séparateur séparant deux mots. 
Il ne faut pas négliger le fait qu’il peut y avoir plusieurs caractères séparateurs successifs tels que 
plusieurs espaces entre deux mots.
 */
public class Chap7_conversionTypes_ex712 {

	public static void main(String[] args) {
		// String phrase = "Bonjour mon ami";
		// int nbMots = commpterMots(phrase);
		//
		// System.out.println(nbMots);
		// String[] mots = extractMots(phrase);
		// afficherMots(mots);
		//
		// String chaine = "aabcaaabcccc";
		// String maxSuite = getMaxSuite(chaine);
		// System.out.println("Le palier ayant un max de char identiques est : " +
		// maxSuite);
		//
		// int NbPalieres = getNbPalieresCharIdentiques(chaine);
		// System.out.println("Nb palières char identiques = " + NbPalieres);
		//
		// String substring = "mon ami";
		// int indice = find(phrase, substring);
		// if (indice == -1) {
		// System.out.println("pas trouvé");
		// } else {
		// System.out.println("trouvé à l'indice " + indice);
		// }
		//
		// boolean seRepete = isRepetition2(phrase, substring);
		// System.out.println(seRepete);
		//
		// String mot = "Anca";
		// String anagrame = "canA";
		// boolean estAnagrame = isAnagrame(mot, anagrame);
		// System.out.println("est anagrame : " + estAnagrame);

		String phrase2 = "Anca are mere. Anca are parul mare.Anca nu are frica!";
		// int nbMots2 = countMots2(phrase2);
		// System.out.println("Nb mots (variante 2) = " + nbMots2);
		//
		// int nbMots3 = countMots3(phrase2);
		// System.out.println("Nb mots (variante 3) = " + nbMots3);

		String[] mots2 = extractMots2(phrase2);
		afficherMots(mots2);

		// int[] indiceMots = extractIndiceMots2(phrase2, mots2);
		// afficherMots(indiceMots);
		//
		// Object[] motsAndIndices = extractMots3(phrase2);
		// String[] mots3 = (String[]) motsAndIndices[0];
		// int[] indiceMots3 = (int[]) motsAndIndices[1];
		// afficherMots(mots3);
		// afficherMots(indiceMots3);

		int doublons = compterDoublons(mots2);
		System.out.println("Nb des mots identiques = " + doublons);

		String[] motsUniques = motsSansDoublons(mots2);
		afficherMots(motsUniques);
	}

	private static void afficherMots(String[] mots) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < mots.length; i++) {
			System.out.print(sep + mots[i]);
			sep = ";";
		}
		System.out.println("}");

	}

	private static void afficherMots(int[] mots) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < mots.length; i++) {
			System.out.print(sep + mots[i]);
			sep = ";";
		}
		System.out.println("}");

	}

	private static String[] extractMots(String phrase) {
		int nbMots = commpterMots(phrase);
		String[] mots = new String[nbMots];
		fillMots(mots, phrase);
		return mots;
	}

	private static void fillMots(String[] mots, String phrase) {
		String s = "";
		int indiceTabMots = 0;
		char c;
		phrase = phrase + ".";
		// boolean dansMot = false;

		for (int i = 0; i < phrase.length(); i++) {
			c = phrase.charAt(i);
			if (Character.isLetter(c)) {
				s = s + c;
				// dansMot = true;
			} else {
				// if (dansMot) {
				if (s.length() > 0) {
					// dansMot = false;
					mots[indiceTabMots] = s;
					indiceTabMots++;
					s = "";
				}
			}
		}

	}

	public static int commpterMots(String phrase) {
		int compteur = 0;
		char c;
		boolean dansMot = false;

		for (int i = 0; i < phrase.length(); i++) {
			c = phrase.charAt(i);
			if (Character.isLetter(c)) {
				if (!dansMot) {
					compteur++;
					dansMot = true;
				}
			} else {
				dansMot = false;
			}
		}
		return compteur;
	}

	// suplimentar Cata: extrage un string avant un maxim de caractere identice
	private static String getMaxSuite(String chaine) {
		if (chaine == null || chaine.length() == 0) {
			return "";
		}
		char currentSuiteChar = chaine.charAt(0);
		int currentSuiteLength = 0;
		String currentSuite = "";

		String maxSuite = "";
		int maxSuiteLength = 0;

		char c;

		for (int i = 0; i < chaine.length(); i++) {
			c = chaine.charAt(i);

			if (c == currentSuiteChar) {
				currentSuite = currentSuite + c;
				currentSuiteLength++;
			} else {
				if (currentSuiteLength > maxSuiteLength) {
					maxSuiteLength = currentSuiteLength;
					maxSuite = currentSuite;
				}
				currentSuiteLength = 1;
				currentSuite = "" + c;
				currentSuiteChar = c;
			}
		}
		if (currentSuiteLength > maxSuiteLength) {
			maxSuiteLength = currentSuiteLength;
			maxSuite = currentSuite;
		}

		return maxSuite;
	}

	// gaseste numarul de paliere cu caractere identice
	public static int getNbPalieresCharIdentiques(String chaine) {
		int nbPalieres = 0;
		char currentPaliereChar = chaine.charAt(0);
		int currentPalierLength = 1;
		char currentChar;

		for (int i = 1; i < chaine.length(); i++) {
			currentChar = chaine.charAt(i);
			if (currentChar == currentPaliereChar) {
				currentPalierLength++;
				if (currentPalierLength == 2) {
					nbPalieres++;
				}
			} else {
				currentPaliereChar = currentChar;
				currentPalierLength = 1;
			}
		}

		return nbPalieres;
	}

	// gaseste un substring intr-un string (intarce indicele in stringul mare)

	public static int find(String phrase, String substring) {
		int indiceMax = phrase.length() - substring.length();
		for (int i = 0; i <= indiceMax; i++) {
			if (isMatch(i, phrase, substring)) {
				return i;
			}
		}
		return -1;
	}

	public static boolean isMatch(int index, String string, String substring) {

		boolean matching = true;
		for (int i = 0; i < substring.length(); i++) {
			if (substring.charAt(i) != string.charAt(index + i)) {
				matching = false;
				break;
			}
		}
		return matching;
	}

	// gaseste daca un string e o repetitie a unui substring ("abcabc" e o repetitie
	// a lui "abc")

	public static int isRepetition(String string, String substring) {

		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			char d = substring.charAt(i % substring.length());
			if (c != d) {
				return i;
			}
		}
		return -1;
	}

	public static boolean isRepetition2(String string, String substring) {
		if (string.length() % substring.length() != 0) {
			return false;
		}
		for (int index = 0; index < string.length(); index = index + substring.length()) {
			if (!isMatch(index, string, substring)) {
				return false;
			}
		}
		return true;
	}

	// gaseste daca un cuvant este anagrama altui cuvant (Anca -> canA)

	public static boolean isAnagrame(String mot, String anagrame) {

		if (mot.length() != anagrame.length()) {
			return false;
		}
		for (int i = 0; i < mot.length(); i++) {
			char c = mot.charAt(i);
			int countCharInMot = countChar(c, mot);
			int countCharInAnagrame = countChar(c, anagrame);

			if (countCharInMot != countCharInAnagrame) {
				return false;
			}
		}
		return true;
	}

	public static int countChar(char c, String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				result++;
			}
		}
		return result;

	}

	// extrage cuvintele dintr-un string. Orice caracter ce nu este litera este
	// separator.
	// gaseste indicele cuvintelor.

	public static int countMots2(String phrase) {
		int nbMots = 0;
		boolean dansMot = false;
		phrase = phrase + ".";
		for (int i = 0; i < phrase.length(); i++) {
			char c = phrase.charAt(i);
			if (Character.isLetter(c)) {
				if (!dansMot) {
					nbMots++;
					dansMot = true;
				}
			} else {
				dansMot = false;
			}
		}
		return nbMots;
	}

	public static int countMots3(String phrase) {
		int nbMots = 0;
		String s = "";
		phrase = phrase + ".";
		for (int i = 0; i < phrase.length(); i++) {
			char c = phrase.charAt(i);
			if (Character.isLetter(c)) {
				s = s + c;
			} else {
				if (s.length() != 0) {
					nbMots++;
					s = "";
				}
			}
		}
		return nbMots;
	}

	public static String[] extractMots2(String phrase) {
		int nbMots = countMots2(phrase);
		String[] mots = new String[nbMots];
		String s = "";
		int indexMots = 0;

		for (int i = 0; i < phrase.length(); i++) {
			char c = phrase.charAt(i);
			if (Character.isLetter(c)) {
				s = s + c;
			} else {
				if (s.length() != 0) {
					mots[indexMots] = s;
					indexMots++;
					s = "";
				}
			}

		}
		return mots;
	}

	public static Object[] extractMots3(String phrase) {

		int nbMots = countMots2(phrase);

		String[] mots = new String[nbMots];
		int[] indiceMots = new int[nbMots];
		Object[] result = { mots, indiceMots };

		String s = "";
		int indexMots = 0;

		for (int i = 0; i < phrase.length(); i++) {
			char c = phrase.charAt(i);
			if (Character.isLetter(c)) {
				s = s + c;
			} else {
				if (s.length() != 0) {
					mots[indexMots] = s;
					indiceMots[indexMots] = i - s.length();
					indexMots++;
					s = "";
				}
			}

		}
		return result;
	}

	public static int[] extractIndiceMots2(String phrase, String[] mots) {

		int[] indiceMots = new int[mots.length];
		String s = "";
		int indexMots = 0;
		// int indexStartMot = 0;

		for (int i = 0; i < phrase.length(); i++) {
			char c = phrase.charAt(i);
			if (Character.isLetter(c)) {
				// if (s.equals("")) {
				// indexStartMot = i;
				// }
				s = s + c;
			} else {
				if (s.length() != 0) {
					indiceMots[indexMots] = i - s.length();
					// indiceMots[indexMots] = indexStartMot;
					indexMots++;
					s = "";
				}
			}

		}
		return indiceMots;
	}

	public static int compterDoublons(String[] mots) {
		int compteur = 0;

		for (int i = 0; i < mots.length; i++) {
			for (int j = i + 1; j < mots.length; j++) {
				if (mots[i].equals(mots[j])) {
					compteur++;
					break;
				}
			}
		}
		return compteur;
	}

	public static String[] motsSansDoublons(String[] mots) {
		int nbMotsUniques = mots.length - compterDoublons(mots);
		int indiceTabMotsUniques = -1;
		String[] motsUniques = new String[nbMotsUniques];
		String temp;

		for (int i = 0; i < mots.length; i++) {
			temp = mots[i];
			int indexInMotsUniques = find(motsUniques, temp);
			if (indexInMotsUniques < 0) {
				indiceTabMotsUniques++;
				motsUniques[indiceTabMotsUniques] = temp;
			}
		}
		return motsUniques;
	}

	public static int find(String[] mots, String toFind) {
		for (int i = 0; i < mots.length; i++) {
			if (toFind.equals(mots[i])) {
				return i;
			}
		}
		return -1;
	}

	public static int compterMotInTab(String[] mots, String toFind) {
		int result = 0;
		for (int i = 0; i < mots.length; i++) {
			if (toFind.equals(mots[i])) {
				result++;
			}
		}
		return result;
	}

	public static Object[] createMotsEtIndex(String[] mots, int[] indices) {
		Object[] result = new Object[2];
		String[] motsUniques = motsSansDoublons(mots);
		int[][] motsIndex = new int[motsUniques.length][];
		String temp;
		for (int i = 0; i < motsUniques.length; i++) {
			temp = motsUniques[i];
			int indexLength = compterMotInTab(mots, temp);
			int[] index = new int[indexLength];
		}

		return result;
	}
}
