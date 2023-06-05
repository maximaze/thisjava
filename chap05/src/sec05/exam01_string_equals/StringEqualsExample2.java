package sec05.exam01_string_equals;
public class StringEqualsExample2 {
	public static void main(String[] args) {
		String s1 = "�Ź�ö";
		String s2 = "�Ź�ö";
		String s3 = new String("�Ź�ö");
		String s4 = new String("�Ź�ö");

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
