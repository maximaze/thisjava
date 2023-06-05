package sec04.exam01_arithmetic;

public class CheckOverflowExample2 {
	final static int MIN_VALUE = -10;
	final static int MAX_VALUE = 10;
	
	public static void main(String[] args) {
		try {
			int result = safeAdd(-10, -5);
			System.out.println(result);
		} 
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int safeAdd(int left, int right)  {
		if((right > 0)) { 
			if(left > (MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생(+) : " + (left + right));
			}
		} 
		else {
			if(left < (MIN_VALUE - right)) { // -10 - (-5) = -5
				throw new ArithmeticException("오버플로우 발생(-) : " + (left + right));
			}
		}
		
		return left + right;
	}
}
