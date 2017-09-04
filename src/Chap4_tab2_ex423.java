/*
Exercice 4.2.3 conversion d’euros
Calculer un tableau de valeurs en francs obtenus en convertissant les valeurs d’un autre tableau, 
exprimées en euros et saisies au clavier.
Dans ce programme, il y aura deux tableaux, teuros et tfrancs. 
Votre programme saisira au clavier un certain nombre de valeurs en euros. 
Une fois ce tableau saisi, le tableau tfrancs sera calculé. 
Par exemple, la valeur de la première case de tfrancs sera obtenue en convertissant en francs 
la valeur de la première case de teuros.
A la fin, les deux tableaux seront affichés.

 */
public class Chap4_tab2_ex423 {

	public static void main(String[] args) {
		int n=2;
		double tauxChange1EUR_en_FRF = 6.55957;
		double[] teuro = creerTabEur(n);
		afficherTab(teuro);
		
		double[] tfrancs = creerTabFRF(teuro, tauxChange1EUR_en_FRF);
		afficherTab(tfrancs);
	}
	
	public static double[] creerTabEur(int n) {
		double[] teuro = new double[n];
		for (int i=0; i<teuro.length; i++) {
			System.out.print("Donner un mnt en euro : ");
			teuro[i] = Lire.d();
		}
		
		return teuro;
	}
	
	public static double[] creerTabFRF(double[] teuro, double tauxChange1EUR_en_FRF) {
		double[] tfrancs = new double[teuro.length];
		for(int i=0; i< tfrancs.length; i++) {
			tfrancs[i] = tauxChange1EUR_en_FRF*teuro[i];
		}
		return tfrancs;
	}

	public static void afficherTab(double[] tab) {
		String sep = ""; 
		System.out.print("{");
		for(int i=0; i<tab.length; i++) {
			System.out.print(sep + tab[i]);
			sep = ";";
		}
		System.out.println("}");
	}
}
