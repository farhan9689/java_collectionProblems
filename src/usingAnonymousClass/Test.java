package usingAnonymousClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		

		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639); 
		values.add(265);
		
		Comparator<Integer> com = new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1%10>o2%10)
				return 1;
				
				
				return -1;
			}
		};
		 
		Collections.sort(values,com);
		for(int o : values){
			System.out.println(o);
		}
	}

}
