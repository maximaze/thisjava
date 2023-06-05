// ĳ����(casting) : ���� Ÿ�� ��ȯ
// ū ũ�� Ÿ�Կ��� ���� ũ�� Ÿ������ ��ȯ
// ���� ũ�� Ÿ�� = (���� ũ�� Ÿ��)ū ũ�� Ÿ��

package sec03.exam02_casting;
public class CastingExample {
	public static void main(String[] args) {	
		int intValue = 44032; 
		
		// Type mismatch: cannot convert from int to char
		// char charValue = intValue; 
		
		char charValue = (char)intValue; // '��'
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);	
	} 
}
