/*
 Calculer la note finale d�une unit� d�enseignement �tant donn�es la note du partiel et celle de
l�examen et sachant que :
� une note inf�rieure � 7 � l�examen est �liminatoire
� si la note d�examen est sup�rieure � 7, la note finale est la moyenne des deux notes si elle
avantage l��tudiant. Sinon, la note finale est la note d�examen.
 */

public class Chap1_introd_ex02_NoteExam {

	public static void main(String[] args) {
		double noteFinale;
		double notePartiel = 8;
		double noteExamen = 7;

		String message;

		if (noteExamen < 7) {
			message = "Elimin� car " + noteExamen + " <7.";
		} else {
			if (noteExamen < notePartiel) {
				noteFinale = (noteExamen + notePartiel) / 2;
			} else {
				noteFinale = noteExamen;
			}
			message = "Reussi avec note finale :" + noteFinale;
		}

		System.out.print(message);

	}

}
