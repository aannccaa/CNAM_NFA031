//Calculer et afficher la conversion en francs d’une somme en euros saisie au clavier.

public class Conversion2 {
	public static void main (String[] args){
		double euros, francs;
		Terminal.ecrireStringln("Somme en euros? ");
		euros = Terminal.lireDouble();
		francs = euros*6.559;
			Terminal.ecrireStringln("La somme en francs: "+ francs);
	}
}