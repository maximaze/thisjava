package sec05.exam01_string_equals;
public class StringEqualsExample2 {
	public static void main(String[] args) {
		String s1 = "½Å¹ÎÃ¶";
		String s2 = "½Å¹ÎÃ¶";
		String s3 = new String("½Å¹ÎÃ¶");
		String s4 = new String("½Å¹ÎÃ¶");

		compareString(s1, s2);
		compareString(s3, s4);
		compareString(s1, s3);
		compareString(s2, s3);
	} 
	
	static void compareString(String s1, String s2) {
		boolean comp = (s1 == s2);
		System.out.printf("(%s) == (%s) -> (%b)\n", s1, s2, comp);
	}
}
