//Le programme suivant ne compile pas. Signalez les erreurs, et expliquez leur nature : de syntaxe, de
//typage, variable non d�clar�e, variable d�clar�e mais non initialis�e, ou appel de m�thode invalide.
public class Td3_1 {
	public static void main (String [] arguments) {
		d double; //err de typage, variable d mal d�clar�e (correct: double d;)
		int x=7;
		int z;
		char c = 'k';
		x = x + z;
		Terminal.ecrireString("c= " + c);
		boolean tt;
		tt=x+4;//variable x d�clar� mais non initialis�e
		bb = 3 < tt; //var bb non d�clar� / err de syntaxe (3 < boolean)
		x+1 = 3; //err de syntaxe, correct serait variable x= non x+1=
		Terminal.lireInt();
		Terminal.lireInt(7); //appel de m�thode invalide, m�thode lireInt n'attend pas de parametre)
		Terminal.ecrireInt(Terminal.lireInt() + 4);
		Math.min(Terminal.lireInt(), x);
		Terminal.ecrireInt(Math.min(Terminal.lireInt(), x));
		x = Terminal.ecrireInt(5);////appel de m�thode invalide, ne doit pas commencer par x=
		Terminal.ecrireInt(5);
		Terminal.ecrireInt();//appel de m�thode invalide, ecrireInt(int) attend un paramettre type entier
	}
}