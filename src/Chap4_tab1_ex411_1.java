/*
Exercice 4.1.1 tableau d’entiers
Dans cet exercice, on va travailler avec un tableau d’entiers initialisé :
int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
On peut représenter graphiquement ce tableau comme suit : 01234567

Question 1
Ecrire un programme qui saisit un entier au clavier et qui recherche 
si cet entier appartient au tableau (réponse de type oui/non).
 */
public class Chap4_tab1_ex411_1 {

	public static void main(String[] args) {
		int n = -1;
		int[] tab = { 12, 15, 13, 10, 8, 9, 13, 14 };
		String reponse = "";
		char choix = 'N';
		boolean choixIncorrect;
		
		// est l'entier saisi dans le tableau ?
		do {
			System.out.print("Donner un entier n: ");
			n = Lire.i();
			for (int i = 0; i < n; i++) {
				if (n == tab[i]) {
					reponse = "n appartient au tableau";
					break;
				} else {
					reponse = "n n'appartient pas au tableau";
				}
			}
			System.out.println(reponse);

			// saisir un autre entier?
			do {
				System.out.print("Voulez-vous saisir un autre entier (O/N)?");
				choix = Character.toUpperCase(Lire.c());
				choixIncorrect = (choix != Character.toUpperCase('n')) && (choix != Character.toUpperCase('o'));
				if (choixIncorrect) {
					System.out.print("Choix incorrect, répétez la saisie. ");
				}
				if (choix == 'N'){
						System.out.print("FIN du programme");
				}
			} while (choixIncorrect);

		} while (choix != 'N');

	}
}
