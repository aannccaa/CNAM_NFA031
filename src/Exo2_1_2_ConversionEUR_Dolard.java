/*
Calculer la conversion en dollars d’une somme en euros saisie au clavier
en donnant le cours du dollar 1 USD = 0.9272 EUR
 */
//public class Exo2_1_2_ConversionEUR_Dolard {
//	public static void main(String[] args) {
//		double euros, dollar, cours;
//		Terminal.ecrireStringln("Cours du dollar/eur (valeur de 1 dollar en EUR)? ");
//		cours = Terminal.lireDouble();
//		Terminal.ecrireStringln("Somme en euros? ");
//		euros = Terminal.lireDouble();
//		dollar = euros / cours;
//		Terminal.ecrireStringln("La somme convertie en dolars: " + dollar);
//	}
//}

/*
 * Modifiez ce programme pour que pour un cours du dollar donné (et qui ne change pas pendant
l’exécution du programme), on puisse convertir plusieurs sommes. Prévoyez un moyen d’arrêter l’exécution
du programme.
 */
public class Exo2_1_2_ConversionEUR_Dolard {
	public static void main(String[] args) {
		double euros = 1, dollar = 1, cours;
		Terminal.ecrireStringln("Cours dollar/eur (valeur de 1 USD en EUR)? ");
		cours = Terminal.lireDouble();

		while (euros != 0) {
			Terminal.ecrireStringln("Somme en euros? ");
			euros = Terminal.lireDouble();

			if (euros == 0) {
				Terminal.ecrireStringln("Programme stoppé");
				break;
			}

			dollar = euros / cours;
			Terminal.ecrireStringln("La somme convertie en USD: " + dollar);

		}

	}
}
