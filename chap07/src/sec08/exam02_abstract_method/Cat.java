package sec08.exam02_abstract_method;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
			System.out.println("야옹");
	}
		
	/*
	// @Override 오버라이드를 안하면 오류
	public void sound(int x) {
		System.out.println("야옹");
	}
	*/
}
