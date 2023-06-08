/*
 * final : 
 * 	 - 초기값이 지정되면 값을 바꿀 수 없다.
 * 	 - 초기값을 지정할 수 있는 방법은 2가지
 * 		1. 선언과 동시에 초기값을 지정
 * 		2. 생성자에서 지정
 */
package sec11.exam01_final;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	// The blank final field ssn may not have been initialized
	/*
	public Person(String name) {
		this.name = name;
	}
	*/
	
	public Person(String name) {
		this.ssn = "SSN";
		this.name = name;
	}
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

