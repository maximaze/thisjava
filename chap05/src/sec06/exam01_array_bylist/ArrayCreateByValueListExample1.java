package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 100 };
		
		/*
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		System.out.println("scores[3] : " + scores[3]);
		*/
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] : %d\n", i, scores[i]);
			sum += scores[i];
		}
		
		System.out.println("���� : " + sum);		
		double avg = (double) sum / scores.length;
		System.out.println("��� : " + avg);
	}
}