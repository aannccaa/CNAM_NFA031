/*
Écrivez un programme qui calcule x^y où x et y sont deux entiers 
saisis au clavier. Pour cela il faut multiplier y fois le produit de x. 
Par exemple 2^3 = .
*/

public class Puissances {
	public static void main (String[] args) {
		int x, y, puissance=1;
		Terminal.ecrireString("Entrez x, comme entier positif: ");
		x = Terminal.lireInt();
		Terminal.ecrireString("Entrez y, comme entier positif: ");
		y = Terminal.lireInt();
		if (y==0) {
			puissance = 1;
		}
			if (x==0) {
				puissance = 0;
			}
			else {
		for(int i=0; i<y; i++ ) {
		puissance = puissance*x;
		}
		}
		Terminal.ecrireStringln("x^y = " + puissance);
	}	
}