package sec04.exam03_compare;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		
		// 부동소숫점에서 0.1은 정확하게 표현 할 수 없다.
		System.out.println("v4(0.1) ->" + v4);
		System.out.println("v5(0.1f) ->" + v5);
		
		System.out.println(v4 == v5); // false
		
		System.out.println((float)v4 == v5); // true
		
		System.out.println(v4 == (double)v5); // false
		
		System.out.println((int)(v4*10) == (int)(v5*10)); //true
	}
}

