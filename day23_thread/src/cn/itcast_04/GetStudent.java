package cn.itcast_04;

public class GetStudent implements Runnable {
	private Student s;
public GetStudent(Student s){
	this.s = s ;
}
@Override
public void run() {
	// TODO Auto-generated method stub
	while(true){
		System.out.println(s.name +"   " +s.age);
	}
}
}
