package sec04.exam01_arithmetic;
public class InfinityAndNaNCheckExample2 {
	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		
		// 정수타입인 경우 0으로 나누면 : ArithmeticException 예외발생
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// int z = x / y;
		
		try {
			int z1 = x / y;
			int z2 = x % y;
			System.out.println("z1: " + z1);
			System.out.println("z2: " + z2);
		} 
		catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		}
	}
}

