package sec04.exam03_compare;
public class StringEqualsExample {
	public static void main(String[] args) {
		
		// ���ڿ� ���ͳ��� �����ϸ� ������ String ��ü�� ����
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		// ���ο� ��(Heap)������ �޸𸮸� �Ҵ�
		String strVar3 = new String("�Ź�ö");

		// �޸� �����͸� �� : ��ü���� ���
		System.out.println( strVar1 == strVar2); // true
		System.out.println( strVar1 == strVar3); // false
		System.out.println();
		
		// ���� ��
		System.out.println( strVar1.equals(strVar2)); // true
		System.out.println( strVar1.equals(strVar3)); // true
	}
}
