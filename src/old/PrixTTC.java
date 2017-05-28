//affiche prix TCC pour un prix HT et taux rentr�s par l'utilisateur
public class PrixTTC {
	public static void main (String[] args) {
		//Instructions du programme:
		//1. d�claration de pHT et pTTC
		double pHT,pTTC;
		//2. d�claration de t
		int t;
		//3. affichage du message "Entrer le prix HT:"
		Terminal.ecrireString("Entrez le prix HT: ");
		//4. la variable pHT re�oit la valeur entr�e au clavier.
		pHT = Terminal.lireDouble();
		//5. affichage du message "Entrer taux (normal->0 reduit ->1)"
		Terminal.ecrireString("Ecrire le taux (normal ->0; reduit->1) ");
		//6. la variable t re�oit la valeur entr�e au clavier (0 ou 1)
		t=Terminal.lireInt();
		/* 
		  7. Java reconna�t le mot cl� if et fait donc les choses suivantes :
			(a) il calcule l�expression qui est entre les parenth�ses t==0. Le r�sultat de t==0 d�pend de
			ce qu�a entr� l�utilisateur. S�il a entr� 0 le r�sultat sera true, sinon il sera false.
			(b) Si le r�sultat est true, les instructions entre les accolades sont ex�cut�es. Ici, il n�y en a
			qu�une : pTTC=pHT + (PHT*0.196); qui a pour effet de donner a pTTC le prix TTC
			avec taux normal. Si le r�sultat est false, il ex�cute les instructions dans les accolades
			figurant apr�s le else :pTTC=pHT + (PHT*0.05);
		 */
		if (t==0) {
			pTTC=pHT+pHT*19.96/100;
		}
		else {
			pTTC=pHT+pHT*5.5/100;
		}
		//8. la valeur de pTTC est affich�e.
		Terminal.ecrireStringln("La somme TTC: "+ pTTC);		
	}
}	