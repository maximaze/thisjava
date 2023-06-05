package sec02.exam01_byte;
public class ByteExample {
	public static void main(String[] args) {
		// 바이트 : -128 ~ 127
		byte var1 = -128; // 바이트의 최소값
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127; // 바이트의 최대값
		
		// 컴파일 에러: 바이트의 최대값의 범위를 넘음
		// byte var6 = 128; 
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	} 
	
	
}

