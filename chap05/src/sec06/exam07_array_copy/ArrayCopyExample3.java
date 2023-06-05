package sec06.exam07_array_copy;


public class ArrayCopyExample3 {
	public static void main(String[] args) {
		TestClass[] org = {
				new TestClass("java"),
				new TestClass("array"),
				new TestClass("copy")
		};
		
		TestClass[] tar = new TestClass[5];
		
		// 주소 복사 : 얕은 복사(shallow copy)
		System.arraycopy( org, 0, tar, 0, org.length);

		// 원본만 바뀜
		org[1] = new TestClass("배열");
		
		// 원본, 사본 모두 바뀜
		org[0].setName("자바");
		tar[2].setName("카피");
		
		// 사본만 바뀜
		tar[1] = new TestClass("사본");
		
		printArray(org);
		printArray(tar);
	}
	
	static void printArray(TestClass[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.print(arr[i].getName() + ", ");
			}
		}
		System.out.println(); 
	}
}