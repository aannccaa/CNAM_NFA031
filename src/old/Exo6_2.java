//combien de fois on peut multiplier un nombre introduit 
//par l'utilisateur par lui m�me pour obtenir un r�sultat inf�rieur � 1000?
class Exo6_2 {
	public static void main(String[] args) {
		int puis = 1;
		int x, res;
		Terminal.ecrireString("Un entier svp: ");
		x = Terminal.lireInt();
		res = x;
		while (res < 1000) {
			res = res * x;
			puis = puis + 1;
		}
		Terminal.ecrireString("Le r�sultat est ");
		Terminal.ecrireInt(puis);
		Terminal.sautDeLigne();
	}
}