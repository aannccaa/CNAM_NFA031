/*
 Écrivez un programme qui calcule la somme des 10 premiers entiers. Cette somme sera mise
dans une variable qui contiendra d’abord la somme des 0 premiers entiers, puis celle des 1
premiers entiers, puis des 2 premiers entiers, etc. A la fin du calcul, le résultat sera affiché à
l’écran. Vous utiliserez une boucle for. 
 */
//public class Somme10PremiersEntiers {
//	public static void main(String[] args) {
//		int somme=0; // somme des entiers
//
//		for (int i = 0; i<=9; i=i+1) {
//			somme = somme+i;
//			Terminal.ecrireStringln("La somme des entiers de 0 à " + i + " = " + somme);
//		}
//		Terminal.ecrireStringln("=> La somme des 10 premiers entiers = " + somme);
//	}
//}

/* Modiﬁez le programme pour qu’il calcule la somme des n premiers entiers où n est 
un nombre saisi au clavier et entré par l’utilisateur.
 Modiﬁer le programme pour calculer non plus la somme mais la moyenne des n entiers. 
 Attention : en Java, l’opération de division appliquée sur deux entiers est la division entière, 
 qui donne en résultat un entier. Ainsi, 5/2 donne en résultat 2 et non pas 2.5. 
 Si vous souhaitez que l’opération appliquée sur les deux nombres soit la division décimale, 
 au moins l’une des deux opérandes doit être un nombre à virgule (par exemple un double). 
 Par exemple, l’opération 5/2.0 donne en résultat 2.5.
*/

public class Somme10PremiersEntiers {
	public static void main(String[] args) {
		int somme = 0; // somme des entiers
		double moyenne = 0;
		Terminal.ecrireString("Entrez un entier: ");
		int n = Terminal.lireInt();
		for (int i = 0; i <= n; i = i + 1) {
			somme = somme + i;
			if (i == 0) {
				moyenne = 0;
			} else {
				int nombreEntiers = i + 1;
				double sommeAsDouble = somme;
				moyenne = sommeAsDouble / nombreEntiers;
			}

			Terminal.ecrireStringln("La somme des entiers de 0 à " + i + " = " + somme);
			Terminal.ecrireStringln("La moyenne des entiers de 0 à " + i + " = " + moyenne);
		}
		Terminal.ecrireStringln("=> La somme des " + n + " premiers entiers = " + somme);
		Terminal.ecrireStringln("=> La moyenne des " + n + " premiers entiers = " + moyenne);
	}
}