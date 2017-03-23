/*
 Écrivez un programme qui saisit une date correcte sous la forme de trois entiers (jour, mois et
année). Le programme doit tester si la date est correcte, et si ce n’est pas le cas, doit signaler le type
d’erreur rencontrée, puis demander une nouvelle saisie. Le programme finit lorsqu’une date correcte
est enfin saisie, avec l’affichage de celle-ci. Dans le cas où le mois de la date est février, votre programme
devra calculer si l’année est bissextile. De manière générale, il devra calculer le nombre de
jours maximal du le mois de la date saisie, de manière à valider le numéro de jour qui a été saisi. 
 */

public class DateCorrecte {
	public static void main(String[] args) {
		int jour, mois, annee;
		boolean dateOK = false;

		do {
			Terminal.ecrireStringln("Entrez un jour? :");
			jour = Terminal.lireInt();
			Terminal.ecrireStringln("Entrez un mois?: ");
			mois = Terminal.lireInt();
			Terminal.ecrireStringln("Entrez une année? : ");
			annee = Terminal.lireInt();

			if (annee <= 0) {
				System.out.println("L'année doit être positive!");
			} else if (mois < 0 && mois > 12) {
				System.out.println("Le mois doit être entre 1 et 12");

			} else {
				int nbJours;
				if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
					nbJours = 30;
				} else {
					if (mois == 2) {
						boolean bissextile = ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0));
						if (bissextile) {
							nbJours = 29;
						} else {
							nbJours = 28;
						}

					} else {
						nbJours = 31;
					}
				}
			}
			
		


	} while (!dateOK); 
			Terminal.ecrireStringln(jour + " / " + mois + " / " + annee);
}
}


//corrigé officiel:
//class DateCorrecte {
//	/*
//	 * Sasit une date et teste si elle correcte. Demande une nouvelle saisie
//	 * tant que la date est incorrecte et signale l’erreur eventuelle (1 erreur
//	 * a la fois).
//	 */
//	public static void main(String[] args) {
//		int jour;
//		int mois;
//		int annee;
//		boolean dateOK = false;
//
//		do {
//			Terminal.ecrireString("Donnez un jour: ");
//			jour = Terminal.lireInt();
//			Terminal.ecrireString("Donnez un mois: ");
//			mois = Terminal.lireInt();
//			Terminal.ecrireString("Donnez une annee: ");
//			annee = Terminal.lireInt();
//			if (annee <= 0) {
//				Terminal.ecrireStringln("L’annee doit etre positive.");
//			} else if (mois < 1 || mois > 12) {
//				Terminal.ecrireStringln("Le mois doit etre compris entre 1..12");
//			} else {
//				int nbJours;
//				if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
//					nbJours = 30;
//				} else if (mois == 2) {
//					boolean bissextile = (annee % 4 == 0) && !(annee % 100 == 0) || (annee % 400 == 0);
//					if (bissextile)
//						nbJours = 29;
//					else
//						nbJours = 28;
//				} else {
//					nbJours = 31;
//				}
//				if (jour < 1 || jour > nbJours) {
//					Terminal.ecrireString("Numero de jour incorrect: pour le mois " + mois);
//					Terminal.ecrireString(" de l’annee " + annee);
//					Terminal.ecrireStringln(", le jour doit etre compris entre 1.." + nbJours);
//				} else {
//					dateOK = true;
//				}
//			}
//		} while (!dateOK);
//		Terminal.ecrireString("La date saisie est ");
//		Terminal.ecrireInt(jour);
//		Terminal.ecrireString(" / ");
//		Terminal.ecrireInt(mois);
//		Terminal.ecrireString(" / ");
//		Terminal.ecrireIntln(annee);
//	}
//}