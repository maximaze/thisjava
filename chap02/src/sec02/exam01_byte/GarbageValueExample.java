package sec02.exam01_byte;
public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125; // 1����Ʈ
		int var2 = 125;  // 4����Ʈ
		
		for(int i=0; i<5; i++) { // 5�� �ݺ�:0,1,2,3,4
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}
}
