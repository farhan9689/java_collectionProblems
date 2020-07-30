package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		
		List<Student> st = new ArrayList<Student>();
		st.add(new Student(1,55));
		st.add(new Student(2,80));
		st.add(new Student(3,45));
		st.add(new Student(4,75));
		st.add(new Student(5,60));
	
		Collections.sort(st);
	
	for(Student s : st){
		System.out.println(s);
	}
 }
}

class Student implements Comparable<Student>{
	int rollNo, marks;

	Student(int rollNo, int marks){
		this.rollNo=rollNo;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Std [rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	public int compareTo(Student s) {
	
		 return this.marks>s.marks?-1:this.marks<s.marks?1:0;
	}
	
	
}
