/*
 �crivez un programme qui affiche la valeur de la fonction x^2
(la fonction qui � un entier associe son carr�) 
pour les dix premiers entiers positifs.
 */
public class Carre {
	public static void main(String[] args) {
		
		for (int x = 0; x < 10; x++) {
			int resultCarre = 0;
			resultCarre = x * x;
			Terminal.ecrireStringln(x + "^2 = " + resultCarre);
		}

	}
}