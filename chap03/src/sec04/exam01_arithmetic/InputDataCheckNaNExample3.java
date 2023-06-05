package sec04.exam01_arithmetic;

public class InputDataCheckNaNExample3 {
	public static void main(String[] args) {
		String userInput = "Hello";
		
		// Exception in thread "main" java.lang.NumberFormatException: 
		// For input string: "Hello"
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		} 
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
