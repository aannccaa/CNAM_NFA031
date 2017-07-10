//affiche prix TCC pour un prix HT et taux rentrés par l'utilisateur
public class PrixTTC {
	public static void main (String[] args) {
		//Instructions du programme:
		//1. déclaration de pHT et pTTC
		double pHT,pTTC;
		//2. déclaration de t
		int t;
		//3. affichage du message "Entrer le prix HT:"
		Terminal.ecrireString("Entrez le prix HT: ");
		//4. la variable pHT reçoit la valeur entrée au clavier.
		pHT = Terminal.lireDouble();
		//5. affichage du message "Entrer taux (normal->0 reduit ->1)"
		Terminal.ecrireString("Ecrire le taux (normal ->0; reduit->1) ");
		//6. la variable t reçoit la valeur entrée au clavier (0 ou 1)
		t=Terminal.lireInt();
		/* 
		  7. Java reconnaît le mot clé if et fait donc les choses suivantes :
			(a) il calcule l’expression qui est entre les parenthèses t==0. Le résultat de t==0 dépend de
			ce qu’a entré l’utilisateur. S’il a entré 0 le résultat sera true, sinon il sera false.
			(b) Si le résultat est true, les instructions entre les accolades sont exécutées. Ici, il n’y en a
			qu’une : pTTC=pHT + (PHT*0.196); qui a pour effet de donner a pTTC le prix TTC
			avec taux normal. Si le résultat est false, il exécute les instructions dans les accolades
			figurant après le else :pTTC=pHT + (PHT*0.05);
		 */
		if (t==0) {
			pTTC=pHT+pHT*19.96/100;
		}
		else {
			pTTC=pHT+pHT*5.5/100;
		}
		//8. la valeur de pTTC est affichée.
		Terminal.ecrireStringln("La somme TTC: "+ pTTC);		
	}
}	