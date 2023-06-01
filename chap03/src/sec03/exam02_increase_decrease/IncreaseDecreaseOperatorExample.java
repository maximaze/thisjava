package sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------------");
		x++; // 증가연산자
		++x; // x = x + 1
		System.out.println("x=" + x); // 12

		System.out.println("-----------------------");		
		y--; // 감소연산자
		--y; // y = y - 1
		System.out.println("y=" + y); // 8 		

		System.out.println("-----------------------");		
		z = x++;
		System.out.println("z=" + z); // 12
		System.out.println("x=" + x); // 13
		
		System.out.println("-----------------------");		
		z = ++x;
		System.out.println("z=" + z); // 14
		System.out.println("x=" + x); // 14
		
		System.out.println("-----------------------");				
		z = ++x + y++; // 14+1(15) + 8 -> 23 
		System.out.println("z=" + z); // 23
		System.out.println("x=" + x); // 15
		System.out.println("y=" + y); // 8
	}
}

