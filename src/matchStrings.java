// tester qu'un string se retrouve dans un autre string, à une position donnée.
public class matchStrings {

	public static void main(String[] args) {
		String mare = "abcde";
		int indiceStringMare = 2;
		String mic = "cde";

		boolean match = matchString(mare, mic, indiceStringMare);
		System.out.println(match);
		
		System.out.println(searchString(mare, mic));
	}

	public static boolean matchString(String mare, String mic, int index) {
		
		if(index + mic.length() > mare.length()) {
			return false;
		}
		for (int i=0; i<mic.length();i++) {
			if (mic.charAt(i) != mare.charAt(index+i)) {
				return false;
			}
		}

		return true;
	}
	
	public static int searchString(String mare, String mic) {
		
		for (int i=0; i<mare.length();i++) {
			if (matchString(mare, mic, i)) {
				return i;
			}
		} 
		return -1;
	}
}
