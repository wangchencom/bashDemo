/**
 * 
 */


import java.util.HashSet;


public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student("aa",37));
		hs.add(new Student("bb",28));
		hs.add(new Student("cc",4));
		hs.add(new Student("dd",23));
		hs.add(new Student("ee",50));
		for (Student s : hs) {
			System.out.println(s.getName()+"***"+s.getAge());
		}
	}
}
