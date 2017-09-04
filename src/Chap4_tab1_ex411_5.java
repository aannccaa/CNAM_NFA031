/*
Exercice 4.1.1 tableau d’entiers
Dans cet exercice, on va travailler avec un tableau d’entiers initialisé :
int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
Les indices des valeurs seront: 01234567

Question 5
Ecrire un programme qui saisit deux indices et échange les valeurs contenues dans le tableau à ces deux indices. 
Le programme affichera le contenu du tableau avant et après cette transformation.
Par exemple, si les deux indices saisit sont 1 et 5, le tableau après échange est : 01234567

{12, 9, 13, 10, 8, 15, 13, 14}

 */
public class Chap4_tab1_ex411_5 {

	public static void main(String[] args) {

		int[] tab = { 12, 15, 13, 10, 8, 9, 13, 14 };
		
		int indice1;
		int indice2;
		
		// afficher tab initial:
		afficherTab1D(tab);
		
		//introd indices
		indice1 = introduireIndice(tab);
		indice2 = introduireIndice(tab);
		
		int[] tabModifie=modifierTab(indice1, indice2, tab);
		
		//afficher tab modifié:
		afficherTab1D(tabModifie);

	}


	public static int introduireIndice(int[] tab) {
		int indice;
		boolean choixIncorrect;

		do {
			System.out.print("Donner un indice, compris entre 0 et " + (tab.length - 1) + " : ");
			indice = Lire.i();
			if ((indice < 0) || (indice > tab.length - 1)) {
				choixIncorrect = true;
				System.out.print("Choix incorrect, repetez la saisie. ");
			} else
				choixIncorrect = false;
		} while (choixIncorrect);

		return indice;
	}
	
	

	public static int[] modifierTab(int indice1, int indice2, int[] tab) {
		int temp;
		int[] tabModifie = new int[tab.length];
		for (int i = 0; i<tabModifie.length; i++) {
			tabModifie[i] = tab[i];
		}
		temp = tabModifie[indice1];
		tabModifie[indice1] = tab[indice2];
		tabModifie[indice2] = temp;
		
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
