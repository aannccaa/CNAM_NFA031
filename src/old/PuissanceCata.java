public class PuissanceCata {
	public static void main(String[] args) {

		Terminal.ecrireStringln("Teste:");
		double n = Double.NaN;
		double[][] refs = { 
				//-2     -1   0   1  2
				{ 0.25, -0.5, 1, -2, 4 },//x=-2		, linia=0
				{ 1   , -1  , 1, -1, 1 },//x=-1	,linia =1	
				{ 1   , 1   , n,  1, 1 },//x=0		
				{ 1   , 1   , 1,  1, 1 },//x=1		
				{ 0.25, 0.5 , 1,  2, 4 },//x=2		
		};

		for (int m = -2; m < 4; m++) {
			for (int e = -2; e < 3; e++) {
				if((m == 0 && e == 0) || m >= 3){
					continue;
				}
				double resultat = puissance(m, e);
				String testResultat;
				double resultatAsteptat = refs[m+2][e+2];
				
				if(resultat == resultatAsteptat ){
					testResultat = "  ok";
				}else {
					testResultat = "  ko,  " + resultatAsteptat;
				}
				Terminal.ecrireStringln("" + m + "^" + e + " = " + resultat + testResultat);
			}
		}
	}

	static double puissance(double x, int y) {
		if (y == 0) {
			if (x == 0) {
				return Double.NaN;
			} else {
				return 1;
			}
		}

		if (x == 0) {
			return 1;
		}

		if (y < 0) {
			x = 1 / x;
			y = -y;
		}

		double result = 1;
		for (int i = 0; i < y; i++) {
			result = result * x;
		}

		return result;
	}

}