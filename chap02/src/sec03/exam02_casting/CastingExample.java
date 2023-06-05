// 캐스팅(casting) : 강제 타입 변환
// 큰 크기 타입에서 작은 크기 타입으로 변환
// 작은 크기 타입 = (작은 크기 타입)큰 크기 타입

package sec03.exam02_casting;
public class CastingExample {
	public static void main(String[] args) {	
		int intValue = 44032; 
		
		// Type mismatch: cannot convert from int to char
		// char charValue = intValue; 
		
		char charValue = (char)intValue; // '가'
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);	
	} 
}
