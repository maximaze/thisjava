package sec03.exam01_sign;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		int result3 = -s; 
		System.out.println("result3=" + result3);

		// Type mismatch: cannot convert from int to short
		// 컴파일 에러 : -s는 int로 변환되어 타입이 일치하지 않아 오류 발생
		// short result4 = -s;
		short result4 = (short)-s;
		System.out.println("result4=" + result4);
	}
}

