//////affiche les 10 premiers entiers en partant de 10 :
//public class premEntiers {
//	public static void main (String[] args) {
//		for (int i=10; i>0; i=i-1) {
//			Terminal.ecrireInt(i);
//		Terminal.ecrireStringln(" . ");
//		}
//	}
//}

////affiche les 10 premiers entiers en partant de 10 :
public class premEntiers {
	public static void main(String[] args) {
		int i = 10;
		while (i > 0) {
			Terminal.ecrireInt(i);
			Terminal.ecrireStringln(" . ");
			i = i - 1;
		}
	}
}