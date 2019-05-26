package setdemo;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SetDemo {
public static void main(String[] args) {
	
	TreeMap<Student, String> tm = new TreeMap<Student, String>(
			new Comparator<Student>() {
				public int compare(Student s1, Student s2) {
					int num = s1.getAge() - s2.getAge();
					num = (num == 0) ? s1.getName().compareTo(s2.getName())
							: num;
					return num;
				}
			});
	tm.put(new Student("ÂÀ²¼", 40), "1");
	tm.put(new Student("ÕÔÔÆ", 22), "2");
	tm.put(new Student("µäÎ¤", 30), "3");
	System.out.println(tm); 
	Set<Student> s = tm.keySet();
	for (Student str : s) {
		System.out.println(tm.get(str));
	}
	Set<Map.Entry<Student, String>> se = tm.entrySet();
	for (Map.Entry<Student, String> entry : se) {
		System.out.println(entry.getKey() + "***" + entry.getValue());
	}

}

	
}






