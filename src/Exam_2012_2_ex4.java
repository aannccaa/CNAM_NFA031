/*
On veut utiliser un tableau pour stocker les temperatures maximales d’un mois de 31 jours. Une temperature
est un nombre a virgule. `
Question 1
Donnez le code pour creer ce tableau, lire au clavier tous 31 temperatures et les afficher.
On veut maintenant enregistrer les temperatures des 12 mois de l’annee. Dans cette question, vous
supposerez que tous les mois ont 31 jours.
Donnez le code pour creer le tableau, le remplir de temperatures lues au clavier.
Question 3
Donnez le code permettant de calculer la temperature moyenne d’un mois donne sous forme d’un
nombre (1 pour janvier, 12 pour decembre).
Question 4
Comment peut-on faire pour gerer le fait que tous les mois n’ont pas 31 jours ? Donnez soit du code,
soit des explications, soit les deux (pas plus de 10 lignes d’explications).

 */
public class Exam_2012_2_ex4 {

	public static void main(String[] args) {

		int nbMois = 2;
		int[] nbJoursMois = { 2, 3 };
		String[] numeLuna = { "Jan", "Feb" };

		// double[] tempMois = introdTemperaturesMois(nbJoursMois);
		// printVector(tempMois);
		double[][] tempAnnee = introdTemperaturesAnnee(nbMois, nbJoursMois, numeLuna);
		printTableau2D(tempAnnee, numeLuna);
		
		double[] mediaLunilor = calcMediaLiniilor(tempAnnee);
		printVectorEtichete("Medii temp lunare", mediaLunilor, numeLuna);

	}

	public static double[] calcMediaLiniilor(double[][] tab) {
		double[] tabMedii = new double[tab.length];
		for (int i = 0; i < tab.length; i++) {
			tabMedii[i] = calcMedia(tab[i]);
		}
		return tabMedii;
	}

	public static double calcSuma(double[] tab) {
		double suma = 0;
		int nrVal = tab.length;
		for (int i = 0; i < nrVal; i++) {
			suma = suma + tab[i];
		}
		return suma;
	}

	public static double calcMedia(double[] tab) {
		double media;
		double suma = calcSuma(tab);
		if (suma == 0) {
			media = 0;
		} else {
			media = suma / tab.length;
		}
		return media;
	}

	public static double[][] introdTemperaturesAnnee(int nbMois, int[] nbJoursMois, String[] numeLuna) {
		double[][] tab = new double[nbMois][];
		for (int i = 0; i < nbMois; i++) {
			System.out.println("Pt luna " + numeLuna[i] + " : ");
			tab[i] = introdTemperaturesMois(nbJoursMois[i]);
		}
		return tab;
	}

	public static double[] introdTemperaturesMois(int nbJoursMois) {
		double tempMaxJour;
		double[] tab = new double[nbJoursMois];
		for (int i = 0; i < nbJoursMois; i++) {
			System.out.print("Donner la temp max du jour" + (i + 1) + " : ");
			tempMaxJour = Lire.d();
			tab[i] = tempMaxJour;
		}
		return tab;
	}

	public static void printVector(double[] tab) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + +tab[i]);
			sep = " ; ";
		}
		System.out.println("}");
	}

	public static void printVectorEtichete(String antet, double[] tab, String[] etichete) {
		System.out.println(antet);
		for (int i = 0; i < tab.length; i++) {
			System.out.println(etichete[i] + " : " +tab[i]);
		}
	}

	public static void printTableau2D(double[][] tab, String[] etichetaLinie) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(etichetaLinie[i] + " : ");
			printVector(tab[i]);
		}

	}
}
