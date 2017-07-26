/*
Exercice 4.1.1 tableau d’entiers
Dans cet exercice, on va travailler avec un tableau d’entiers initialisé :
int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
Les indices des valeurs seront: 01234567

Question 2
Ecrire un programme qui saisit un entier au clavier et qui recherche si 
cet entier appartient au tableau. Au cas où la réponse est positive, 
l’indice de cet entier dans le tableau est affiché. S’il y a plusieurs occurrences, 
le dernier indice est affiché.

 */
public class Chap4_tab1_ex411_2_Cata {

	public static int findFirst(int number, int[] tab) {
		int result = -1;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == number) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static int findLast(int number, int[] tab) {
		int result = -1;
		for (int i = tab.length - 1; i >= 0; i--) {
			if (tab[i] == number) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static int findFirst2(int number, int[] tab) {
		return find(number, tab, false);
	}
	public static int findLast2(int number, int[] tab) {
		return find(number, tab, true);
	}
	
	public static int[] findAll(int number, int[] tab) {
		int count = countOccurences(number, tab);
		
		int[] indices = new int[count];
		int positionLibre = 0;
		for (int i = 0; i < tab.length; i++) {
			if(tab[i]== number) {
				indices[positionLibre]=i;
				positionLibre++;
			}
		}
		return indices;
	}

	private static int countOccurences(int number, int[] tab) {
		int count = 0;
		for(int i = 0; i < tab.length; i++) {
			if(tab[i]== number) {
				count++;
			}
		}
		return count;
	}
	
	private static int find(int number, int[] tab, boolean last) {
		int result = -1;
		for (int i = 0; i < tab.length; i++) {
			int index = last ? tab.length - 1 - i : i;
			if (tab[index] == number) {
				result = index;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int n = -1;
		int compteur;
		int[] tab = { 12, 15, 13, 10, 8, 10, 13, 10 };
		String reponse = "";
		char choix = 'N';
		boolean choixIncorrect;

		// est l'entier saisi dans le tableau ?
		do {
			System.out.print("Donner un entier n: ");
			n = Lire.i();
			compteur = 0;
			for (int i = 0; i < tab.length; i++) {
				if (n == tab[i]) {
					compteur = compteur + 1;
					reponse = n + " appartient au tableau. L'indice de son occurence " + compteur + " est: " + i;
					// break; // décommenter cette ligne pour avoir l'indice de la première
					// occurence de N
				}
				if (compteur == 0) {
					reponse = n + " n'appartient pas au tableau";
				}
			}
			System.out.println(reponse);
			System.out.println("Nb occurence de n = " + compteur);

			// saisir un autre entier?
			do {
				System.out.print("Voulez-vous saisir un autre entier (O/N)?");
				choix = Character.toUpperCase(Lire.c());
				choixIncorrect = (choix != Character.toUpperCase('n')) && (choix != Character.toUpperCase('o'));
				if (choixIncorrect) {
					System.out.print("Choix incorrect, répétez la saisie. ");
				}
				if (choix == 'N') {
					System.out.print("FIN du programme");
				}
			} while (choixIncorrect);

		} while (choix != 'N');

	}
}
