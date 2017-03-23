/*
 Écrivez un programme qui saisit une date correcte sous la forme de trois entiers (jour, mois et
année). Le programme doit tester si la date est correcte, et si ce n’est pas le cas, doit signaler le type
d’erreur rencontrée, puis demander une nouvelle saisie. Le programme finit lorsqu’une date correcte
est enfin saisie, avec l’affichage de celle-ci. Dans le cas où le mois de la date est février, votre programme
devra calculer si l’année est bissextile. De manière générale, il devra calculer le nombre de
jours maximal du le mois de la date saisie, de manière à valider le numéro de jour qui a été saisi. 
 */

public class Date {
	public static void main (String[] args) {
		int jour()=1, mois=1, annee=1;
		Terminal.ecrireStringln("Jour? :");
		jour = Terminal.lireInt();
		Terminal.ecrireStringln("Mois?: ");
		mois = Terminal.lireInt();
		Terminal.ecrireStringln("Année? : ");
		annee = Terminal.lireInt();


		//test année
		if ((annee % 4 == 0 && annee % 100 !=0) || (annee % 400 == 0)) {
			while (mois <1 && mois > 29) {
				Boolean testMois=true;
				Terminal.ecrireStringln("Mois OK");
				}
			
		}
			]
		else


		// test mois

		// test jour
		if (jour)







			Terminal.ecrireStringln(jour + " / " + mois + " / " + annee);
	}
}
