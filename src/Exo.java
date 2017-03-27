/*
Compilez puis exécutez ce programme. En vous aidant des messages affichés, identifiez les instructions qui
les ont produit et expliquez ce que le programme fait. Donnez au moins deux exemples d'exécution avec les
messages affichés à chaque fois. Que se passe-t-il si les valeurs saisies pour a,b,c sont égales?
*/

//public class Exo {
//	public static void main(String[] arguments) {
//		int a, b, c;
//		boolean abc_tries_asc;
//		Terminal.ecrireString("a ? ");
//		a = Terminal.lireInt();
//		Terminal.ecrireString("b ? ");
//		b = Terminal.lireInt();
//		Terminal.ecrireString("c ? ");
//		c = Terminal.lireInt();
//		abc_tries_asc = (a < b) && (b < c);
//		Terminal.ecrireBooleanln(abc_tries);
//		Terminal.ecrireStringln("\n");
//	}
//}

/*
 Changez ce programme de manière à afficher true lorsque a,b,c sont triés dans un ordre décroissant ou égal
(chaque element est plus petit ou egal au precedent).
 */
public class Exo {
	public static void main(String[] arguments) {
		int a, b, c;
		boolean abc_tries_desc;
		Terminal.ecrireString("a ? ");
		a = Terminal.lireInt();
		Terminal.ecrireString("b ? ");
		b = Terminal.lireInt();
		Terminal.ecrireString("c ? ");
		c = Terminal.lireInt();
		abc_tries_desc = (c <= b) && (b <= a);
		Terminal.ecrireBooleanln(abc_tries_desc);
		Terminal.ecrireStringln("\n");
	}
}