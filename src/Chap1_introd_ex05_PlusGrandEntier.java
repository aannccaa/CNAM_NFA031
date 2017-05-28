/*
Calculer puis afficher le plus grand parmi trois nombres entiers.
 */

public class Chap1_introd_ex05_PlusGrandEntier {

	public static void main(String[] args) {
		int a = -3;
		int b = -33;
		int c = 30;
		int max;

		// j'intialise max avec un des nombre et je le compare succéssivement
		// avec les 2 autres. Si un des 2 nombre > Max, Max mémorise sa valeur.
		max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println("Max = " + max);
	}

}
