/*
 On represente les noms des eleves d’une classe au moyen d’un tableau de String et leurs notes au moyen `
d’un tableau de double. Les deux tableaux ont la meme longueur et l’ordre est le m ˆ eme dans les deux ˆ
tableaux. Par exemple, si le nom d’un eleve est dans la 5 ` eme case du tableau de noms, alors sa note est dans `
la 5eme case du tableau de notes. Chaque ` eleve a une seule note. `
Dans cet exercice, on vous demande d’ecrire des m ethodes, il n’est pas demand e de main. Ces m ethodes ´
ne doivent faire aucun affichage et aucune lecture au clavier.
1. ecrivez une m ethode qui renvoie le num ero de la case contenant le nom d’un eleve. On rappelle que `
la comparaison de String se fait avec la methode equals. Si le nom n’est pas celui d’un eleve de la `
classe, la methode renvoie -1. ´
2. ecrivez une m ethode qui renvoie la note d’un eleve dont on donne le nom. Si le nom donn ` e, n’est pas ´
celui d’un eleve de la classe, la m ` ethode renvoie -1.0. Vous pouvez utiliser la m ethode d efinie a la `
question precedente. ´
3. ecrivez une m ethode qui calcule le nombre d’ eleves ayant au-dessus de 10. `
4. ecrivez une m ethode qui renvoie la nom de l’ eleve qui a la meilleure note de la classe (ou un d’entre `
ceux qui ont la meilleure note en cas d’ex-aequo).
 */
public class Exam2012_2_ex5 {

	public static void main(String[] args) {
		String[] noms = { "A", "B", "C" };
		double[] notes = { 10.5, 7, 10.5 };
		String nume = "B";
		double seuil = 10.0;
		System.out.println(getIndex(nume, noms));
		System.out.println(getNote(nume, noms, notes));
		System.out.println(getElevesSupSeuil(seuil, notes));
		System.out.println(getBestEleve(noms, notes));
		printVector(getNomsBestEleves(noms, notes));
	}

	public static void printVector(String[] tab){
		String sep = "";
		for (int i=0; i<tab.length;i++){
			System.out.print(sep + tab[i]);
			sep = ";";
		}
		System.out.println();
	}
	public static String getBestEleve(String[] noms, double[] notes) {
		String numeBestEleve;
		int indexBestEleve = getIndexMax(notes);
		if (indexBestEleve < 0) {
			numeBestEleve = "???";
		} else {
			numeBestEleve = noms[indexBestEleve];
		}
		return numeBestEleve;
	}

	public static double getMax(double[] values) {
		double max;
		int indexMax = getIndexMax(values);
		max = values[indexMax];
		return max;
	}

	public static int getNbBestEleves(double[] notes) {
		double max = getMax(notes);
		int nbBestEleves = getElevesSupSeuil(max, notes);

		return nbBestEleves;
	}

	public static String[] getNomsBestEleves(String[] noms, double[] notes) {
		String[] nomsBestEleves = new String[getNbBestEleves(notes)];
		double maxNotes = getMax(notes);
		int positionLibre = 0;
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] == maxNotes) {
				nomsBestEleves[positionLibre] = noms[i];
				positionLibre++;
			}
		}
		return nomsBestEleves;
	}

	public static int getIndexMax(double[] values) {
		int indexMax = -1;
		double temp = Double.MIN_VALUE;
		for (int i = 0; i < values.length; i++) {
			if (values[i] > temp) {
				temp = values[i];
				indexMax = i;
			}
		}
		return indexMax;
	}

	public static int getElevesSupSeuil(double seuil, double[] notes) {
		int nbElevesSupSeuil = 0;
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] >= seuil) {
				nbElevesSupSeuil++;
			}
		}
		return nbElevesSupSeuil;
	}

	public static double getNote(String nume, String[] noms, double[] notes) {
		double note;
		int indexNume = getIndex(nume, noms);
		if (indexNume < 0) {
			note = -1.0;
		} else {
			note = notes[indexNume];
		}
		return note;
	}

	public static int getIndex(String valDeCautat, String[] valori) {
		int index = -1;
		for (int i = 0; i < valori.length; i++) {
			if (valori[i].equals(valDeCautat)) {
				index = i;
				break;
			}
		}
		return index;
	}

}
