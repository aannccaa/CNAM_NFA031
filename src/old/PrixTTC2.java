//affiche prix TCC pour un prix HT et taux rentrés par l'utilisateur
public class PrixTTC2 {
	public static void main (String[] args) {
		double pHT,pTTC;
		int t=0;
		boolean testReponse=false;
		Terminal.ecrireString("Entrez le prix HT: ");
		pHT = Terminal.lireDouble();
		
		while (testReponse==false){
			Terminal.ecrireString("Ecrire le taux (normal ->0; reduit->1) ");
			t=Terminal.lireInt();
			if (t==0 || t==1){
				testReponse=true;
			}
			else {
				testReponse=false;
			}
		}
		if (t==0){
			pTTC=pHT+pHT*19.96/100;
		}
		else {
			pTTC=pHT+pHT*5.5/100;
		}
		Terminal.ecrireStringln("La somme TTC: "+ pTTC);		
	}
}	