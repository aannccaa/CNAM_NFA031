/*
Exercice 4.1.1 tableau d’entiers
Dans cet exercice, on va travailler avec un tableau d’entiers initialisé :
int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
Les indices des valeurs seront: 01234567

Question 4
Ecrire un programme qui saisit un entier et un indice et met cet entier dans le tableau à cet indice. 
Il faudra vérifier que l’indice correspond bien à une case du tableau 
(par exemple 0 ou 3 sont corrects, mais -1 ou 123 ne sont pas des indices corrects pour ce tableau). 
Le programme affichera le contenu du tableau avant et après cette transformation.

 */
public class Chap4_tab1_ex411_4 {

	public static void main(String[] args) {

		int[] tab = { 12, 15, 13, 10, 8, 9, 13, 14 };
		int n;
		int indice;
		
		// afficher tab initial:
		afficherTab1D(tab);
		
		n = introduireN();
		indice = introduireIndice(tab);
		
		int[] tabModifie=modifierTab(n, indice, tab);
		
		//afficher tab modifié:
		afficherTab1D(tabModifie);

	}

	public static int introduireN() {
		int n;
		System.out.print("Donner un entier n: ");
		n = Lire.i();

		return n;
	}

	public static int introduireIndice(int[] tab) {
		int indice;
		boolean choixIncorrect;

		do {
			System.out.print("Donner un indice pour n, compris entre 0 et " + (tab.length - 1) + " : ");
			indice = Lire.i();
			if ((indice < 0) || (indice > tab.length - 1)) {
				choixIncorrect = true;
				System.out.print("Choix incorrect, repetez la saisie. ");
			} else
				choixIncorrect = false;
		} while (choixIncorrect);

		return indice;
	}
	
	public static int[] modifierTab(int n, int indice, int[] tab) {
		int[] tabModifie = new int[tab.length];
		for (int i = 0; i<tabModifie.length; i++) {
			tabModifie[i] = tab[i];
		}
		tabModifie[indice] = n;
		
		return tabModifie;
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
}
