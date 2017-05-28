/*
tester si trois nombres entiers sont triés dans l’ordre croissant.
 */
public class Chap1_introd_ex01_EntiersOrdreAsc {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 2;
		String message;
		
		if ((a < b) && (b < c)) {
			message = "les entiers sont en odre est croissante";
		} else {

			message = "les entiers sont en odre est decroissante";
		}
		
		System.out.print(message);

	}

}
