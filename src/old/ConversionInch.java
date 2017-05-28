//convertit une longueur en inch en une longueur en centimetres
public class ConversionInch {
	public static void main (String[] args){
		double inch, cm;
		Terminal.ecrireStringln("Longueur en inch? ");
		inch = Terminal.lireDouble();
		cm = inch*2.54;
			Terminal.ecrireStringln("La longeur en cm: "+ cm);
	}
}