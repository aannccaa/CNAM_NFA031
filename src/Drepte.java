
public class Drepte {
	public static int nbLines = 20;

	public static void main(String[] args) {

		char[][] tab = createTab(nbLines, nbLines);
		printTab(tab, 0, 19, 0, 19);
	}

	public static void printTab(char[][] tab, int lineStart, int lineEnd, int colStart, int colEnd) {
		for (int i = 0; i < tab.length; i++) {
			int line = nbLines - 1 - i;
			if (line >= lineStart && line <= lineEnd) {
				for (int column = colStart; column <= colEnd; column++) {
					System.out.print(tab[line][column]);
				}
				System.out.println();
			}
		}
	}

	public static char[][] createTab(int lines, int columns) {
		char[][] tab = new char[lines][columns];
		for (int l = 0; l < lines; l++) {
			for (int c = 0; c < columns; c++) {
				if (isStar(l, c)) {
					tab[l][c] = 'X';
				} else {
					tab[l][c] = '0';
				}
			}
		}
		return tab;
	}

	public static boolean isStar(double y, double x) {
		// x = (x -10)*.6;
		// y = (y - 10);
		return (y <= x) && (y <= -1 * x + (nbLines -2));
		// return (y <= - 1 * x + 1* (nbLines - 1));
		// return x % 2 == 0 linie x , line y
		// return (x+y) % 2 == 0;//sah
		// return x==y; //diagonala
		// return y == -x + (2*nbLines-1);
		//return (x <3 && y <3) || (x > 4 && y > 4) ;
		//return (x*x + y*y < 25);
	}
}
