/*
 * dessine � l��cran un rectangle compos� de l lignes d��toiles.
 */

//public class Rectangle2 {
//	public static void main(String[] args) {
//		int l;
//		Terminal.ecrireString("combien de lignes d��toiles ?:");
//		l = Terminal.lireInt();
//		for (int i = 0; i < l; i = i + 1) {
//			Terminal.ecrireStringln("****");
//		}
//	}
//}

/*
 * //Modifiez ce programme pour qu�il affiche un rectangle vide au lieu d�un
 * rectangle plein. Par exemple, si l vaut 5, le rectangle sera :
 ****
 * * * *
 ****
 * Pour cela, il faut afficher s�par�ment la premi�re et la derni�re ligne,
 * alors que les autres peuvent �tre affich�es par une boucle.
 */

public class Rectangle2 {
	public static void main(String[] args) {
		int l;
		Terminal.ecrireString("combien de lignes d��toiles ?:");
		l = Terminal.lireInt();
		Terminal.ecrireStringln("****");
		for (int i = 0; i < l-2; i = i + 1) {
			Terminal.ecrireStringln("*  *");
		}
		Terminal.ecrireStringln("****");
	}
}