package setExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		values.add(88);
		values.add(66);
		values.add(333);
		values.add(39);
		values.add(20);
		
		Set<Integer> j = new HashSet<Integer>();
		
		for(int i : values){
			j.add(i);
		}
		for(int i : j){
			j.add(i);
		}
		for(int i : j){
			System.out.println(i);
		}
	}
	

	

}
