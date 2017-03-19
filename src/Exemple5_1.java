public class Exemple5_1{
	public static void main(String[] args) {
		int total = 0;
		int x;
		Terminal.ecrireString("Entrez le multiplicateur: ");
		x = Terminal.lireInt();
		for (int i = 1; i <= 4; i++) {
			total = total + (i * x);
			Terminal.ecrireInt(i);
		}
		Terminal.ecrireString("La somme des 4 premiers multiples est: ");
		Terminal.ecrireInt(total);
		Terminal.sautDeLigne();
	}
}