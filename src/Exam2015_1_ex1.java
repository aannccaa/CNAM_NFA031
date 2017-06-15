/*
Ecrivez un programme qui fasse un petit dessin de ce genre :
*
**
***
****
*****
****
***
**
*
Dans le programme le nombre maximal d’´etoiles afﬁch´ees 
* sur une ligne est entr´e au clavier. Le dessin ci-dessus repr´esente le cas o`u ce nombre vaut 5. 
* Vous ferez attention de placer le(s) saut(s) de ligne au(x) bon(s) endroits(s).
 */
public class Exam2015_1_ex1 {

	public static void main(String[] args) {
		int nbMaxEtoiles = 5;
		String l = fillChar(3, '*');
		System.out.println(l);

		var3(nbMaxEtoiles);

	}

	public static String fillChar(int n, char c){
		String resultat;
		if(n <= 0){
			resultat = "";
		} else {
			resultat = fillChar(n-1, c) + c;
		}
		return resultat;
	}
	
	
	// fc care constuieste o linie de n stelute
	public static String buildString(int n, char c) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + c;
		}
		return result;
	}

	public static void var3(int nbMaxEtoiles) {
		String linie;
		for (int i=1; i<=nbMaxEtoiles; i++){
			linie = buildString(i, '*');
			System.out.println(linie);
		}
		for (int i=nbMaxEtoiles-1; i>0; i--){
			linie = buildString(i, '*');
			System.out.println(linie);
		}
	}

	private static void var2(int nbMaxEtoiles) {
		String linie = "";
		String[] tab = new String[nbMaxEtoiles];
		for (int i = 0; i < nbMaxEtoiles; i++) {
			linie = linie + "*";
			tab[i] = linie;
			System.out.println(linie);
		}

		for (int i = nbMaxEtoiles - 2; i >= 0; i--) {
			linie = tab[i];
			System.out.println(linie);

		}
	}

	private static void var1(int nbMaxEtoiles) {
		String linie = "";
		for (int i = 0; i < nbMaxEtoiles; i++) {
			linie = linie + "*";
			System.out.println(linie);
		}

		for (int i = nbMaxEtoiles - 1; i > 0; i--) {
			linie = linie.substring(0, i);
			System.out.println(linie);
		}
	}

}
