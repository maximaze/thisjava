package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample3 {
	public static void main(String[] args) {
		int[] scores = new int[3]; // ������ Ȯ���ϰ� �ʱⰪ�� �������� ����
		
		scores[0] = 70;
		scores[1] = 80;
		scores[2] = 90;
		
		int sum = add(scores);
		System.out.println("���� : " + sum);	
		System.out.println("��� : " + sum / scores.length);	
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