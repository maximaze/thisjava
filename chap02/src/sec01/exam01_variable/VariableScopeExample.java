package sec01.exam01_variable;

public class VariableScopeExample {
	public static void main(String[] args) {
		int var1;
		
		if(true) {
			int var2; // ��� �ȿ��� ����� ���� ����
			
			var1 = 10;
			var2 = 20;
		}
		
		var1 = 10;
		
		// ��� �ۿ����� ����� �� ����.
		// var2 = 20;
		
		for(int i=0; i<1; i++) {  // �ݺ���(for) �ȿ��� ���� �� ����(i)�� ��� ����
			int var3;
			
			var1 = 10; // ��� �ۿ� ������ ��� �ȿ��� ��� ����
			var3 = 30; // ��� �ȿ� ���� �� ������ ��� �ȿ��� ��� ����
		}
		
		// ����(i)�� ��� �ۿ����� ����� �� ����.
		// System.out.println("i" + i);
		
		var1 = 10;
		
		// ��� �ۿ����� ����� �� ����.
		// var3 = 30;
	}
}
