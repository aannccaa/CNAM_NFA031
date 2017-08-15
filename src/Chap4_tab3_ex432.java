/*
Exercice 4.3.2 occupation de salle
Une salle de réunion peut être utilisée par différents employés d’une entreprise. 
La réservation se fait par plage d’une heure, de 8H00 du matin à 18H00. 
Chaque plage d’une heure commence à l’heure pile 
(par exemple, il y a une plage 9H00-10H00 mais il n’y a pas de plage 9H15-10H15.
Un tableau de booléens à deux dimensions est utilisé pour représenter si la salle est occupée 
(valeur true) ou disponible (valeur false) pendant une semaine. 
Une dimension est utilisée pour coder les jours ouvrables de 0 (lundi) à 4 (vendredi). 
L’autre dimension est utilisée pour les plages horaires de 0 (8H00-9H00) à 9 (17H00-18H00). 
Chaque case correspond à la réservation de la salle pour une plage d’un jour donné.
boolean[][] occupee = {
{false,true,true,true,false,true,true,false,true,false},
{false,true,true,true,false,true,true,false,true,false}, 
{false,false,true,true,false,false,true,false,true,false}, 
{true,true,false,true,false,true,true,false,true,true}, 
{false,true,false,true,false,true,true,false,false,false}
};

Question 1 affichage
écrire un programme qui déclare la variable occupee comme ci-dessus et qui affiche l’occupa-
tion de la salle de façon intelligible (par exemple : salle occupee le mardi de 9H00 à 10H00).

Question 2 taux d’occupation
écrire un programme qui calcule le taux d’occupation de la salle, c’est à dire le nombre de plages
réservées divisé par le nombre total de plages.

Question 3 reservation
écrire un programme qui permet à l’utilisateur de réserver une plage. Il faut vérifier que la salle
est libre au moment demandé.

 */
public class Chap4_tab3_ex432 {

	public static void main(String[] args) {

		// Q1
		boolean[][] occupee = occupationSalle();
		affichage(occupee);

		// Q2
		System.out.println("Taux occupation semaine : " + tauxOccupationSemaine(occupee));
		System.out.println("Taux occupation journalière : ");
		afficherOccupationJournaliere(occupee);

		// Q3
		int jour = reserverJour();
		int plageHoraire = reserverPlageHoraire();
		reserverSalle(occupee, jour, plageHoraire);
	}

	public static boolean[][] occupationSalle() {

		boolean[][] occupee = { { false, true, true, true, false, true, true, false, true, false },
				{ false, true, true, true, false, true, true, false, true, false },
				{ false, false, true, true, false, false, true, false, true, false },
				// { true, true, false, true, false, true, true, false, true, true },
				{ false, false, false, false, false, false, false, false, false, false },
				{ false, true, false, true, false, true, true, false, false, false } };
		return occupee;
	}

	public static void affichage(boolean[][] occupation) {
		for (int jour = 0; jour < occupation.length; jour++) {
			String nomJour = jour2str(jour);
			affichageOccupationJour(nomJour, occupation[jour]);
		}

	}

	public static void affichageOccupationJour(String jour, boolean[] occupationJour) {
		//// optionel (n'affiche pas les jours sans reservation):
		// boolean hasReservation = false;
		// for (int plageHoraire = 0; plageHoraire < occupationJour.length;
		// plageHoraire++) {
		// if (occupationJour[plageHoraire]) {
		// hasReservation = true;
		// break;
		// }
		// }
		// if (!hasReservation) {
		// return;
		// }
		System.out.println(jour);
		for (int plageHoraire = 0; plageHoraire < occupationJour.length; plageHoraire++) {
			if (occupationJour[plageHoraire]) {
				System.out.println(plageHoraire2str(plageHoraire));
			}
		}

	}

	public static String plageHoraire2str(int h) {
		int start = 8;
		String result;

		result = "" + (start + h) + " - " + (start + h + 1);
		return result;

	}

