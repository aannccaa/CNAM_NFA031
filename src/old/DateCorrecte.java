/*
 Écrivez un programme qui saisit une date correcte sous la forme de trois entiers (jour, mois et
année). Le programme doit tester si la date est correcte, et si ce n’est pas le cas, doit signaler le type
d’erreur rencontrée, puis demander une nouvelle saisie. Le programme finit lorsqu’une date correcte
est enfin saisie, avec l’affichage de celle-ci. Dans le cas où le mois de la date est février, votre programme
devra calculer si l’année est bissextile. De manière générale, il devra calculer le nombre de
jours maximal du le mois de la date saisie, de manière à valider le numéro de jour qui a été saisi. 
 */

public class DateCorrecte {

	public static int readInteger(String question, String erreur, int borneInf, boolean useInf, int borneSup,
			boolean useSup) {
		while (true) {
			Terminal.ecrireStringln(question + " : ");
			int result;
			try {
				result = Terminal.lireInt();
			} catch (Exception e) {
				continue;
			}

			if (useInf && result < borneInf) {
				Terminal.ecrireStringln(erreur + " >= " + borneInf);
				continue;
			}
			if (useSup && result > borneSup) {
				Terminal.ecrireStringln(erreur + " <=  " + borneSup);
				continue;
			}

			return result;
		}
	}

	public static void main(String[] args) {

		int annee = readInteger("Entrez une année", "L'année doit être", 0, true, -1, false);
		int mois = readInteger("Entrez un mois", "Le mois doit être", 1, true, 12, true);

		int nbJoursMax = getMaxJoursDansMois(annee, mois);

		int jour = readInteger("Entrez un jour", "Le jour doit être", 1, true, nbJoursMax, true);

		Terminal.ecrireStringln(jour + " / " + mois + " / " + annee);
	}
	private static int[] joursDansLeMois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	private static int getMaxJoursDansMois(int annee, int mois) {
		
		int nbJoursMax = joursDansLeMois[mois - 1];
		if (mois == 2) {
			if (estBissextile(annee)) {
				nbJoursMax = nbJoursMax + 1;
			}
		}
		return nbJoursMax;
	}

	private static boolean estBissextile(int annee) {
		boolean bissextile = ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0));
		return bissextile;
	}
}

// corrigé officiel:
// class DateCorrecte {
// /*
// * Sasit une date et teste si elle correcte. Demande une nouvelle saisie
// * tant que la date est incorrecte et signale l’erreur eventuelle (1 erreur
// * a la fois).
// */
// public static void main(String[] args) {
// int jour;
// int mois;
// int annee;
// boolean dateOK = false;
//
// do {
// Terminal.ecrireString("Donnez un jour: ");
// jour = Terminal.lireInt();
// Terminal.ecrireString("Donnez un mois: ");
// mois = Terminal.lireInt();
// Terminal.ecrireString("Donnez une annee: ");
// annee = Terminal.lireInt();
// if (annee <= 0) {
// Terminal.ecrireStringln("L’annee doit etre positive.");
// } else if (mois < 1 || mois > 12) {
// Terminal.ecrireStringln("Le mois doit etre compris entre 1..12");
// } else {
// int nbJours;
// if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
// nbJours = 30;
// } else if (mois == 2) {
// boolean bissextile = (annee % 4 == 0) && !(annee % 100 == 0) || (annee % 400
// == 0);
// if (bissextile)
// nbJours = 29;
// else
// nbJours = 28;
// } else {
// nbJours = 31;
// }
// if (jour < 1 || jour > nbJours) {
// Terminal.ecrireString("Numero de jour incorrect: pour le mois " + mois);
// Terminal.ecrireString(" de l’annee " + annee);
// Terminal.ecrireStringln(", le jour doit etre compris entre 1.." + nbJours);
// } else {
// dateOK = true;
// }
// }
// } while (!dateOK);
// Terminal.ecrireString("La date saisie est ");
// Terminal.ecrireInt(jour);
// Terminal.ecrireString(" / ");
// Terminal.ecrireInt(mois);
// Terminal.ecrireString(" / ");
// Terminal.ecrireIntln(annee);
// }
// }