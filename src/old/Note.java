/*
� Calculer la note finale d�une unit� d�enseignement �tant donn�es la note du partiel et celle de
l�examen et sachant que :
� une note inf�rieure � 7 � l�examen est �liminatoire
� si la note d�examen est sup�rieure � 7, la note finale est la moyenne des deux notes si elle
avantage l��tudiant. Sinon, la note finale est la note d�examen.
*/

//public class Note {
//	public static void main (String[] args) {
//		double np, ne, nf; //note partiel, note exam, note finale
//		Terminal.ecrireString("Entrez note partiel :");
//		np = Terminal.lireDouble();
//		Terminal.ecrireString("Entrez note examen :");
//		ne = Terminal.lireDouble();
//		if (ne>=7) {
//			if (np>=ne) {
//				nf=(np+ne)/2;
//				Terminal.ecrireStringln("Reussi avec note finale :" + nf);
//			}
//			if (np<ne) {
//				nf=ne;
//				Terminal.ecrireStringln("Reussi avec note finale :" + ne);
//			}
//		}
//		else {
//			Terminal.ecrireStringln("Elimin�, car note examen inf�rieure � 7 ( " + ne +" )");						
//		}
//	}
//}

public class Note {
	public static void main(String[] args) {
		
		Terminal.ecrireString("Entrez note examen :");
		double noteExam;
		noteExam = Terminal.lireDouble();
		if (noteExam < 7) {
			Terminal.ecrireStringln("R�sultat: Elimin�, car note examen inf�rieure � 7 ( " + noteExam + " )");
		} else {
			double noteFinale;
			Terminal.ecrireString("Entrez note partiel :");
			double notePartiel = Terminal.lireDouble();
			if (notePartiel >= noteExam) {
				noteFinale = (notePartiel + noteExam) / 2;
			} else {
				noteFinale = noteExam;
			}
			Terminal.ecrireStringln("R�sultat: Reussi avec note finale :" + noteFinale);
		}
	}
}
