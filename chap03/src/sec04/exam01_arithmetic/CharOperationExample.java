package sec04.exam01_arithmetic;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		// 컴파일 에러
		// Type mismatch: cannot convert from int to char
		// char c3 = c2 + 1;
		
		//char c3 = (char)c2 + 1;
		//System.out.println("c3: " + c3);
	}
}
