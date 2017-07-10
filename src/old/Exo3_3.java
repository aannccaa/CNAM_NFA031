public class Exo3_3 {
	public static void main(String[] args) {
		int a = 2;
		int x = 4;
		Terminal.ecrireStringln("* Bloc main *");
		Terminal.ecrireStringln("a =" + a);
		Terminal.ecrireStringln("x =" + x);
		if (a < 12) {
			/* Bloc 1 */
			int k = 12;
			x = a + x;
			k = k + 1;
			Terminal.ecrireStringln("* Bloc 1 *");
			Terminal.ecrireStringln("a =" + a);
			Terminal.ecrireStringln("k (locale) =" + k);
			Terminal.ecrireStringln("x =" + x);
			Terminal.ecrireStringln("* Fin Bloc 1 *");
		}
		// Terminal.ecrireStringln("k =" + k );
		int k = 3;
		Terminal.ecrireStringln("k =" + k);
		Terminal.ecrireStringln("a =" + a);
		Terminal.ecrireStringln("x =" + x);
	}
}