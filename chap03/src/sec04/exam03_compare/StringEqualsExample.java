package sec04.exam03_compare;
public class StringEqualsExample {
	public static void main(String[] args) {
		
		// 문자열 리터널이 동일하면 동일한 String 객체를 참조
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		// 새로운 힙(Heap)영역에 메모리를 할당
		String strVar3 = new String("신민철");

		// 메모리 포인터를 비교 : 객체형인 경우
		System.out.println( strVar1 == strVar2); // true
		System.out.println( strVar1 == strVar3); // false
		System.out.println();
		
		// 값을 비교
		System.out.println( strVar1.equals(strVar2)); // true
		System.out.println( strVar1.equals(strVar3)); // true
	}
}
