
public class Chap3_boucles2_ex321 {

	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= i; j++) {
				int k = i * j;
				if (k < 10)
					Terminal.ecrireChar('0');
				Terminal.ecrireString(k + " ");
			}
			Terminal.sautDeLigne();
		}
	}

}
