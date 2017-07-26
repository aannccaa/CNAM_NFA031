/*
tracer
 */
public class Chap3_boucles2_ex324 {

	public static void main(String[] args) {

		int a, b;
		Terminal.ecrireString("entrez a ");
		a = Terminal.lireInt();
		Terminal.ecrireString("entrez b ");
		b = Terminal.lireInt();
		int r = 1;
		while (b != 0) {
			if (b % 2 == 0) {
				a = a * a;
				b = b / 2;
			} else {
				r = r * a;
				b = b - 1;
			}
		}
		Terminal.ecrireStringln("résultat " + r);
	}

}
