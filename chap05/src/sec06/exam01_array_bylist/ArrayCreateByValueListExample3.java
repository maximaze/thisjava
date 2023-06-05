package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample3 {
	public static void main(String[] args) {
		int[] scores = new int[3]; // 공간만 확보하고 초기값을 지정하지 않음
		
		scores[0] = 70;
		scores[1] = 80;
		scores[2] = 90;
		
		int sum = add(scores);
		System.out.println("총합 : " + sum);	
		System.out.println("평균 : " + sum / scores.length);	
		System.out.println();
	}
	
	public static int add(int[] s) {
		int sum = 0;
		for(int i = 0; i < s.length; i++) {
			sum += s[i];
		}
		return sum;
	}
}