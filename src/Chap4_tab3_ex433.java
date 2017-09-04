/*
Exercice 4.3.3 image 
Question 1
On veut représenter une photo en noir et blanc comme un ensemble de points, 
avec pour chaque point un niveau de gris codé par un entier compris entre 0 (pour noir) et 255 (blanc). 
Les points ont des coordonnées cartésiennes (x,y) indiquant leur position sur l’image.

Ecrivez un programme (méthode main) qui contienne successivement :
 – la saisie d’une image au clavier. Pour cela, on pourra demander à l’utilisateur de rentrer 
 le niveau de gris de chaque point. Il faut vérifier que ce niveau de gris est bien compris entre 0 et 255.
– le calcul du nombre de points blancs sur cette image et le pourcentage des points qui sont blancs. 
Ce pourcentage pourra être de type entier ou de type nombre à virgule.
– l’éclaircissement de l’image obtenu en ajoutant 30 a ̀chaque niveau de gris, sans dépasser toutefois 
le nombre de 255 (par exemple 100 sera transformé en 130, 255 restera 255 et 240 deviendra 255).

Question 2
On peut représenter une image en couleur en donnant pour chaque point un niveau d’intensité 
pour une des couleurs fondamentales : rouge, vert et bleu. 
Ce niveau sera de 0 pour pas du tout de cette couleur, 255 pour le maximum de la couleur. 
On obtiendra les différentes nuances par mélange de couleur (par exemple, du rouge et du vert pour le jaune). 
Comment peut-on représenter une image en couleur dans une variable Java en n’utilisant 
que des constructions Java vues dans le cours NFA001 ? On demande une explication en 5 lignes maximum.
 */
public class Chap4_tab3_ex433 {

	public static void main(String[] args) {

		// Q1
		int width = getInt("Donner la largeur de l'image", 0, 0);
		int heigth = getInt("Donner l'hauteur de l'image", 0, 0);
		
//		int[][] imageNB = saisieImageNoirEtBlanc(width, heigth);
//		afficherImageNB(imageNB);
//
//		int nbPointsBlancs = nbPointsBlancs(imageNB);
//		System.out.println("Nb poins blancs (255) = " + nbPointsBlancs);
//		int nbPixels = width * heigth;
//		double ProcPointsBlancs = (nbPointsBlancs * 1.0 / nbPixels) * 100;
//		System.out.println(ProcPointsBlancs + " % sont des points blancs.");
//
//		int eclaircicement = 30;
//		int[][] imageNBeclaircie = eclaircicementImage(imageNB, eclaircicement);
//		afficherImageNB(imageNBeclaircie);

		// Q2
		int[][][] imageCouleur = saisieImageCouleur(width, heigth);
		afficherImageCouleur(imageCouleur);
	}

	public static int getInt(String message, int min, int max) {
		int result;
		String promptMessage;
		if (min < max) {
			promptMessage = message + " ( " + min + " - " + max + " ) : ";
		} else {
			promptMessage = message + " : ";
		}

		do {
			System.out.print(promptMessage);
			result = Lire.i();
		} while ((max > min) && ((max < result) || (result < min)));
		return result;
	}

	public static int[][] saisieImageNoirEtBlanc(int width, int heigth) {
		int[][] tab = new int[width][heigth];
		String message;
		for (int y = 0; y < heigth; y++) {
			for (int x = 0; x < width; x++) {
				message = "Donner le niveau de gris pour le point " + x + " - " + y + " : ";
				tab[x][y] = getInt(message, 0, 255);
			}
		}
		return tab;
	}

	public static void afficherImageNB(int[][] imageNB) {

		for (int i = 0; i < imageNB[0].length; i++) {
			System.out.print("{");
			String sep = "";
			for (int j = 0; j < imageNB.length; j++) {
				System.out.print(sep + imageNB[j][i]);
				sep = " ; ";
			}
			System.out.println("}");
		}
	}

	public static int nbPointsBlancs(int[][] tab) {
		int compteur = 0;

		for (int y = 0; y < tab[0].length; y++) {
			for (int x = 0; x < tab.length; x++) {
				if (tab[x][y] == 255) {
					compteur++;
				}
			}
		}
		return compteur;
	}

	public static int[][] eclaircicementImage(int[][] tab, int eclaircicement) {
		for (int y = 0; y < tab[0].length; y++) {
			for (int x = 0; x < tab.length; x++) {
				if (tab[x][y] <= 255 - eclaircicement) {
					tab[x][y] = tab[x][y] + 30;
				} else if (tab[x][y] > 255 - eclaircicement) {
					tab[x][y] = 255;
				}
			}
		}
		return tab;
	}

	public static int[][][] saisieImageCouleur(int width, int heigth) {
		int[][][] tab = new int[width][heigth][3];
		String message;
		for (int y = 0; y < heigth; y++) {
			for (int x = 0; x < width; x++) {
				for (int couleur = 0; couleur < 3; couleur++) {
					String couleurStr;
					if (couleur == 0) {
						couleurStr = "rouge";
					} else if (couleur == 1) {
						couleurStr = "vert";
					} else {
						couleurStr = "bleu";
					}

					message = "Donner le niveau de " + couleurStr + " pour le point " + x + " - " + y + " : ";
					tab[x][y][couleur] = getInt(message, 0, 255);
				}
			}
		}
		return tab;
	}

	public static void afficherImageCouleur(int[][][] image) {

		for (int y = 0; y < image[0].length; y++) {
			System.out.print("{");
			String sep = "";
			for (int x = 0; x < image.length; x++) {
				System.out.print(sep);
				afficherPointCouleur(image[x][y]);
				sep = ", ";
			}
			System.out.println("}");
		}
	}

	public static void afficherPointCouleur(int[] point) {
		String sep = "";
		for (int c = 0; c < 3; c++) {
			System.out.print(sep + point[c]);
			sep = "-";
		}
	}

}
