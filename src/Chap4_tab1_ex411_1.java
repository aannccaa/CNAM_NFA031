/*
Exercice 4.1.1 tableau d’entiers
Dans cet exercice, on va travailler avec un tableau d’entiers initialisé :
int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
Les indices des valeurs seront: 01234567

Question 1
Ecrire un programme qui saisit un entier au clavier et qui recherche 
si cet entier appartient au tableau (réponse de type oui/non).
Question 2
Ecrire un programme qui saisit un entier au clavier et qui recherche si 
cet entier appartient au tableau. Au cas où la réponse est positive, 
l’indice de cet entier dans le tableau est affiché. S’il y a plusieurs occurrences, 
le dernier indice est affiché.
Question 3
Même question, mais s’il y a plusieurs occurrences, le premier indice est affiché.
Question 4
Ecrire un programme qui saisit un entier et un indice et met cet entier dans le tableau à cet indice. 
Il faudra vérifier que l’indice correspond bien à une case du tableau 
(par exemple 0 ou 3 sont corrects, mais -1 ou 123 ne sont pas des indices corrects pour ce tableau). 
Le programme affichera le contenu du tableau avant et après cette transformation.
Question 5
Ecrire un programme qui saisit deux indices et échange les valeurs contenues dans le tableau à ces deux indices. 
Le programme affichera le contenu du tableau avant et après cette transformation.
Par exemple, si les deux indices saisit sont 1 et 5, le tableau après échange est : {12,  9, 13, 10, 8, 15, 13, 1 }
 */
public class Chap4_tab1_ex411_1 {

	public static void main(String[] args) {
		
		int n = -1;
		int compteur;
		int[] tab = { 12, 15, 13, 10, 8, 9, 13, 14 };
		String reponse = "";
		
		boolean continuer;
		
		// est l'entier saisi dans le tableau ?
		do {
			System.out.print("Donner un entier n: ");
			n = Lire.i();
			compteur = 0;
			for (int i = 0; i < tab.length; i++) {
				if (n == tab[i]) {
					compteur = compteur +1;
					reponse = n + " appartient au tableau";
					break;
				} 
			}
			if (compteur == 0) {
				reponse = n + " n'appartient pas au tableau";
			}
			
			System.out.println(reponse);
			
			continuer = poserQuestion("Voulez-vous saisir un autre entier ? ");
		
		} while (continuer);

	}
	
	public static boolean poserQuestion(String question) {
		char choix;
		boolean choixIncorrect;
		do {
			System.out.print(question + " (O/N)?");
			choix = Character.toUpperCase(Lire.c());
			choixIncorrect = (choix != 'N') && (choix != 'O');
			if (choixIncorrect) {
				System.out.print("Choix incorrect, répétez la saisie. ");
			}
			
		} while (choixIncorrect);
		
	
		return (choix == 'O');
	}
}
