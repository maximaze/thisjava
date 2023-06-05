package verify;
public class Exercise08A {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 3.0;
		
		double z = x % y;
		
		System.out.println("    몫: " + (x / y));
		System.out.println("나머지: " + (x % y));
		
		if( Double.isNaN(z) ) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} 
		else {
			System.out.println("결과: " + z);
		}
	}
}




