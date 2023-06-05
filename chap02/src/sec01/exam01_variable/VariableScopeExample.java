package sec01.exam01_variable;

public class VariableScopeExample {
	public static void main(String[] args) {
		int var1;
		
		if(true) {
			int var2; // 블록 안에서 선언된 로컬 변수
			
			var1 = 10;
			var2 = 20;
		}
		
		var1 = 10;
		
		// 블록 밖에서는 사용할 수 없다.
		// var2 = 20;
		
		for(int i=0; i<1; i++) {  // 반복문(for) 안에서 선언 된 변수(i)도 블록 변수
			int var3;
			
			var1 = 10; // 블록 밖에 변수는 블록 안에서 사용 가능
			var3 = 30; // 블록 안에 선언 된 변수는 블록 안에서 사용 가능
		}
		
		// 변수(i)는 블록 밖에서는 사용할 수 없다.
		// System.out.println("i" + i);
		
		var1 = 10;
		
		// 블록 밖에서는 사용할 수 없다.
		// var3 = 30;
	}
}
