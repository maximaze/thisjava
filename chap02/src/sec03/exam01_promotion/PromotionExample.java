// 자동 형변환 : Promotion
// 작은 크기 타입에서 큰 크기 타입으로 변환
package sec03.exam01_promotion;
public class PromotionExample {
	public static void main(String[] args) {	
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue;;
		System.out.println(longValue);		
		
		intValue = 200;
		double doubleValue = intValue; // 성격이 달라도 가능(실수 <- 정수)
		System.out.println(doubleValue);		
	} 
}
