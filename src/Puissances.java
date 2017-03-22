/*
Écrivez un programme qui calcule x^y où x et y sont deux entiers 
saisis au clavier. Pour cela il faut multiplier y fois le produit de x. 
Par exemple 2^3 = 1 ∗ 2 ∗ 2 ∗ 2.
*/

public class Puissances {
	public static void main (String[] args) {
		int x, y, Puissance=100;
		Terminal.ecrireString("Entrez x, comme entier: ");
		x = Terminal.lireInt();
		Terminal.ecrireString("Entrez y, comme entier: ");
		y = Terminal.lireInt();
		for(int i=0; i<y; i++ ) {
		Puissance = Puissance*x;
		}
		Terminal.ecrireStringln("x^y = " + Puissance);
	}
	
}