package sec04.exam01_arithmetic;
public class InfinityAndNaNCheckExample2 {
	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		
		// ����Ÿ���� ��� 0���� ������ : ArithmeticException ���ܹ߻�
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// int z = x / y;
		
		try {
			int z1 = x / y;
			int z2 = x % y;
			System.out.println("z1: " + z1);
			System.out.println("z2: " + z2);
		} 
		catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵ�");
		}
	}
}

