package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(2);
		values.add(1);
		values.add(5);
		values.add(2, 9);
		Collections.sort(values);
		Collections.reverse(values);
		Iterator it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
