//Calculer puis afficher le plus grand parmi trois nombres entiers.
public class LePlusGrandEntier {
	public static void main(String[] args) {
		int n1, n2, n3, max;
		Terminal.ecrireString("entrer l'entier n1: ");
		n1 = Terminal.lireInt();
		Terminal.ecrireString("entrer l'entier n2: ");
		n2 = Terminal.lireInt();
		Terminal.ecrireString("entrer l'entier n3: ");
		n3 = Terminal.lireInt();

		if (n1 < n2) {
			max = n2;
		} else {
			max = n1;
		}
		if (n3 > max) {
			max = n3;
		}
		Terminal.ecrireString("Max = " + max);
	}
}