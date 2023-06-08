package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		// 추상 클래스는 객체화 할 수 없다.
		// Cannot instantiate the type Phone
		// Phone phone = new Phone();
		
		// 어떤일을 미리 정하지않고 너가 하려던거 선언하고 해~ 라고 제한걸은것
		// 추상 클래스는 구현 클래스를 통해서만 객체화 가능
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
