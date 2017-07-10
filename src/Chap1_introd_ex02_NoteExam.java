/*
 Calculer la note finale d’une unité d’enseignement étant données la note du partiel et celle de
l’examen et sachant que :
– une note inférieure à 7 à l’examen est éliminatoire
– si la note d’examen est supérieure à 7, la note finale est la moyenne des deux notes si elle
avantage l’étudiant. Sinon, la note finale est la note d’examen.
 */

public class Chap1_introd_ex02_NoteExam {

	public static void main(String[] args) {
		double noteFinale;
		double notePartiel = 8;
		double noteExamen = 7;

		String message;

		if (noteExamen < 7) {
			message = "Eliminé car " + noteExamen + " <7.";
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
