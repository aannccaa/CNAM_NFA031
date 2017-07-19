/*
 Ecrire un programme qui affiche un carré composé de caractères ’*’, dont la taille est entrée par
l’utilisateur.
Par exemple, pour une taille 4, ce sera :
****
****
****
****
Il y a plusieurs façons de réaliser cela. Une d’elle consiste à utiliser une seule boucle, une autre
utilise deux boucles imbriquées l’une dans l’autre. Vous privilégierez la méthode qui utilise deux
boucles.
 */
public class Chap3_boucles2_ex322_a {

	public static void main(String[] args) {
		int n;

		System.out.print("Donnez n : ");
		n = Lire.i();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
