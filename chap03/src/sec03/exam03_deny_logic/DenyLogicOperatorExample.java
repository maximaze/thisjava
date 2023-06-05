package sec03.exam03_deny_logic;

public class DenyLogicOperatorExample {
	public static void main(String[] args) {
		boolean play = true; // true, false
		
		System.out.println(play);

		play = !play; // 논리 부정 연산자 : !
		System.out.println(play);

		play = !play;
		System.out.println(play);
	}
}
