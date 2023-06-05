package sec02.exam01_byte;
public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125; // 1바이트
		int var2 = 125;  // 4바이트
		
		for(int i=0; i<5; i++) { // 5번 반복:0,1,2,3,4
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}
}
