package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample4 {
	public static void main(String[] args) {
		int[] scores = new int[3]; // 공간만 확보하고 초기값을 지정하지 않음
		
		scores[0] = scores[1] = scores[2] = 100;
		init(scores); // 점수를 세팅
		
		int sum = add(scores);
		System.out.println("총합 : " + sum);	
		System.out.println("평균 : " + sum / scores.length);	
		System.out.println();
	}
	
	// Call by Reference : 참조위치를 전달
	// 참조형은 파라미터 값을 변경시킬 수 있다.
	public static void init(int[] s) { 
		for(int i = 0; i < s.length; i++) {
			s[i] = (int)(Math.random() * 101);
		}
	}
	
	public static int add(int[] s) {
		int sum = 0;
		for(int i = 0; i < s.length; i++) {
			System.out.printf("[%d][%d]\n", i, s[i]);
			sum += s[i];
		}
		return sum;
	}
}