package p1;

import java.util.*;



public class AnotherSort {


	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639); 
		values.add(265);
		
		Comparator<Integer> com = new ComImpl();
		
		Collections.sort(values,com);
		for(int o : values){
			System.out.println(o);
		}
		
	}
}




