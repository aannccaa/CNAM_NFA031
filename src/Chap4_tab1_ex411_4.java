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
		int n = -1;
		int[] tab = { 12, 15, 13, 10, 8, 9, 13, 14 };
		int indice;
		
		System.out.print("Donner un entier n: ");
		n = Lire.i();
		System.out.print("Donner un indice pour n: ");
		indice = Lire.i();
		
		
	}
}
