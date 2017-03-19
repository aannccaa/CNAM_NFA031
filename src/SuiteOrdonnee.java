//Tester si trois nombres entiers sont triés dans l’ordre croissant ou décroissant
public class SuiteOrdonnee {
public static void main (String[] args){
	int n1, n2, n3;
	Terminal.ecrireString("Entrez n1:");
	n1=Terminal.lireInt();
	Terminal.ecrireString("Entrez n2:");
	n2=Terminal.lireInt();
	Terminal.ecrireString("Entrez n3:");
	n3=Terminal.lireInt();
	
	if (n1>=n2 && n2>=n3) {
		Terminal.ecrireString("Ordre decroissante");
	}
	if (n1<=n2 && n2<=n3) {
		Terminal.ecrireString("Ordre croissante");
	}
	else {
		Terminal.ecrireString("Les nombres introduits ne font pas partie d'une suite ordonnée");
	}
}
}
