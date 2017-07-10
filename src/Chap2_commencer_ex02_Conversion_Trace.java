/*
tracer que fait le programme
 */

public class Chap2_commencer_ex02_Conversion_Trace {

	public static void main(String[] args) {
		double euros;
		double francs;
		Terminal.ecrireStringln("Somme en euros? ");
		euros = Terminal.lireDouble();
		francs = euros * 6.559;
		Terminal.ecrireStringln("La somme en francs: " + francs);
	}
}
