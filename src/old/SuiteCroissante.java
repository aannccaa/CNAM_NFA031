//tester si trois nombres entiers sont triés dans l’ordre croissant.

public class SuiteCroissante {
	public static void main (String[] args){
		int a, b, c;
		Terminal.ecrireString("Entrez a:");
		a=Terminal.lireInt();
		Terminal.ecrireString("Entrez b:");
		b=Terminal.lireInt();
		Terminal.ecrireString("Entrez c:");
		c=Terminal.lireInt();
		String message;
		if (a<=b && b<=c) {
			message = "Les entiers sont en ordre croissante.";
		}
		else {
			message = "Les entiers ne sont pas en ordre croissante.";
		}
		Terminal.ecrireStringln(message); 
	}
}
