package lambda;

public class Test {

	public static void main(String[] args) {
		
		A ob = new A(){
			public void show(){
			System.out.println("hi"); //simplified lambda expression
			}
			};
		
		ob.show(); //method call
	}

}
@FunctionalInterface
interface A{
	void show();
	
}