	public static String jour2str(int jour) {
		String[] jours = { "lundi", "mardi", "mercredi", "jeudi", "vendredi" };
		return jours[jour];
	}

	public static int nbPlagesOccupeesJour(boolean[] occupationJour) {
		int compteur = 0;
		for (int plageHoraire = 0; plageHoraire < occupationJour.length; plageHoraire++) {
			if (occupationJour[plageHoraire] == true) {
				compteur++;
			}
		}
		return compteur;
	}

	public static double tauxOccupationJour(boolean[] occupationJour) {
		double tauxJour;
		int n = nbPlagesOccupeesJour(occupationJour);
		tauxJour = n * 1.0 / occupationJour.length;
		return tauxJour;
	}

	public static double tauxOccupationSemaine(boolean[][] occupationSemaine) {
		int totalPlagesOccupeesSemaine = 0;
		int totalPlages = 0;
		double tauxOccupationSemaine;

		for (int jour = 0; jour < occupationSemaine.length; jour++) {
			boolean[] occupationJour = occupationSemaine[jour];

			totalPlages = totalPlages + occupationJour.length;
			totalPlagesOccupeesSemaine = totalPlagesOccupeesSemaine + nbPlagesOccupeesJour(occupationJour);
		}
		tauxOccupationSemaine = totalPlagesOccupeesSemaine * 1.0 / totalPlages;

		return tauxOccupationSemaine;
	}

	public static double[] tauxOccupationJournalier(boolean[][] occupee) {
		double[] tab = new double[occupee.length];

		for (int jour = 0; jour < occupee.length; jour++) {
			boolean[] occupationJour = occupee[jour];
			tab[jour] = tauxOccupationJour(occupationJour);
		}
		return tab;
	}

	public static void afficherOccupationJournaliere(boolean[][] occupationSemaine) {
		double[] tauxParJour = tauxOccupationJournalier(occupationSemaine);
		for (int jour = 0; jour < tauxParJour.length; jour++) {
			System.out.println(jour2str(jour));
			System.out.println(tauxParJour[jour]);
		}
	}

	public static int reserverJour() {
		int numeroJour;
		String jour;
		System.out.print("Donner un jour (lundi,..., vendredi) : ");
		jour = Lire.S();
		numeroJour = jour2int(jour);
		return numeroJour;
	}

	public static int jour2int(String jour) {
		int result;
		switch (jour) {
		case "lundi":
			result = 0;
			break;
		case "mardi":
			result = 1;
			break;
		case "mercredi":
			result = 2;
			break;
		case "jeudi":
			result = 3;
			break;
		case "vendredi":
			result = 4;
			break;
		default:
			result = -1;
			break;
		}
		return result;
	}

	public static int reserverPlageHoraire() {
		int numeroPlageHoraire;
		int startPlageHoraire;
		System.out.print("Donner le debut d'une plage horaire  : ");
		startPlageHoraire = Lire.i();
		numeroPlageHoraire = startPlageHoraire - 8;
		return numeroPlageHoraire;
	}

	public static boolean reserverSalle(boolean[][] occupee, int jour, int numeroPlageHoraire) {
		boolean confirmationReservation = false;
		if (jour < 0 || jour >= occupee.length) {
			System.out.println("Error saisie jour");
		} else if (numeroPlageHoraire < 0 || numeroPlageHoraire >= occupee[jour].length) {
			System.out.println("Error saisie plage horaire");
		} else if (occupee[jour][numeroPlageHoraire] == true) {
			System.out.println("Reservation impossible, salle occuppee " + jour2str(jour) + " "
					+ plageHoraire2str(numeroPlageHoraire));

		} else {
			occupee[jour][numeroPlageHoraire] = true;
			System.out.println("Reservée pour : " + jour2str(jour) + " " + plageHoraire2str(numeroPlageHoraire));
			confirmationReservation = true;
		}

		return confirmationReservation;
	}
}
