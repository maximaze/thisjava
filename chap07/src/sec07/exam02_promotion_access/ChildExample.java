package sec07.exam02_promotion_access;

public class ChildExample {
	public static void main(String[] args) {
		  Child child = new Child();

		  // Promotion
		  Parent parent = child;
		  parent.method1();
		  parent.method2();
		  
		  // 호출 불가능
		  // The method method3() is undefined for the type Parent
		  // parent.method3();
		  
		  child.method2();
		  child.method3();
		  
		  // 캐스팅(Casting)
		  ((Child)parent).method3();
		  Child child2 = (Child)parent;
		  child2.method3();
	}
}
