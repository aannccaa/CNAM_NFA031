/*
 �crivez un programme qui saisit une date correcte sous la forme de trois entiers (jour, mois et
ann�e). Le programme doit tester si la date est correcte, et si ce n�est pas le cas, doit signaler le type
d�erreur rencontr�e, puis demander une nouvelle saisie. Le programme finit lorsqu�une date correcte
est enfin saisie, avec l�affichage de celle-ci. Dans le cas o� le mois de la date est f�vrier, votre programme
devra calculer si l�ann�e est bissextile. De mani�re g�n�rale, il devra calculer le nombre de
jours maximal du le mois de la date saisie, de mani�re � valider le num�ro de jour qui a �t� saisi. 
 */

public class Date {
	public static void main (String[] args) {
		int jour()=1, mois=1, annee=1;
		Terminal.ecrireStringln("Jour? :");
		jour = Terminal.lireInt();
		Terminal.ecrireStringln("Mois?: ");
		mois = Terminal.lireInt();
		Terminal.ecrireStringln("Ann�e? : ");
		annee = Terminal.lireInt();


		//test ann�e
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
