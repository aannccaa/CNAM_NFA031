/*
Exercice 4.2.2 tableau de booleens
Ecrivez un programme qui saisit au clavier 4 valeurs booléennes (true ou false en Java) 
et qui affiche ensuite le résultat de l’opération ET sur toutes ces valeurs ainsi que 
le résultat de l’opération ou sur toutes ces valeurs.
Par exemple, si le tableau est {true, true, false, true}
Le résultat du ET vaut la valeur de true && true && false && true,c’est a ̀dire false. 
Le programme fera d’abord la saisie, puis une fois le tableau complet, il calculera les réponses
demandées.

 */
public class Chap4_tab2_ex422 {

	public static void main(String[] args) {
		int n = 4;
		
		boolean[] tab = creerTab(n);
		afficherTab(tab);
		
		System.out.println("ET : " + et(tab));
		System.out.println("OR : " + or(tab));
	}

	public static boolean[] creerTab(int n) {
		boolean[] tab = new boolean[n];
		int temp;
		for (int i = 0; i < tab.length; i++) {
			System.out.print("Donnez un valeur true(1)/false(0) pour l'indice :" + i + " : ");
			temp = Lire.i();

			if (temp == 0) {
				tab[i] = false;
			} else {
				tab[i] = true;
			}

		}
		return tab;
	}

	public static void afficherTab(boolean[] tab) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = ";";
		}
		System.out.println("}");
	}
	
	public static boolean et(boolean[] tab) {
		boolean result=true;
	
		for(int i=0; i<tab.length;i++) {
			result = result && tab[i];
		}
		return result;
	}
	
	public static boolean or(boolean[] tab) {
		boolean result=false;
	
		for(int i=0; i<tab.length;i++) {
			result = result || tab[i];
		}
		return result;
	}

}
