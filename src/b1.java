//Ecrire les, sur une ligne, les entiers de 1 � 9
//la boucle while s'arr�te d�s que la condition i=10 et vrai
public class b1 {
	public static void main (String[] args) {
		
		int i=1;
		
		while (i!=10){
			Terminal.ecrireString(i + ";");
			i=i+1;
		}
	}
}