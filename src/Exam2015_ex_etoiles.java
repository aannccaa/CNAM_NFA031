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
Dans le programme le nombre de lignes affichee est entr ´ e au clavier. Le dessin ci-dessus repr ´ esente le ´
cas ou ce nombre vaut 7.
*/

public class Exam2015_ex_etoiles {
	public static void main(String[] args) {

		System.out.print(etoilles2(7));
	}

	public static String etoiles(int nbLignes) {
		String result = "";
		boolean isPair;

		for (int i = 0; i < nbLignes; i++) {
			isPair = (i % 2 == 0);
			if (isPair) {
				result = result + "* * * *";
			} else {
				result = result + "  * *  ";
			}
			result = result + "\n";
		}

		return result;
	}

	public static String etoilles2(int nbLignes) {
		String result = "";
		int nbCols = nbLignes;
		for (int i = 0; i < nbLignes; i++) {
			int noLigne = i;
			//
			String ligne = getLigneContentSah(noLigne, nbCols);
			// String ligne = getLigneContent(noLigne, nbCols);
			result = result + ligne + "\n";
		}
		return result;
	}
	// public static String getLigneContent(int noLigne){
	// if (noLigne % 2 == 0) {
	// return "* * * *";
	// } else {
	// return " * * ";
	// }
	// }

	// umple un string cu un caracter dat de n ori
	public static String fill(int n, char c) {
		String result = "";

		for (int i = 0; i < n; i++) {
			result = result + c;
		}
		return result;
	}

	public static String replace(String s, int pos, char newChr) {
		String result = s.substring(0, pos) + newChr + s.substring(pos + 1);

		return result;
	}

	// deseneaza pe diagonala o steluta
	// *
	// *
	// *
	public static String getLigneContent(int noLigne, int nbCols) {
		String result;
		result = fill(nbCols - noLigne - 1, '-') + '*' + fill(noLigne, '-');
		return result;
	}

	// deseneaza pe 2 diagonale o steluta

	public static String getLigneContent2Diag(int noLigne, int nbCols) {
		String ligne = fill(nbCols, '-');
		int posXDiagonala1 = noLigne;
		ligne = replace(ligne, posXDiagonala1, '*');
		int posXDiagonala2 = nbCols - noLigne - 1;
		ligne = replace(ligne, posXDiagonala2, '*');
		return ligne;
	}
	// deseneaza deasupra diagonalei (de la dreapta la stanga) o steluta

	public static String getLigneContentDeasupraDiagDreaptaStanga(int noLigne, int nbCols) {
		String result;
		result = fill(nbCols - noLigne, '*') + fill(noLigne, '-');
		return result;
	}

	// deseneaza deasupra diagonalei (de la stanga la dreapta) o steluta

	public static String getLigneContentSubDiagDreaptaStanga(int noLigne, int nbCols) {
		String result;
		result = fill(nbCols - noLigne - 1, '-') + fill(noLigne + 1, '*');
		return result;
	}

	// deseneaza deasupra diagonalei (de la stanga la dreapta) o steluta

	public static String getLigneContentDeasupraDiagStangaDreapta(int noLigne, int nbCols) {
		String result;
		result = fill(noLigne, '-') + fill(nbCols - noLigne, '*');
		return result;
	}

	// deseneaza sub diagonalei (de la stanga la dreapta) o steluta

	public static String getLigneContentSubDiagStangaDreapta(int noLigne, int nbCols) {
		String result;
		result = fill(noLigne + 1, '*') + fill(nbCols - noLigne - 1, '-');
		return result;
	}

	// deseneaza o tabla de sah o steluta da, una nu (* * *)

	public static String getLigneContentSah(int noLigne, int nbCols) {
		String result = "";
		boolean isPair = (noLigne % 2 == 0);
		char current;
		if (isPair) {
			current = '*';
		} else {
			current = '-';
		}
		for (int i = 0; i < nbCols; i++) {
			result = result + current;
			if (current == '*') {
				current = '-';
			} else {
				current = '*';
			}
		}

		return result;
	}
}