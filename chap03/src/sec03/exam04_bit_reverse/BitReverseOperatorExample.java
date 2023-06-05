package sec03.exam04_bit_reverse;
public class BitReverseOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;     // 비트 반전 연산자(~) : Tilde(틸드), 물결무늬
		int v3 = ~v1 + 1; // 2의 보수
		System.out.println(toBinaryString(v1) + " (십진수: " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (십진수: " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (십진수: " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.println(toBinaryString(v4) + " (십진수: " + v4 + ")");
		System.out.println(toBinaryString(v5) + " (십진수: " + v5 + ")");
		System.out.println(toBinaryString(v6) + " (십진수: " + v6 + ")");
	}
	
	// 정수값을 바이너리(2진수) 형태의 문자열을 생성
	// 양수값인 경우 32비트 왼쪽 공백에 '0'을 채워줌
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
