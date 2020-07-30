package p1;
import java.util.*;

public class Example {
	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(2,5);
		Iterator it = values.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
	}

	

}
