/*
 * 추상 클래스:
 *   - 클래스 이름 앞에 abstract를 명시
 *   - 메소드 이름 앞에 abstract를 명시하면 실체 클래스에서 반드시 구현을 해야 한다.
 *     . 구현부분이 없다.
 * 	 - 실체 클래스들의 공통된 필드와 메소드의 이름을 통일할 목적
 * 	 - 실체 클래스를 작성할 때 시간을 절약
 * 	 - 실체 클래스에서 특정한 기능을 구현하도록 제약(강제)
 */
package sec08.exam02_abstract_method;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드 : 구현이 없다.
	// 메소드 시그니처만 선언
	// 이 메소드를 구현해라 라고 제약 걸어둔것
	// abstract
	// public abstract void sound() {} // 에러
	public abstract void sound();
}

