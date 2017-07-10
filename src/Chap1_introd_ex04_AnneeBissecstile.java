/*
Tester si une année est bissextile. On sait qu’une année divisible par 4 est bissextile sauf si elle
est divisible par 100, cependant les années divisibles par 400 sont également bissextiles.
*/

public class Chap1_introd_ex04_AnneeBissecstile {

	public static void main(String[] args) {
		int annee = 104;
		boolean isBissectile;
		String message;

		isBissectile =((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0);


//		if (annee % 100 == 0) {
//			isBissectile = false;
//		} else {
//			if ((annee % 4 == 0) || (annee % 400 == 0)) {
//				isBissectile = true;
//			} else {
//				isBissectile = false;
//			}
//		}

		if (isBissectile) {
			message = "L'année " + annee + " est bissecstille.";
		} else {
			message = "L'année " + annee + " n'est pas bissecstille.";
		}

		System.out.println(message);
	}
}