package sec07.exam02_promotion_access;

public class ParentExample {
	public static void main(String[] args) {
		  // Child child = new Child();
		  Parent parent = new Parent();
		  
		  
		  // Promotion
		  // Parent parent = child;
		  parent.method1();
		  parent.method2();
		  
		  // 캐스팅(Casting)
		  // ClassCastException: Parent cannot be cast to Child
		  // 캐스팅은 되지만 자식껄 부모는 사용할수없으니 오류
		  Child child2 = (Child)parent;
		  
		  // ((Child)parent).method3();
		  // child2.method3();
		  child2.method1();

	}
}
