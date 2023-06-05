package sec02.exam01_if;
public class IfDiceExample3 {
	final static int MAX_NUM = 6; // 경우의 수
	final static int MIN_NUM = 1; // 경우의 수 시작 값
	
	public static void main(String[] args) {
		
		double rnd = Math.random(); // 0.0부터 1.0보다 작은 수
		System.out.println("난수 : " + rnd);
		
		double six = rnd * MAX_NUM;
		System.out.println("six : " + six);
		
		int num = (int)six + MIN_NUM; // 주사위의 경우의 수 : 1부터 6까지
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {	
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}
}
