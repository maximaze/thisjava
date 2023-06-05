package sec05.exam01_string_equals;
public class StringEqualsExample {
	public static void main(String[] args) {
		// 스텍(Stack) 영역에 저장
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) { // 변수가 참조하고 있는 값의 주소 비교
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) { // 값을 비교
			System.out.println("strVar1과 strVar2는 문자열이  같음");
		}
		
		// 힙(Heap) 영역 저장
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이  같음");
		}		
	} 
}
