package sec04.exam02_string_concat;

public class StringConcatExample {
	public static void main(String[] args) {
		// ������(+)���� �ǿ����� �� �� ���� ���ڿ��̸�?
		// ������(+)�� ���ڿ� �����ڷ� ó��
		// ���ڿ��� ��ȯ ���Ѽ� ó��
		String str1 = "JDK" + 6.0;		// ���ڿ� + ���� -> ���ڿ�
		String str2 = str1 + " Ư¡";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		System.out.println(str3);
		
		// ���ڰ� ���� ������ ���� �� ���ڿ��� ��ȯ
		String str4 = 3 + 3.0 + "JDK"; // 6.0JDK
		System.out.println(str4);		
	}
}