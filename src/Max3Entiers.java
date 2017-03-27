public class Max3Entiers {
	public static void main (String [] args) {
	int a, b, c, max=-1;
	Terminal.ecrireStringln("a?: ");
	a = Terminal.lireInt();
	Terminal.ecrireStringln("b?: ");
	b = Terminal.lireInt();
	Terminal.ecrireStringln("c?: ");
	c = Terminal.lireInt();
		if (a>b && a>c) max = a;	
		if (b>a && b>c) max = b;
		if (c>a && c>b) max = c;
		Terminal.ecrireStringln("Le plus grand est "+ max);
	}
}