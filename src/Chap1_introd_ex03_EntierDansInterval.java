/*
Tester si un entier appartient � l�intervalle donn� par deux nombres entiers.
 */

public class Chap1_introd_ex03_EntierDansInterval {

	public static void main(String[] args) {
		int borneInf = -1;
		int borneSup = 1;
		int nombre = 0;
		String message;

		if ((nombre >= borneInf) && (nombre <= borneSup)) {
			message = nombre + " est dans l'interval [ " + borneInf + " ; " + borneSup + "]";
		} else {
			message = nombre + " n'est pas dans l'interval [ " + borneInf + " ; " + borneSup + "]";
		}
		System.out.print(message);
	}

}
