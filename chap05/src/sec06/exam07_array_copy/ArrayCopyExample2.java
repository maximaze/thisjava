package sec06.exam07_array_copy;


public class ArrayCopyExample2 {
	public static void main(String[] args) {
		String[] ostr = { "java", "array", "copy" };
		String[] nstr = new String[5];
		
		// �ּ� ���� : ���� ����(shallow copy)
		System.arraycopy( ostr, 0, nstr, 0, ostr.length);

		// ������ �����ϰ� �ִ� ��ü�� ���� �����Ű�� ���� �ƴ϶�
		// ������ �ּ� ��ü�� ������� nstr���� ������ ����.
		ostr[0] = new String("�ڹ�2");
		
		printArray(ostr);
		printArray(nstr);
	}
	
	static void printArray(String[] arr) {
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + ", "); 
		}
		System.out.println(); 
	}
}