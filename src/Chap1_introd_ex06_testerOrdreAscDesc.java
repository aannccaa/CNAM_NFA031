/*
Tester si trois nombres entiers sont tri�s dans l�ordre croissant ou d�croissant.
 */

public class Chap1_introd_ex06_testerOrdreAscDesc {

	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		int c = 0;
		

		if ((a < b) && (b < c)) {
			System.out.println("les nombres sont en ordre croissante");
		} else {
			if ((c < b) && (b < a)) {
				System.out.println("les nombres sont en ordre decroissante");
			} else {
				System.out.println("les nombres ne sont pas tri�s");
			}
		}
	}

}
