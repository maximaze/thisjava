package sec03.exam03_accuracy;
public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; // 지수(8비트), 가수(23비트)
		System.out.println("float:num3=" + num3);

		num2 = (int) num3;
		System.out.println("int:num2=" + num2);
		
		int result = num1 - num2;
		System.out.println(result); // result: -4
	}
}

