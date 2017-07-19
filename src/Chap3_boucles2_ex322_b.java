/*
 Designer un triangle pointe en haut, on demandera à l’utilisateur de rentrer le nombre de lignes. 
 Pour chaque ligne, il faudra afficher un certain nombre d’espaces, 
 puis un certain nombre d’étoiles, puis un New_Line. 
 Vous devrez mettre en évidence une relation entre le numéro de ligne , 
 la taille et le nombre d’espace et une autre relation entre le numéro de ligne , 
 la taille et le nombre d’étoiles.
 
   *
  ***
 *****
*******

 */

public class Chap3_boucles2_ex322_b {

	public static void main(String[] args) {
		int n = 4;
		String etoiles = "";
		String espaces = "";
		
		

		// System.out.print("Donner le nb de lignes");
		// n = Lire.i();

		for (int i = 0; i < n; i++) {
			int nbEtoilesParLigne = i * 2 + 1;
			int nbEspacesParLigne = 2*n - nbEtoilesParLigne;
			espaces = fillChar(' ', nbEspacesParLigne/2);
			etoiles = fillChar('*', nbEtoilesParLigne);
			System.out.println(espaces + etoiles);
		}

		
	}
	
 public static String fillChar(char c, int count) {
	 String result = "";
	 for (int i=0; i<count; i++) {
		 result = result + c;
	 }
	 return result;
 }
}
