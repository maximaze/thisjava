package sec02.exam01_byte;
public class ByteExample2 {
	public static void main(String[] args) {
		// 바이트 : -128 ~ 127
		byte var1 = 127; 
		byte var2 = 1;
		byte var3 = 0;
		byte var4 = -1;
		byte var5 = -2;
		byte var6 = -128;
		
		// 컴파일 에러: 바이트의 최대값의 범위를 넘음
		// byte var6 = 128; 
		
		System.out.println(binstr(var1) + ": " + var1);
		System.out.println(binstr(var2) + ": " + var2);
		System.out.println(binstr(var3) + ": " + var3);
		System.out.println(binstr(var4) + ": " + var4);
		System.out.println(binstr(var5) + ": " + var5);
		System.out.println(binstr(var6) + ": " + var6);
	} 
	
	public static String binstr(byte value) {
		String str = Integer.toBinaryString(value);
		//str = (str.length() >= 32) ? str.substring(26) : str;
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}	
}

