package sec04.exam02_string_concat;

public class StringConcatExample {
	public static void main(String[] args) {
		// 연산자(+)에서 피연산자 중 한 쪽이 문자열이면?
		// 연산자(+)는 문자열 연산자로 처리
		// 문자열로 변환 시켜서 처리
		String str1 = "JDK" + 6.0;	// 문자열 + 숫자 -> 문자열
		String str2 = str1 + " Ư¡";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		
		// 숫자가 먼저 연산을 수행 후 문자열로 변환
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);		
	}
}