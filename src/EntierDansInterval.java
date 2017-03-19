//Tester si un entier appartient à l’intervalle donné par deux nombres entiers.

public class EntierDansInterval {
	public static void main(String[] args) {
		int n, min, max, temp1, temp2;
		boolean dansInterval;
		Terminal.ecrireString("Entrez un nb. entier pour definir une extrémité d'interval: ");
		temp1 = Terminal.lireInt();
		Terminal.ecrireString("Entrez un nb. entier pour definir l' autre extrémité d'interval: ");
		temp2 = Terminal.lireInt();

		if (temp1 < temp2) {
			min = temp1;
			max = temp2;
		} else {
			min = temp2;
			max = temp1;
		}
		Terminal.ecrireString("Entrez en entier, pour test apartenance interval: ");
		n = Terminal.lireInt();

		dansInterval = n >= min && n <= max;
		String message;
		if (dansInterval) {
			message = n + " se trouve dans l'interval [" + min + ";" + max + "].";
		} else {
			message = n + " ne se trouve pas dans l'interval [" + min + ";" + max + "].";
		}
		Terminal.ecrireStringln(message);

	}
}