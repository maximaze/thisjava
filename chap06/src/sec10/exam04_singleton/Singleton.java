package sec10.exam04_singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	// 외부 클래스에서 접근 불가
	// 객체를 만들 수 없다.
	private Singleton() {}
	
	// 외부에서 접근 가능
	static Singleton getInstance() {
		return singleton;
	}
}

