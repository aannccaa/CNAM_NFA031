/*
Exercice 7.1.3 conversion de chiffres romains
Les nombres romains sont des nombres écrits au moyen de lettres qui peuvent être 
considérées comme les chiffres de ce mode de notation. Chaque lettre est associée 
à un nombre qui s’ajoute ou se retranche selon la position du chiffre dans le nombre.
Voici la correspondance entre lettres et valeurs numériques:
lettre: I	V	X	L	C	D	M
valeur:	1	5	10	50	100	500	1000

Question 1 conversion de chiffre
Ecrire une méthode qui convertit un chiffre romain donné au moyen d’un caractère 
du type char vers la valeur nuérique correspondante (type int). Dans le cas où 
le caractère n’est pas une des sept lettres utilisée par les nombres romain, 
la méthode doit provoquer une erreur.

Question 2 conversion de nombre
Voici l’explication du système d’écriture donné par l’encylopédie wikipedia: 
Pour connaître la valeur d’un nombre écrit en chiffres romains, il faut lire 
le nombre de droite à gauche, il suffit d’ajouter la valeur du chiffre, sauf s’il est 
inférieur au précédent, dans ce cas, on le soustrait. Ainsi :
– XVI=1+5+10=16;
– XIV=5-1+10=14,car I est inférieur a ̀V;
– DIX=10-1+500=509,car I est inférieur a ̀X;
– MMMCMXCIX=10-1+100-10+1000-100+1000*3=3999;
Ecrire une méthode qui convertit un nombre romain écrit dans une String en une valeur numérique
de type int. Il sera utile de faire appel à la méthode écrite à la question précédente.
 */
public class Chap7_conversionTypes_ex713 {

	public static void main(String[] args) {

		// Q1
		 char chiffreRomain = introduireChiffreRomain();
		 int chiffreArabe = conversionChiffreRomain(chiffreRomain);
		 System.out.print("Conversion chiffre romain => " + chiffreRomain + " = " +
		 chiffreArabe);

		// Q2
		int nombreArabe;
		do {
			String nombreRomain = introduireNumeroRomain();
			nombreArabe = conversionNombreRomain(nombreRomain);
			System.out.println("Conversion nb. romain => " + nombreRomain + " = " + nombreArabe);
		} while (nombreArabe > 0);

	}

	public static char introduireChiffreRomain() {
		char chiffreRomain;
		boolean estChiffreCorrect;

		do {
			System.out.print("Donner un chiffre romain : ");
			chiffreRomain = Lire.c();
			if ((chiffreRomain != 'I') && (chiffreRomain != 'V') && (chiffreRomain != 'X') && (chiffreRomain != 'L')
					&& (chiffreRomain != 'C') && (chiffreRomain != 'D') && (chiffreRomain != 'L')
					&& (chiffreRomain != 'M')) {
				estChiffreCorrect = false;
				System.out.println("saisie incorrecte");
			} else {
				estChiffreCorrect = true;
			}

		} while (!estChiffreCorrect);

		return chiffreRomain;
	}

	public static boolean estChiffreRomain(char c) {
		boolean result = false;
		for (int i = 0; i < CR.length; i++) {
			if (CR[i] == c) {
				result = true;
				break;
			}
		}
		return result;
	}

	public static String introduireNumeroRomain() {

		boolean estNbCorrect;
		String nbRomain;

		do {
			System.out.print("Donner un numero romain : ");
			nbRomain = Lire.S();
			estNbCorrect = true;
			for (int i = 0; i < nbRomain.length(); i++) {
				char chiffreRomain = nbRomain.charAt(i);
				if (!estChiffreRomain(chiffreRomain)) {
					estNbCorrect = false;
					System.out.println("saisie incorrecte");
				}
			}
		} while (!estNbCorrect);

		return nbRomain;
	}

	public static char[] CR = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	public static int[] CRV = { 1, 5, 10, 50, 100, 500, 1000 };

	public static int getCRV(char c) {
		for (int i = 0; i < CR.length; i++) {
			if (c == CR[i]) {
				return CRV[i];
			}
		}
		return 0;
	}

	public static int conversionChiffreRomain(char c) {
		int result = 0;
		if (c == 'I') {
			result = 1;
		}
		if (c == 'V') {
			result = 5;
		}
		if (c == 'X') {
			result = 10;
		}
		if (c == 'L') {
			result = 50;
		}
		if (c == 'C') {
			result = 100;
		}
		if (c == 'D') {
			result = 500;
		}
		if (c == 'M') {
			result = 1000;
		}

		return result;
	}

	public static int conversionNombreRomain(String nombreRomain) {
		int nombreArabe = 0;
		int longueurNombreRomain = nombreRomain.length();
		int temp = 0;

		for (int i = longueurNombreRomain - 1; i >= 0; i--) {
			char chiffreRomainCourrant = nombreRomain.charAt(i);
			// int chiffreArabe = conversionChiffreRomain(chiffreRomainCourrant);
			int chiffreArabe = getCRV(chiffreRomainCourrant);
			if (chiffreArabe < temp) {
				nombreArabe = nombreArabe - chiffreArabe;
			} else {
				nombreArabe = nombreArabe + chiffreArabe;
			}
			temp = chiffreArabe;
		}
		return nombreArabe;
	}

}
