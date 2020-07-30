package nonStaticInnerClass;

public class Test {

	public static void main(String[] args) {
		A ob = new A();
		A.B ob1 = ob.new B();
		ob1.show();
	}

}

class A{
	void show(){
		System.out.println("from A");
	}
	class B{
		void show(){
			System.out.println("from B");
		}
	}
}