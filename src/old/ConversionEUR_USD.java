/*
convertir une somme en euros en une somme en dollars 
avec le taux de change de 1 euro pour 1,30 dollars
*/

public class ConversionEUR_USD {
	public static void main(String[] args) {
		double USD, EUR, taux;

		Terminal.ecrireString("EUR ?: ");
		EUR = Terminal.lireDouble();
		Terminal.ecrireString("taux de change EUR/USD ?: ");
		taux = Terminal.lireDouble();
		USD = EUR * taux;
		Terminal.ecrireString("EUR -> USD =" + USD);
	}
}
