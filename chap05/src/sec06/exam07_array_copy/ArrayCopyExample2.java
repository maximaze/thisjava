package sec06.exam07_array_copy;


public class ArrayCopyExample2 {
	public static void main(String[] args) {
		String[] ostr = { "java", "array", "copy" };
		String[] nstr = new String[5];
		
		// 주소 복사 : 얕은 복사(shallow copy)
		System.arraycopy( ostr, 0, nstr, 0, ostr.length);

		// 원본이 참조하고 있는 객체의 값을 변경시키는 것이 아니라
		// 원본의 주소 자체를 변경시켜 nstr에는 영향이 없다.
		ostr[0] = new String("자바2");
		
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