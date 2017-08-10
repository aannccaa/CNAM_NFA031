/*
Exercice 4.2.1 somme des premiers entiers
Ecrivez un programme qui saisit un nombre n au clavier et qui calcule un tableau 
dont le plus grand indice est n et dans lequel il y a, 
pour chaque case d’indice i, la somme des entiers compris entre 0 et i.
Par exemple, si n vaut 3, le tableau sera: 0 1 3 6
La valeur de la case d’indice 3 est la somme des entiers entre 0 et 3, c’est à dire 0+1+2+3=6.

 */
public class Chap4_tab2_ex421 {

	public static void main(String[] args) {
		int n = 3;
		
		n = fournirN();
		int[] tab = creerTab(n);
		afficherTab(tab);

	}

	public static int fournirN() {
		int n;
		System.out.print("Donnez n :");
		n = Lire.i();
		return n;
	}
	
	
	public static int[] creerTab(int n) {
		int[] tab = new int[n+1];
		int temp=0;
		for (int i = 0; i < tab.length; i++) {
			temp = temp+i;
			tab[i] = temp;
		}

		return tab;
	}
	
	public static void afficherTab(int[] tab) {
		String sep="";
		System.out.print("{");
		for(int i=0; i<tab.length;i++) {
			System.out.print(sep + tab[i]);
			sep = ";";
		}
		System.out.println("}");
	}

}
