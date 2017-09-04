/*
Exercice 4.2.4 insertion de valeurs dans un tableau
Dans cet exercice, l’utilisateur fait des insertions dans un tableau de caractères. 
Au départ, le tableau est le suivant : {’x’, ’r’, ’1’, ’b’}

Question 1
L’utilisateur saisit le nombre de caractères qu’il veut ajouter dans le tableau, 
l’indice à partir duquel il veut les insérer et les caractères eux-mêmes. 
Notez que la taille des tableaux étant fixe en Java, on ne peut pas réellement insérer des éléments en plus. 
Ce qu’on fera sera de créer un nouveau tableau en recopiant les valeurs de l’ancien tableau 
et les nouvelles valeurs insérées conformément à la demande.
Par exemple, insérer ’a’, ’z’, ’t’ à l’indice 2 donnera le nouveau tableau : {’x’, ’r’, ’a’, ’z’, ’t’, ’1’, ’b’}
Question 2
Modifiez votre programme pour que des insertions successives soient possibles, tant que l’utilisateur le souhaite.
 */
public class Chap4_tab2_ex424 {

	public static void main(String[] args) {

		char[] tab = { 'x', 'r', '1', 'b' };
		// int n = 3;
		int indice = 2;
		// char[] tabInsert = { 'a', 'z', 't' };
		String stringToInsert = creerStringInsert();
		System.out.println(stringToInsert);

		char[] tabInsert = stringToTab(stringToInsert);
		afficherTab(tabInsert);

		char[] tab1 = creerTab1(tab, indice);
		char[] tab2 = creerTab2(tab, indice);
		afficherTab(tab);
		afficherTab(tab1);
		afficherTab(tab2);

		char[] tabConcatTemp = concatTab(tab1, tabInsert);
		char[] tabConcatFinale = concatTab(tabConcatTemp, tab2);
		afficherTab(tabConcatFinale);

	}

	public static char[] creerTab1(char[] tab, int indice) {
		char[] tab1 = new char[indice];
		for (int i = 0; i < indice; i++) {
			tab1[i] = tab[i];
		}

		return tab1;
	}

	public static char[] creerTab2(char[] tab, int indice) {
		char[] tab2 = new char[tab.length - indice];
		int indiceTab2 = 0;
		for (int i = indice; i < tab.length; i++) {
			tab2[indiceTab2] = tab[i];
			indiceTab2++;
		}

		return tab2;
	}

	public static char[] concatTab(char[] tab1, char[] tab2) {
		char[] tabConcat = new char[tab1.length + tab2.length];
		int indiceTabConcat = 0;

		for (int i = 0; i < tab1.length; i++) {
			tabConcat[indiceTabConcat] = tab1[i];
			indiceTabConcat++;
		}
		for (int i = 0; i < tab2.length; i++) {
			tabConcat[indiceTabConcat] = tab2[i];
			indiceTabConcat++;
		}

		return tabConcat;
	}

	public static void afficherTab(char[] tab) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = ";";
		}
		System.out.println("}");
	}

//	public static boolean continuer(char c) {
//		boolean continue;
//		
//		if (c == '0') {
//			continue = false;
//		} else {
//			continue = true;
//		}
//		
//		return continue;
//	}

	public static String creerStringInsert() {
		char c;
		char choix;
		int compteur = 0;
		String result = "";

		do {
			System.out.print("Donner un charactère (0 pour terminer):");
			c = Lire.c();
			if (c == '0') {
				break;
			} else {
				compteur++;
				result = result + c;
			}
		} while (c != '0');

		return result;
	}

	public static char[] stringToTab(String s) {
		char[] tab = new char[s.length()];

		for (int i = 0; i < tab.length; i++) {
			tab[i] = s.charAt(i);
		}
		return tab;
	}
}
