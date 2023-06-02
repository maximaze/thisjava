package sec02.exam01_if;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		// 어느 구조에서든 중괄호({})로 블록의 시작과 끝을 지정하지 않으면
		// if문의 조건이 만족하는 경우 첫번째 문장만 실행
		if(score< 90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다."); // 위 if문에 속하지 않은 명령
	}
}
