/*
 Écrivez un programme qui calcule la somme des 10 premiers entiers. Cette somme sera mise
dans une variable qui contiendra d’abord la somme des 0 premiers entiers, puis celle des 1
premiers entiers, puis des 2 premiers entiers, etc. A la fin du calcul, le résultat sera affiché à
l’écran. Vous utiliserez une boucle for. 
 */
public class Somme10PremiersEntiers {
	public static void main(String[] args) {
		int somme=0; // somme des entiers

		for (int i = 0; i<=9; i=i+1) {
			somme = somme+i;
			Terminal.ecrireStringln("La somme des entiers de 0 à " + i + " = " + somme);
		}
		Terminal.ecrireStringln("=> La somme des 10 premiers entiers = " + somme);
	}
}
