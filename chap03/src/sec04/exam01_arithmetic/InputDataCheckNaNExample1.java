package sec04.exam01_arithmetic;

public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf( userInput ); // 문자열을 실수형 변환
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}

