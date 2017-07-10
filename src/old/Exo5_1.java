class Exo5_1 {
	public static void main(String[] args) {
		int x;
		Terminal.ecrireString("Un entier svp: ");
		x = Terminal.lireInt();
		for (int i = 0; i < 4; i++) {
			Terminal.ecrireInt(x + i);
			Terminal.sautDeLigne();
		}
		Terminal.ecrireStringln("Fini");
	}
}