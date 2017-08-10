/*
Exercice 4.1.2 tableau entré au clavier 

Question 1
Ecrire un programme qui saisit 6 entiers et les stocke dans un tableau, 
puis affiche le contenu de ce tableau une fois qu’il est rempli.
Question 2
Reprendre la partie saisie du programme précédent pour écrire un nouveau programme qui 
recherche et affiche le plus grand élément du tableau.
Question 3
Même question, c’est à dire saisie d’un tableau et recherche du plus grand élément, 
mais cette fois pour un tableau contenant des caractères.
Question 4
Ecrire un programme qui saisit un tableau de 6 entiers puis calcule la moyenne de ces six entiers. 
Attention, la moyenne des entiers n’est pas un entier.
Question 5
Ecrire un programme qui saisit d’abord un nombre n, puis ensuite saisit n caractères et les place dans un tableau.
 */
public class Chap4_tab1_ex412_1 {

	public static void main(String[] args) {
		int n = 3;

		int[] tabEntiers = creerTabEntiers(n);

		afficherTab1D(tabEntiers);

		int maxTabEntiers = rechercheMaxTab(tabEntiers);
		System.out.println("Max tab est : " + maxTabEntiers);
		
		double moyenneTabEntiers = calculerMoyenne(tabEntiers);
		System.out.println("Moyenne tab est : " + moyenneTabEntiers);
		

//		char[] tabChar = creerTabChar(n);
//		afficherTab1D(tabChar);
//
//		char maxTabChar = rechercheMaxTab(tabChar);
//		System.out.println("Max tab est : " + maxTabChar);

		
	}

	public static int[] creerTabEntiers(int n) {
		int temp;
		int[] tab = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Donner un entier n° " + i + " : ");
			temp = Lire.i();
			tab[i] = temp;
		}

		return tab;
	}

	public static void afficherTab1D(int[] tab) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = ";";
		}
		System.out.println("}");
	}

	public static void afficherTab1D(char[] tab) {
		int[] ordres = new int[tab.length];
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			ordres[i] = (int) tab[i]; // converteste val tab in intregi
			sep = ";";
		}
		System.out.println("}");

		afficherTab1D(ordres);
	}

	public static int rechercheMaxTab(int[] tab) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		return max;
	}

	public static char[] creerTabChar(int n) {
		char temp;
		char[] tab = new char[n];
		for (int i = 0; i < tab.length; i++) {
			System.out.print("Rentrer le charactere n° " + i + " : ");
			temp = Lire.c();
			tab[i] = temp;

		}

		return tab;
	}

	public static char rechercheMaxTab(char[] tab) {
		char max = Character.MIN_VALUE;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		return max;
	}

	public static int calculerSomme(int[] tab) {
		int somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme = somme + tab[i];
		}
		return somme;
	}

	public static double calculerMoyenne(int[] tab) {
		double moyenne;
		int somme = calculerSomme(tab);
		if (tab.length == 0) {
			moyenne = 0;
		} else {
			moyenne = somme * 1.0 / tab.length;
		}
		// varianta
		// moyenne = somme == 0 ? 0 : somme*1.0 / tab.length;

		return moyenne;
	}
}
