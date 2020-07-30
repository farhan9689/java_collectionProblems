package p1;

import java.util.*;

public class ComparatorUsingLambda {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(305);
		values.add(998);
		values.add(774);
		values.add(236);
		values.add(881);
		
		Collections.sort(values,(o1,o2)-> o1%10>o2%10? 1: -1);
		
		for(int i : values){
			System.out.println(i);
		}
	}

}
