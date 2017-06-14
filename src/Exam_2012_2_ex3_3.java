/*
 Ecrivez un programme qui affiche un carre de 10 lignes et 10 colonnes o ´ u la premi ` ere cas contient 1 et `
ensuite chaque case contient 1 de plus que la prec´ edente.
 */
public class Exam_2012_2_ex3_3 {

	public static void main(String[] args) {
		// varianta1();
		varianta2();
	}

	public static void varianta2() {
		int nrLinii = 10;
		int nrCol = 10;
		int primulNumar = 1;
		int lungimeFormatare = 3;
		int colCurenta = 0;
		int linieCurenta = 0;
		String sep = "";

		for (int i = primulNumar; linieCurenta < nrLinii; i++) {
			System.out.print(sep + formateaza(i, lungimeFormatare));
			sep = " ";
			colCurenta++;
			if (colCurenta == nrCol) {
				System.out.println();
				linieCurenta++;
				sep = "";
				colCurenta = 0;
			}

		}
	}

	public static void varianta1() {
		int nrLinii = 10;
		int nrCol = 10;
		int primulNumar = 1;
		int nrMax = nrLinii * nrCol - 1 + primulNumar;
		int lungimeFormatare = lungimeNr(nrMax);

		int[][] tab = new int[nrLinii][nrCol];

		for (int i = 0; i < nrLinii; i++) {
			for (int j = 0; j < nrCol; j++) {
				tab[i][j] = i * nrCol + j + primulNumar;
			}
		}
		for (int i = 0; i < nrLinii; i++) {
			String sep;
			sep = "";
			for (int j = 0; j < nrCol; j++) {
				System.out.print(sep + formateaza(tab[i][j], lungimeFormatare));
				sep = " ";
			}
			System.out.println();

		}
	}

	public static String formateaza(int n, int lungime) {
		int lungimeNr = lungimeNr(n);
		int spatiiDeIntrodus = lungime - lungimeNr;
		String spatiu = "";
		for (int i = 0; i < spatiiDeIntrodus; i++) {
			spatiu = spatiu + " ";
		}
		return spatiu + n;
	}

	public static int lungimeNr(int nr) {
		String numarString = "" + nr;

		return numarString.length();
	}
}
