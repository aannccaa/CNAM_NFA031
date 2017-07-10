//affiche prix TCC pour un prix HT et taux rentrés par l'utilisateur
public class PrixTTC3 {
	public static void main (String[] args) {
		double pHT,pTTC;
		Terminal.ecrireString("Entrez le prix HT: ");
		pHT = Terminal.lireDouble();
		
		int t=-1;
		
		while(true){
			Terminal.ecrireString("Ecrire le taux (normal ->0; reduit->1) ");
			t=Terminal.lireInt();
			if(t==0 || t==1){
				break;
			}
		}
		
//		while(true){
//			Terminal.ecrireString("Ecrire le taux (normal ->0; reduit->1) ");
//			t=Terminal.lireInt();
//			if(t==0 || t==1){
//				break;
//			}
//		}
//		
//		int t = -1:
//		while (t!=0 && t!=1){
//			Terminal.ecrireString("Ecrire le taux (normal ->0; reduit->1) ");
//			t=Terminal.lireInt();
//			
//		}
	
		if (t==0){
			pTTC=pHT+pHT*19.96/100;
		}
		else {
			pTTC=pHT+pHT*5.5/100;
		}
		
		Terminal.ecrireStringln("La somme TTC: "+ pTTC);		
	}
}	