/*
*** Tableaux 2D
Exercice 4.3.1 Tableau de vente
On va considérer un tableau à deux dimensions qui regroupe les informations relatives aux ventes 
de voitures dans une concession. Une première dimension sert à représenter les différents modèles 
de voitures (une colonne pour chaque modèle). Une deuxième dimension sert à représenter les ventes 
d’un vendeur de l’entreprise (une ligne par vendeur). Une case contient le nombre de voitures d’un 
modèle donné vendu par un vendeur X. 
Par exemple :
Vendeur/Voiture			twingo		clio			mégane		vel satis
					--------------------------------------------------	
Andre					0			3				2			0
Ingemar					2			3				0			1
Jean-Jérôme				1			1				1			1
Cindy					5			1				0			0
Joey						1			1				2			0


Question 1
On suppose qu’il y a 4 modèles et 5 vendeurs. Ecrivez un programme qui crée le tableau des ventes 
et lit au clavier les données permettant de le remplir.
Question 2
Ecrivez un programme qui donne le nombre d’exemplaires vendus pour chacun des modèles.
Question 3
On donne le prix de chaque modèle dans un second tableau à une seule dimension. 
Ecrire un programme qui calcule le chiffre d’affaire généré par chacun des vendeurs, 
c’est à dire le total de ses ventes exprimé en euros.
 */

public class Chap4_tab3_ex431_Cata {

	public static void main(String[] args) {
		int vendeurs = 2;
		int modelesVoitures = 3;
		
		int[][] ventes = ventes(vendeurs, modelesVoitures);
		afficherTab2D(ventes);
		int[] ventesParModele = ventesParModele(ventes);
		afficherTab1D(ventesParModele);
		int[] ventesParModele2 = ventesParModele2(ventes);
		afficherTab1D(ventesParModele2);

	}

	public static int[][] ventes(int nbLignes, int nbCol) {
		int[][] tab = new int[nbLignes][nbCol];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[0].length; j++) {
				System.out.print("Donner nb ventes pour vendeur " + i + " et voiture modèle " + j + " : ");
				tab[i][j] = Lire.i();
			}
		}
		return tab;
	}

	public static void afficherTab2D(int[][] tab) {
		for (int i = 0; i < tab.length; i++) {
			String sep = "";
			System.out.print("{");
			for (int j = 0; j < tab[0].length; j++) {
				System.out.print(sep + tab[i][j]);
				sep = ";";
			}
			System.out.println("}");
		}
	}
	
	public static void afficherTab1D(int[] tab) {
		
			String sep = "";
			System.out.print("{");
			for (int i = 0; i < tab.length; i++) {
				System.out.print(sep + tab[i]);
				sep = ";";
			}
			System.out.println("}");
	}
	
	public static int[] ventesParModele(int[][] tab) {
		int[] venteModeles = new int[tab[0].length];
		
		for (int vanzator = 0; vanzator < tab.length; vanzator++) {
			for (int model = 0; model < tab[0].length; model++) {
				venteModeles[model] = venteModeles[model] + tab[vanzator][model];
			}
		}
		return venteModeles;
	}
	
	//variante
	public static int[] ventesParModele2(int[][] tab) {
		int[] venteModeles = new int[tab[0].length];
		
		for (int model = 0; model < tab[0].length; model++) {
			int totalVentesParModele = 0;
			for (int vanzator = 0; vanzator < tab.length; vanzator++) {
				totalVentesParModele = totalVentesParModele + tab[vanzator][model];
			}
			venteModeles[model] = totalVentesParModele;
		}
		return venteModeles;
	}

}
