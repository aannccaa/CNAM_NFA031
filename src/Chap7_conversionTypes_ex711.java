/*
Exercice 7.1.1 conversion de String vers int
Ecrire une méthode appelée stringToInt qui réalise la conversion d’une chaîne de caractère 
de la même façon que la méthode prédéfinie Integer.parseInt, c’est-à-dire qui renvoie 
la valeur numérique de la chaîne si celle-ci représente un nombre entier et qui provoque 
une erreur dans les autres cas (par exemple si la chaîne contient des lettres). 
Vous vous assurerez que la méthode fonctionne également pour des nombres négatifs.
Vous pourrez utiliser les deux méthodes Character.isDigit qui détermine si un caractère 
est un chiffre et Character.getNumericValue qui renvoie la valeur numérique d’un chiffre 
pour faire ce programme. Ces dexu méthodes prennent un caractère en paramètre.
 */
public class Chap7_conversionTypes_ex711 {

	public static void main(String[] args) {

		String chaine = "-123";
		int chaine2int = stringToInt(chaine);
		System.out.println(power(10, 2));
		System.out.println(chaine + " => " + chaine2int);

		int number = -4123;
		String ns = int2str2(number);
		System.out.println(ns);
		
		ns = int2str(number);
		System.out.println(ns);

	}

	public static int stringToInt(String chaine) {
		if (chaine.length() == 0) {
			throw new Error("empty string is not a number");
		}
		char c = chaine.charAt(0);
		int sign;
		if (c == '-') {
			chaine = chaine.substring(1);
			sign = -1;
		} else {
			sign = 1;
		}
		int result = 0;
		int longueurString = chaine.length();
		for (int i = 0; i < longueurString; i++) {
			c = chaine.charAt(i);
			if (!Character.isDigit(c)) {
				throw new Error("not a number");
			}

			int val = Character.getNumericValue(c);
			result = result + val * power(10, longueurString - i - 1);
		}
		return result * sign;
	}

	public static int power(int base, int exp) {
		int result = 1;
		for (int i = 0; i < exp; i++) {
			result = result * base;
		}
		return result;
	}

	public static char digit2chr(int digit) {
		return (char) (digit + (int) '0');
	}

	public static String reverse(String s) {
		String reversedStr = "";
		for (int i = s.length()-1; i >= 0; i--) {
			reversedStr = reversedStr + s.charAt(i);
		}
		return reversedStr;
	}

	public static String int2str(int n) {
		boolean isNegative = n <0;
		if(isNegative) {
			n = -n; 
		}
		String s = "";
		while (n >= 10) {
			int digit = n % 10;
			char digitChr = digit2chr(digit);
			s = s + digitChr;
			n = n / 10;
		}
		s = s + digit2chr(n);
		
		s = reverse(s);
		if(isNegative) {
			s = "-" + s;
		}
		return s;
	}
	
	public static int getLength(int n) {
		if(n == 0) {
			return 1;
		}
		int result = 0;
		int power = 1;
		while(n >= power) {
			result++;
			power = power*10;
		}
		return result;
	}
	
	public static String int2str2(int n) {
		String result = "";
		if(n < 0) {
			n = -n;
			result = "-";
		}
		int l = getLength(n);
		while(l > 0) {
			int pow10 = power(10, l-1);
			int d = n / pow10;
			result = result + digit2chr(d);
			n = n - d * pow10;
			l = l - 1;
		}
		return result;
	}

}
