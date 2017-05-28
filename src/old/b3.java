//Ecrire les, sur une ligne, les entiers impairs de 1 à 9
//la boucle while ne s'arrête pas car la condition i=10 n'est jamais vrai)
public class b3 {
	public static void main (String[] args) {
		
		int i=1;
		
		while (i!=10) {
			Terminal.ecrireString(i + ";");
			i=i+2;
		}
	}
}