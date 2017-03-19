//Le programme suivant ne compile pas. Signalez les erreurs, et expliquez leur nature : de syntaxe, de
//typage, variable non déclarée, variable déclarée mais non initialisée, ou appel de méthode invalide.
public class Td3_1 {
	public static void main (String [] arguments) {
		d double; //err de typage, variable d mal déclarée (correct: double d;)
		int x=7;
		int z;
		char c = 'k';
		x = x + z;
		Terminal.ecrireString("c= " + c);
		boolean tt;
		tt=x+4;//variable x déclaré mais non initialisée
		bb = 3 < tt; //var bb non déclaré / err de syntaxe (3 < boolean)
		x+1 = 3; //err de syntaxe, correct serait variable x= non x+1=
		Terminal.lireInt();
		Terminal.lireInt(7); //appel de méthode invalide, méthode lireInt n'attend pas de parametre)
		Terminal.ecrireInt(Terminal.lireInt() + 4);
		Math.min(Terminal.lireInt(), x);
		Terminal.ecrireInt(Math.min(Terminal.lireInt(), x));
		x = Terminal.ecrireInt(5);////appel de méthode invalide, ne doit pas commencer par x=
		Terminal.ecrireInt(5);
		Terminal.ecrireInt();//appel de méthode invalide, ecrireInt(int) attend un paramettre type entier
	}
}