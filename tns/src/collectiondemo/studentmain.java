package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class studentmain {
	public static void main(String[] args) {
		List<student> l=new ArrayList<student>();
		
		l.add(new student(101,"raj","cs",8.1f));
		l.add(new student(102,"ram","cs",8.8f));
		l.add(new student(103,"sita","cs",9.1f));
		l.add(new student(104,"sheela","cs",7.6f));
		l.add(new student(105,"raghav","cs",9.0f));
		l.add(new student(106,"varun","cs",7.7f));
		
		for(student i:l) {
			
			System.out.println(i);
			
		}
	}

}
