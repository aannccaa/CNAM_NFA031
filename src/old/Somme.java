
//// boucle while
//public class Somme {
//	public static void main (String[] args) {
//		int n, total;
//		//Initialisation du total
//		Terminal.ecrireString("Entrez un entier (fin avec 0): ");
//		n = Terminal.lireInt();
//		total=0;
//		while (n!=0) {
//			total=total+n; //Calcul
//			Terminal.ecrireString("Entrez un entier (fin avec 0): ");// Nouvelle saisie de n
//			n=Terminal.lireInt(); //Modification variable du test
//		}
//		Terminal.ecrireStringln("La somme totale est :" + total);
//	}
//}

//boucle do-while
public class Somme {
	public static void main (String[] args) {
		int n, total;
		total=0;
		do {
			Terminal.ecrireString("Entrez un entier (fin avec 0): ");
			n=Terminal.lireInt(); //Saisie de n
			total=total+n;
		}
		while (n!=0); 
		Terminal.ecrireStringln("La somme totale est :" + total);
	}
}