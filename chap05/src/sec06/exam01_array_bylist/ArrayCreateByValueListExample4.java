package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample4 {
	public static void main(String[] args) {
		int[] scores = new int[3]; // ������ Ȯ���ϰ� �ʱⰪ�� �������� ����
		
		scores[0] = scores[1] = scores[2] = 100;
		init(scores); // ������ ����
		
		int sum = add(scores);
		System.out.println("���� : " + sum);	
		System.out.println("��� : " + sum / scores.length);	
		System.out.println();
	}
	
	// Call by Reference : ������ġ�� ����
	// �������� �Ķ���� ���� �����ų �� �ִ�.
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