/*
Ecrivez un programme qui calcule un carr´e de 10 lignes et 10 colonnes 
o`u chaque case contient le num´ero de colonne suivi du num´ero de ligne.
00 10 20 30 40 50 60 70 80 90 
01 11 21 31 41 51 61 71 81 91 
02 12 22 32 42 52 62 72 82 92 03 13 23 33 43 53 63 73 83 93 04 14 24 34 44 54 64 74 84 94 05 15 25 35 45 55 65 75 85 95 06 16 26 36 46 56 66 76 86 96 07 17 27 37 47 57 67 77 87 97 08 18 28 38 48 58 68 78 88 98 09 19 29 39 49 59 69 79 89 99
 */
public class Exam2012_1_Ex4 {

	public static void main(String[] args) {
		int nbLignes = 10;
		int nbCol = 10;
		String[][] tablou = fillTablou(nbLignes, nbCol);
		printTablou(tablou);
	}

	public static void printLinie(String[] linie){
		String sep="";
		for (int i=0; i<linie.length; i++){
			System.out.print(sep + linie[i]);
			sep = " ";
		}
		System.out.println();
	}
	public static void printTablou (String[][] tab){
		for (int i=0; i<tab.length; i++){
			printLinie(tab[i]);
		}
	}
	public static String[][] fillTablou(int nbLignes, int nbCol) {
		String[][] tab = new String[nbLignes][];
		for (int linie = 0; linie < nbLignes; linie++) {
			tab[linie] = fillLinie(linie, nbCol);
		}
		return tab;
	}

	public static String[] fillLinie(int nrLinie, int nbCol) {
		String[] linie = new String[nbCol];

		for (int col = 0; col < nbCol; col++) {
			linie[col] = "" + col + nrLinie;
		}
		return linie;
	}
}
