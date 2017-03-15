public class Bloc {
	public static void main (String[] args) {/*debut bloc 1*/
		int a=2;
		Terminal.ecrireStringln("valeur de a: "+ a );
		if (a==0){
		/* debut bloc 2 */
		int b=3+a;
		Terminal.ecrireStringln("valeur de b: "+ b );
		} /* fin bloc 2*/
		else { /* debut bloc 3*/
		int c=3+a;
		Terminal.ecrireStringln("valeur de c: "+ c);
		} /* fin bloc 3*/
		Terminal.ecrireStringln("valeur de a: "+ a );
	} /* fin bloc 1*/
}