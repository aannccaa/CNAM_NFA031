
public class repet {

	public static void main(String[] args) {
		int nbLinii = 10;
		int nbCol = 10;
		String[][] tab = fillTablou(nbLinii, nbCol);
		printTab(tab);
	}
	
	public static void printLinie(String[] linie){
		String sep="";
		for(int col=0; col<linie.length; col++){
			System.out.print(sep + linie[col]);
			sep = " ";
		}
		System.out.println();
	}
	
	public static void printTab(String[][] tab){
		
		for(int linie=0; linie<tab.length; linie++){
			printLinie(tab[linie]);
		}
	}
	public static String[] fillLinie(int nrLinie, int nbCol) {
		String[] linie = new String[nbCol];
		for(int col=0; col<nbCol; col++){
			//char c= (char) (Character.valueOf('A')  + col);
			char c= (char) ((int)'A'  + col);
			linie[col] = "" + c + nrLinie;
		}
		return linie;
	}

	public static String[][] fillTablou(int nbLinii, int nbCol) {
		String[][] tab = new String[nbLinii][];
		for (int linie = 0; linie < nbLinii; linie++) {
			tab[linie] = fillLinie(linie, nbCol);
		}
		return tab;
	}

}
