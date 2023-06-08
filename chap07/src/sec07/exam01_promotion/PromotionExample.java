package sec07.exam01_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();		
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		/*
		B b3 = e;
		B b4 = c;
		C c2 = d;
		C c3 = b;
		*/
		
		
		// A <= B <= D
		// A <= C <= E
		// B = C (x) 형태만
		// D = E (x) 형태만
		// A <= B <= E (x)
		// A <= C <= D (x)
	}
}

