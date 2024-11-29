package advanced_program;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable{
	int id;
	String name;
	double grade;
	
	public Student(int id, String name, double grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public int compareTo(Object args) {
		return id - ((Student) args).id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
}

public class User1 implements Comparator{
	public static void main(String[] args) {
		Student[] s = {
				new Student(103, "Sakthi", 80),
				new Student(102, "Eshwar", 100),
				new Student(101, "Raghu", 85),
		};
		System.out.println(Arrays.toString(s));
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		User1 u1 = new User1();
		Arrays.sort(s, u1);
		System.out.println(Arrays.toString(s));
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		Student s1 = (Student) arg0;
		Student s2 = (Student) arg1;
		if (s1.grade > s2.grade) return -1;
		else if (s1.grade < s2.grade) return 1;
		else return 0;
	}
}
