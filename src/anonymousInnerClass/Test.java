
public class Test {

	public static void main(String[] args) {
		
		A ob = new A(){//anonymous class 
			void show(){
				System.out.println("hi");
			}
		};
		
		ob.show(); //method call
	}

}

class A{
	void show(){
		System.out.println("hello");
	}
	class B{
		void show(){
			System.out.println();
		}
	}
}
