/*
Exercice 4.1.3 nombre de lettres dans un tableau
Ecrire un programme qui saisit 10 caractères au clavier, puis ensuite, 
calcule le nombre de majuscules, et le nombre de lettres dans ce tableau. 
Un caractère n’est pas forcément une lettre: ce peut être un chiffre, 
un signe de ponctuation, un caractère spécial.
Question 1
Pour cette question, on ne considère que les lettres sans accent. 
Pour déterminer si un caractère est une lettre, on utilise l’ordre sur les caractères. 
Est une lettre tout caractère compris entre ’a’ et ’z’ et entre ’A’ et ’Z’. 
Est une majuscule tout caractère compris entre ’A’ et ’Z’.
Question 2
Ecrire le même programme en utilisant les deux méthodes suivantes pour déterminer si 
un caractère est une lettre et une majuscule.
– Character.isLetter qui prend en paramètre un caractère et renvoie un boolean.
– Character.isUppercase qui prend en paramètre un caractère et renvoie un boolean.
 */
public class Chap4_tab1_ex413 {

	public static void main(String[] args) {
		int n = 4;
		String s = "1234";
		System.out.println(stringToInt(s));

		System.out.println(stringValue("1234"));
		// char[] tab = creerTab(n);
		char[] tab = { 'a', '1', 'b', 'B', 'C', '+', 'c', 'd', 'y', 'Y' };
		afficherTab(tab);

		int nbLettres = compterLettres2(tab);
		System.out.println("Le nombre de lettres est " + nbLettres);

		int nbMajuscules = compterMajuscules2(tab);
		System.out.println("Le nombre de majuscules est " + nbMajuscules);

		nbLettres = compterLettres1(tab);
		System.out.println("Le nombre de lettres est " + nbLettres);

		nbMajuscules = compterMajuscules1(tab);
		System.out.println("Le nombre de majuscules est " + nbMajuscules);

		char[] maj = new char[tab.length];
		for (int i = 0; i < tab.length; i++) {
			maj[i] = toUppercase(tab[i]);
		}

		afficherTab(maj);

		char[] min = new char[tab.length];
		for (int i = 0; i < tab.length; i++) {
			min[i] = toLowerCase(tab[i]);
		}

		afficherTab(min);

	}

	public static char[] creerTab(int n) {
		char c;
		char[] tab = new char[n];
		for (int i = 0; i < tab.length; i++) {
			System.out.print("Donner le charactère " + i + " : ");
			c = Lire.c();
			tab[i] = c;
		}

		return tab;
	}

	public static void afficherTab(char[] tab) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = ";";
		}
		System.out.println("}");
	}

	public static int compterLettres2(char[] tab) {
		int nbLettres = 0;

		for (int i = 0; i < tab.length; i++) {
			if (Character.isLetter(tab[i])) {
				nbLettres++;
			}
		}
		return nbLettres;
	}

	public static int compterMajuscules2(char[] tab) {
		int nbMajuscules = 0;

		for (int i = 0; i < tab.length; i++) {
			if (Character.isLetter(tab[i]) && Character.isUpperCase(tab[i])) {
				nbMajuscules++;
			}
		}
		return nbMajuscules;
	}

	public static boolean isMinuscule(char c) {

		boolean isMinuscule = (c >= 'a') && (c <= 'z');

		// variante
		if ((c >= 'a') && (c <= 'z')) {
			isMinuscule = true;
		} else {
			isMinuscule = false;
		}

		return isMinuscule;
	}

	public static boolean isMajuscule(char c) {
		boolean isMajuscule;

		if ((c >= 'A') && (c <= 'Z')) {
			isMajuscule = true;
		} else {
			isMajuscule = false;
		}

		return isMajuscule;
	}

	public static boolean isLetter(char c) {
		boolean isLetter;
		isLetter = isMinuscule(c) || isMajuscule(c);

		return isLetter;

	}

	public static int compterLettres1(char[] tab) {
		int nbMinuscules = 0;

		for (int i = 0; i < tab.length; i++) {
			if (isLetter(tab[i])) {
				nbMinuscules++;
			}
		}
		return nbMinuscules;
	}

	public static int compterMajuscules1(char[] tab) {
		int nbMajuscules = 0;

		for (int i = 0; i < tab.length; i++) {
			if (isMajuscule(tab[i])) {
				nbMajuscules++;
			}
		}
		return nbMajuscules;
	}

	// transform to upperCase

	public static char toUppercase(char c) {
		char u;
		if (isMinuscule(c)) {
			if (c == 'a') {
				u = 'A';
			} else if (c == 'b') {
				u = 'B';
			} else {
				int difaA = (int) 'a' - (int) 'A';
				int ordMaj = (int) c - difaA;
				u = (char) ordMaj;
			}
		} else {
			u = c;
		}
		return u;
	}

	public static char toLowerCase(char c) {
		char l;
		int difMinMaj;
		int ordreL;
		if (isMajuscule(c)) {
			difMinMaj = (int) 'a' - (int) 'A';
			ordreL = (int) c + difMinMaj;
			l = (char) ordreL;
		} else {
			l = c;
		}

		return l;
	}

	// isDigit
	public static boolean isDigit(char c) {
		boolean isDigit = ((c >= '0') && (c <= '9'));

		if ((c >= '0') && (c <= '9')) {
			isDigit = true;
		} else {
			isDigit = false;
		}
		return isDigit;
	}

	public static int digitValue(char c) {
		int val;
		if (!isDigit(c)) {
			val = '0';
		} else {
			val = (int) c - (int) '0';
		}
		return val;

	}

	public static int stringValue(String s) {
		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			result = result * 10 + digitValue(s.charAt(i));
		}

		return result;
	}

	public static int power(int x, int y) {
		int power = 1;
		for (int i = 0; i < y; i++) {
			power = power * x;
		}

		return power;
	}

	// 1234 = 1*10^3 + 2*10^2 + 3*10^1 + 4*10^0
	public static int stringToInt(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			int d = digitValue(s.charAt(i));
			int exp = s.length() - i - 1;
			result = result + d * power(10, exp);
		}

		return result;
	}
}
