/*
Écrivez un programme qui saisit une date correcte sous la forme de trois entiers 
(jour, mois et année). Le programme doit tester si la date est correcte, 
et si ce n’est pas le cas, doit signaler le type d’erreur rencontrée, 
puis demander une nouvelle saisie. 
Le programme finit lorsqu’une date correcte est enfin saisie, 
avec l’affichage de celle-ci. 
Dans le cas où le mois de la date est février, votre programme devra calculer 
si l’année est bissextile. De manière générale, il devra calculer 
le nombre de jours maximal du le mois de la date saisie, 
de manière à valider le numéro de jour qui a été saisi.
 */
public class Chap3_boucles1_ex315 {

	public static void main(String[] args) {
		int jj = 10;
		int mm = 02;
		int aaaa = 1971;

		String error;
		do {
			System.out.print("Donnez jour (jj) : ");
			jj = Lire.i();
			System.out.print("Donnez mois (mm) : ");
			mm = Lire.i();
			System.out.print("Donnnez année (aaaa): ");
			aaaa= Lire.i();
			
			error = testerDate(jj, mm, aaaa);
			if (error != null) {
				System.out.println(error);
			} else {
				System.out.println("Date introduite correcte: " + jj + "/"+ mm + "/"+ aaaa);
			}
		} while (error != null);

	}
	

	
	

	public static int[] creerTabJoursMois(int aaaa) {
		int[] tab = { 31, estAnneeBissextile(aaaa) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		return tab;
	}

	public static void afficherTab(int[] tab) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = ";";
		}
		System.out.println("}");

	}

	// Test si année est bisextille
	// si l'année est divisible par 4 et non divisible par 100, ou
	// si l'année est divisible par 400.
	public static boolean estAnneeBissextile(int aaaa) {
		boolean anneeBissectile;
		if (((aaaa % 4 == 0) && (aaaa % 100 != 0)) || (aaaa % 400 == 0)) {
			anneeBissectile = true;
		} else {
			anneeBissectile = false;
		}
		return anneeBissectile;
	}

	public static String testerDate(int jj, int mm, int aaaa) {
		if ((mm <= 0) || (mm > 12)) {
			return "Mois incorrect !";
		}
		
		int[] tab = creerTabJoursMois(aaaa);
		if ((jj <= 0) || (jj > tab[mm-1])){
			return "Jour incorrect !";
		}
		
		return null;
	}
}
