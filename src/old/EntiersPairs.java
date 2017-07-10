//affiche les n premiers entiers pairs avec n demandé à l’utilisateur.
public class EntiersPairs {
	public static void main (String[] args) {
		int n;
		Terminal.ecrireString("combien d'entiers pairs en partant de 0? :");
		n=Terminal.lireInt();
		for (int i=0; i<n*2; i=i+2) {
			Terminal.ecrireInt(i);
		Terminal.ecrireStringln(" . ");
		}
	}
}