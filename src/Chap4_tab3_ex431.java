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

public class Chap4_tab3_ex431 {

	public static void main(String[] args) {

		// Question 1
		int nbVendeurs = demanderNbVendeurs();
		int nbModelesVoitures = demanderNbModelesVoitures();

		String[] vendeurs = tabVendeurs(nbVendeurs);
		System.out.println("Les vendeurs sont: ");
		afficherTab1D(vendeurs);

		String[] modeles = tabModeles(nbModelesVoitures);
		System.out.println("Les modeles de voiture sont: ");
		afficherTab1D(modeles);

		// Question 2
		int[][] ventes = ventes(vendeurs, modeles);
		System.out.println("Le tableau des ventes/modele est :");
		afficherTab2D(ventes);

		int[] ventesParModele = ventesParModele(ventes);
		System.out.println("Le total des ventes/modele est :");
		afficherTab1D(ventesParModele);

		// variante
		int[] ventesParModele2 = ventesParModele(ventes);
		System.out.println("Variante. Le total des ventes/modele est :");
		afficherTab1D(ventesParModele2);

		// Question 3
		double[] prixModele = prixParModele(modeles);
		System.out.println("Les prix des modèles sont :");
		afficherTab1D(prixModele);
		
		double[] CA = chiffreAffaireParVendeur(ventes, prixModele);
		System.out.println("CA par vendeur est : ");
		afficherTab1D(CA);

	}

	public static int demanderNbVendeurs() {
		int result;
		System.out.print("Donner le nombre des vendeurs à introduire : ");
		result = Lire.i();
		return result;
	}

	public static int demanderNbModelesVoitures() {
		int result;
		System.out.print("Donner le nombre des modèles de voiture à introduire : ");
		result = Lire.i();
		return result;
	}

	public static int[][] ventes(String[] vendeurs, String[] modeles) {
		int[][] tab = new int[vendeurs.length][modeles.length];
		for (int vendeur = 0; vendeur < tab.length; vendeur++) {
			for (int modele = 0; modele < tab[0].length; modele++) {
				System.out.print(
						"Donner nb ventes pour vendeur " + vendeurs[vendeur] + " et voiture modèle " + modeles[modele] + " : ");
				tab[vendeur][modele] = Lire.i();
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

	public static void afficherTab1D(String[] tab) {

		String sep = "";
		System.out.print("{");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = ";";
		}
		System.out.println("}");
	}

	public static void afficherTab1D(double[] tab) {

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

		for (int vendeur = 0; vendeur < tab.length; vendeur++) {
			for (int modele = 0; modele < tab[0].length; modele++) {
				venteModeles[modele] = venteModeles[modele] + tab[vendeur][modele];
			}
		}
		return venteModeles;
	}

	public static int[] ventesParModele2(int[][] tab) {
		int[] ventesModeles = new int[tab[0].length];

		for (int modele = 0; modele < tab[0].length; modele++) {
			int totalVentesParModele = 0;
			for (int vendeur = 0; vendeur < tab.length; vendeur++) {
				totalVentesParModele = totalVentesParModele + tab[vendeur][modele];
			}
			ventesModeles[modele] = totalVentesParModele;
		}
		return ventesModeles;
	}

	public static String[] tabVendeurs(int nbVendeurs) {
		String[] tab = new String[nbVendeurs];
		String vendeur;

		for (int i = 0; i < tab.length; i++) {
			vendeur = "";
			System.out.print("Donner le nom du vendeur n° : ");
			vendeur = Lire.S();
			tab[i] = vendeur;
		}
		return tab;
	}

	public static String[] tabModeles(int nbModelesVoitures) {
		String[] tab = new String[nbModelesVoitures];
		String modele;

		for (int i = 0; i < tab.length; i++) {
			modele = "";
			System.out.print("Donner le nom du modèle n° " + i + " : ");
			modele = Lire.S();
			tab[i] = modele;
		}
		return tab;
	}

	public static double[] prixParModele(String[] modeles) {
		double[] tab = new double[modeles.length];
		double prix;
		for (int i = 0; i < tab.length; i++) {
			prix = 0;
			System.out.print("Donner le prix du modèle n° " + modeles[i] + " : ");
			prix = Lire.d();
			tab[i] = prix;
		}
		return tab;
	}

	public static double[] chiffreAffaireParVendeur(int[][] ventes, double[] prixModele) {
		double[] tab = new double[prixModele.length];
		double CA;
		for (int vendeur = 0; vendeur < tab.length; vendeur++) {
			CA = 0;
			for (int modele = 0; modele < ventes[0].length; modele++) {
				CA = CA + prixModele[modele] * ventes[vendeur][modele];
			}
			tab[vendeur] = CA;
		}

		return tab;
	}
}
