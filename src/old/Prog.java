//Compilez puis exécutez ce programme. En vous aidant des messages affichés, identifiez les instructions qui
//les ont produit.


public class Prog {
	public static void main(String[] args) {
		int x;
		boolean b;
		x = 3 + Math.min(2, 3) - 1;
		Terminal.ecrireIntln(Math.min(2, 3));
		Terminal.ecrireCharln(Character.toLowerCase('1'));
		Terminal.ecrireString("Un entier? ");
		x = Terminal.lireInt();
		Terminal.ecrireIntln(x);
	}
}