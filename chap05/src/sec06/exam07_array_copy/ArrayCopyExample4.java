package sec06.exam07_array_copy;


public class ArrayCopyExample4 {
	public static void main(String[] args) {
		TestClass[] org = {
				new TestClass("java"),
				new TestClass("array"),
				new TestClass("copy")
		};
		
		TestClass[] tar = new TestClass[5];
		
		// �ּ� ���� : ���� ����(shallow copy)
		System.arraycopy( org, 0, tar, 0, org.length);

		// ������ �ٲ�
		org[1] = new TestClass("�迭");
		
		// ����, �纻 ��� �ٲ�
		org[0].setName("�ڹ�");
		tar[2].setName("ī��");
		
		// �纻�� �ٲ�
		tar[1] = new TestClass("�纻");
		
		printArray(org);
		printArray(tar);
	}
	
	static void printArray(TestClass[] arr) {
		System.out.println("printArray: length=" + arr.length);
		
		for(TestClass test : arr) {
			if(test != null) {
				System.out.print(test.getName() + ", ");
			}
		}
		System.out.println(); 
	}
}