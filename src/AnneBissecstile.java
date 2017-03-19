/*
Tester si une ann�e est bissextile. On sait qu�une ann�e divisible par 4 est bissextile sauf si elle
est divisible par 100, cependant les ann�es divisibles par 400 sont �galement bissextiles.

 */
public class AnneBissecstile {
	public static void main(String[] args) {
		int a;
		Terminal.ecrireString("Entr� une ann�e (aaaa): ");
		a = Terminal.lireInt();
		String message;
		if ((a % 4 == 0 && a % 100 !=0) || (a % 400 == 0)) {
			message = "L'ann�e " + a + " est bissecticle";
		} else {
			message = "L'ann�e " + a + " n'est pas bissecticle";
		}
		Terminal.ecrireString(message);
	}
	
}