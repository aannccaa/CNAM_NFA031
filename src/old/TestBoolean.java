/*
true and false = false 
true and true = true
not true = false
false or true = true

!a && !b = !(a || b)
!a || !b = ! (a && b)
*/

public class TestBoolean {
	public static void main(String[] args) {
		boolean a, b, c;
		Terminal.ecrireBooleanln(true && false);
		a = true;
		b = true;
		c = true;
		Terminal.ecrireBooleanln(b && c);
		Terminal.ecrireBooleanln(!a);
		Terminal.ecrireBooleanln(!a || (b && c));
	}
}

