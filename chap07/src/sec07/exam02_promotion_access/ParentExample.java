package sec07.exam02_promotion_access;

public class ParentExample {
	public static void main(String[] args) {
		  // Child child = new Child();
		  Parent parent = new Parent();
		  
		  
		  // Promotion
		  // Parent parent = child;
		  parent.method1();
		  parent.method2();
		  
		  // ĳ����(Casting)
		  // ClassCastException: Parent cannot be cast to Child
		  // ĳ������ ������ �ڽĲ� �θ�� ����Ҽ������� ����
		  Child child2 = (Child)parent;
		  
		  // ((Child)parent).method3();
		  // child2.method3();
		  child2.method1();

	}
}
