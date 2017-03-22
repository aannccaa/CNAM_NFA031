/*
Écrivez un programme qui affiche la table de multiplication d’un chiffre. Ce chiffre sera entré
par l’utilisateur. Par exemple, si le chiffre est 3, le programme affiche :
1 x 3 = 3
2 x 3 = 6
3 x 3 = 9
4 x 3 = 12
5 x 3 = 15
6 x 3 = 18
7 x 3 = 21
8 x 3 = 24
9 x 3 = 27
 */

//public class CalculsMultiplication {
//	public static void main (String [] args) {
//		int n, resultatMultiplication;
//		Terminal.ecrireString("Entrez un entier:");
//		n = Terminal.lireInt();
//		for (int i=1; i<=9; i=i+1) {
//		resultatMultiplication = i * n;
//		Terminal.ecrireStringln(i + " x " + n + " = " + resultatMultiplication);
//		}
//	}
//}

/*
Modifiez votre programme pour qu’il vérifie que le nombre entré
par l’utilisateur est bien un chiffre (c’est à dire un nombre compris entre 1 et 9).
 */

public class CalculsMultiplication {
	public static void main(String[] args) {
		int n, resultatMultiplication;
		boolean estChiffre = false;
		String message;
		message = "Entrez un chiffre de 1 à 9:";
		while (estChiffre == false) {
			Terminal.ecrireString(message);
			n = Terminal.lireInt();
			if (n > 0 && n <= 9) {
				estChiffre = true;
				for (int i = 1; i <= 9; i = i + 1) {
					resultatMultiplication = i * n;
					Terminal.ecrireStringln(i + " x " + n + " = " + resultatMultiplication);
				}
			} else {
				estChiffre = false;
			}
		}
	}
}