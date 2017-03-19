/*
Tester si une année est bissextile. On sait qu’une année divisible par 4 est bissextile sauf si elle
est divisible par 100, cependant les années divisibles par 400 sont également bissextiles.

 */
public class AnneBissecstile {
	public static void main(String[] args) {
		int a;
		Terminal.ecrireString("Entré une année (aaaa): ");
		a = Terminal.lireInt();
		String message;
		if ((a % 4 == 0 && a % 100 !=0) || (a % 400 == 0)) {
			message = "L'année " + a + " est bissecticle";
		} else {
			message = "L'année " + a + " n'est pas bissecticle";
		}
		Terminal.ecrireString(message);
	}
	
}