/*
Question 1 (boucle simple)
Réalisez un programme qui dira si un nombre saisi au clavier est premier. 
Pour cela, on verra s’il est divisible par au moins un nombre compris entre 2 et lui-même - 1. 
Par exemple, 5 est premier car il n’est divisible ni par 2, ni par 3, ni par 4. 
Remarque : 1 n’est pas considéré comme premier.
Pour savoir si a est divisible par b, il suffit de tester si a % b == 0
Question 2 (boucles imbriquées)
Écrire un programme qui affichera les 100 premiers nombres premiers (attention, on n’a pas dit les nombres premiers inférieurs à 100 !).
Réfléchissez au type de boucle le plus approprié pour la boucle extérieure.
 */
public class Chap3_boucles2_ex323 {

	public static void main(String[] args) {
		question1();
		
		int nb = 10;

		int[] tab = creerTabNbPremiers(nb);
		afficherTab(tab);
	}

	private static void question1() {
		int n;
		
		do {
			System.out.print("Donner un entier positif (0 pour annuler) : ");
			n = Lire.i();
			if (n > 0) {
				boolean nombrePremier = estPremier(n);
				if (nombrePremier == true) {
					System.out.println(n + " est premier");
				} else {
					System.out.println(n + " n'est pas est premier");
				}
			}

		} while (n != 0);
	}

	public static boolean estPremier(int n) {
		boolean isPremier = true;
		if (n == 1) {
			isPremier = false;
		} else {
			int i;
			//for (i = 2; i*i <= n; i++) {
			
			for (i = 2; i < n; i++) {
				if(i*i>n) {
					break;
				}
				if ((n % i == 0)) {
					isPremier = false;
					break;

				}
			}
			System.out.println(i);
		}
		return isPremier;
	}

	// variante2
	public static boolean estPremier2(int n) {
		boolean estPremier = true;
		if (n == 1) {
			return estPremier = false;
		} else {
			for (int i = 2; i < n; i++) {
				if ((n % i == 0) || (n == 1)) {
					estPremier = false;
					break;

				}
			}
			return estPremier;
		}

	}

	public static int[] creerTabNbPremiers(int nb) {
		int[] tab = new int[nb];
		int positionCourrante = 0;
		int nbATester = 2;
		while (positionCourrante < nb) {
			if (estPremier(nbATester)) {
				tab[positionCourrante] = nbATester;
				positionCourrante++;
			}
			nbATester++;
		}
		return tab;
	}

	public static void afficherTab(int[] tab) {
		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = "; ";
		}
		System.out.println("}");

	}
}
