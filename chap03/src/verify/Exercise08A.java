package verify;
public class Exercise08A {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 3.0;
		
		double z = x % y;
		
		System.out.println("    ��: " + (x / y));
		System.out.println("������: " + (x % y));
		
		if( Double.isNaN(z) ) {
			System.out.println("0.0���� ���� �� �����ϴ�.");
		} 
		else {
			System.out.println("���: " + z);
		}
	}
}




