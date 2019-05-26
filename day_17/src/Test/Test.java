package Test;

import java.util.Iterator;
import java.util.TreeSet;

import javax.rmi.CORBA.Tie;




public class Test {
public static void main(String[] args) {
	TreeSet<Student> t = new TreeSet<Student>();
	Student s1 = new Student("张三",20);
	Student s2 = new Student("李四",20);
	Student s3 = new Student("王五",20);
	Student s4 = new Student("张三",20);
	t.add(s1);
	t.add(s2);
	t.add(s3);
	t.add(s4);
	Iterator<Student> it = t.iterator();
	while (((Iterator<Student>) t).hasNext()) {
		Student s = (Student) it.next();
		
		Tie type = (type) ((Object) t).nextElement();
		
	}
	
	
	
}
}
