/*
Tester si une ann�e est bissextile. On sait qu�une ann�e divisible par 4 est bissextile sauf si elle
est divisible par 100, cependant les ann�es divisibles par 400 sont �galement bissextiles.
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
			message = "L'ann�e " + annee + " est bissecstille.";
		} else {
			message = "L'ann�e " + annee + " n'est pas bissecstille.";
		}

		System.out.println(message);
	}
}