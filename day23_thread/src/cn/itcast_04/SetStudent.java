package cn.itcast_04;

public class SetStudent implements Runnable {
	public Student s;

	public SetStudent(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int x = 0;
		while (true) {
			if (x % 2 == 0) {
				s.name = "¡÷«‡œº";
				s.age = 26;

			}else{
				s.name = "wcc";
				s.age = 18;
			}
			x++;
		}
	}
}
