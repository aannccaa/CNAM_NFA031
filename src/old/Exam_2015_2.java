/*
Ecrivez un programme qui fasse un petit dessin de ce genre :
****
 **
****
 **
****
 **
****
Une ligne sur deux, il y a 4 etoiles, sur les autres lignes, il y en a deux, d ´ ecal ´ ees d’un espace. ´
Dans le programme le n
 */

package old;

public class Exam_2015_2 {

	public static void main(String[] args) {
		int nbLignes = 7;
		int lungimeLinie = 5;
		printStar(nbLignes, lungimeLinie);

	}

	public static String produceLinie(int nrLinie, int lungimeLinie) {
		String linie;
		linie = "";
		char[] model = new char[3];

		model[0] = '1';
		model[1] = '2';
		model[2] = '3';

		int indexPrimulCaracter = nrLinie % 3;

		for (int i = 0; i < lungimeLinie; i++) {
			int indexCaracter = (indexPrimulCaracter + i) % 3;
			linie = linie + model[indexCaracter];

		}

		return linie;
	}

	public static void printStar(int nbLignes, int lungimeLinie) {
		String linie;
		for (int i = 0; i < nbLignes; i++) {
			linie = produceLinie(i, lungimeLinie);
			System.out.println(linie);
		}
	}

	public static boolean ePar(int n) {
		boolean ePar;
		if (n % 2 == 0) {
			ePar = true;
		} else {
			ePar = false;
		}
		return ePar;
	}

}
