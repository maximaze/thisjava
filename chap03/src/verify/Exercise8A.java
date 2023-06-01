package verify;
public class Exercise8A {
	public static void main(String[] args) {
	  double x = 5.0;
		double y = 1.3;
		
		double z = 5 % y;
		
		System.out.println("    몫: " + (x/y));
		System.out.println("나머지: " + (x%y));
		System.out.println("환  산: " + ((4*y)+(x%y)));
		if( Double.isNaN(z) ) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			System.out.println("결  과: " + z);
		}
	}
}




