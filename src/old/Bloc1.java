//variable locale à une boucle for
public class Bloc1 {
	public static void main (String[] args) {
		int somme=0;
		int n;
		Terminal.ecrireString("Entrez n: ");
		n=Terminal.lireInt();
		for (int i=1; i<=n; i++) {// dans ce bloc, i existe
			somme = somme+i;
		}// fin de vie de i
		// ici, i n’existe pas	
		// Impossible d’ecrire Terminal.ecrireInt(i)
		Terminal.ecrireStringln("Somme des nombres de 1 à n = " + somme);
	}
}