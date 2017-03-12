public class PrixTTC {
	public static void main (String[] args) {
		double pHT,pTTC;
		int t;
		Terminal.ecrireString("Entrez le prix HT: ");
		pHT = Terminal.lireDouble();
		
		Terminal.ecrireString("Ecrire le taux (normal ->0; reduit->1) ");
		t=Terminal.lireInt();
		if (t==0) {
			pTTC=pHT+pHT*19.96/100;
		}
		else {
			pTTC=pHT+pHT*5.5/100;
		}
		Terminal.ecrireStringln("La somme TTC: "+ pTTC);		
	}
}	
			