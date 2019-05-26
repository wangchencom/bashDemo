package cn.itcast_04;

public class StudentTest {
public static void main(String[] args) {
	Student s = new Student();
	
	SetStudent ss = new SetStudent(s);
	GetStudent gs = new GetStudent(s);
	Thread t1 = new Thread(ss);
	Thread t2 = new Thread(gs);
	t1.start();
	t2.start();
}
}
