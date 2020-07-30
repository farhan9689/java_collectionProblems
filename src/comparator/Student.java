package comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {

	public static void main(String[] args) {
		
		List<Std> st = new ArrayList<Std>();
		st.add(new Std(1,55));
		st.add(new Std(2,80));
		st.add(new Std(3,45));
		st.add(new Std(4,75));
		st.add(new Std(5,60));
	
		Collections.sort(st,(s1,s2)->{
			return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
		});
	
	for(Std s : st){
		System.out.println(s);
	}
 }
}

class Std{
	int rollNo, marks;
	Std(int rollNo, int marks){
		this.rollNo=rollNo;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Std [rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
}
