

/*
 * ��׼��ѧ����
 */
public class Student {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	/*
	 * ������
	 * 		����ֵ���ͣ�boolean
	 * 		�����б���������,int age1,int age2
	 */
//	public boolean compare(int age1,int age2)
//	{
//		return age1==age2;
//	}
	
	//����������ѧ��������������˼�룬һ����˵�������Ժ󴫲ξͻᴫ�ݶ�����Ϊ������
	//�Ľ���
//	public boolean compare(Student s1,Student s2)
//	{
//		return s1.age == s2.age;
//	}
	
	//��this����һ������
//	public boolean compare(Student s)
//	{
//		/*
//		 * this -- s1
//		 * s -- s2
//		 */
//		return this.age == s.age;
//	}
	
	@Override
	public boolean equals(Object obj) {
		//Ϊ����ߴ���Ч��
		if(this==obj){
			return true;
		}
		
		//Ϊ����߳���Ľ�׳��
		//��һ���жϣ��жϴ��ݹ����Ķ����Ƿ���Student���͵ġ�
		//��ô�ж�?
		//��ʽ�������� instanceof ���� �ж϶����Ƿ��Ǹ���Ķ���,����boolean����
		if(!(obj instanceof Student)){
			return false;
		}
		
		/*
		 * this -- s1
		 * obj -- s2
		 */
		Student s =  (Student)obj;
		//��дequalsһ�����Ϊ�˱Ƚ�ĳ����Ķ����������г�Ա����ֵ�Ƿ���ͬ
		//�����Ա�����ǻ������ͣ�����==�Ƚ�
		//�����Ա����ʱ��������,���øñ�����Ӧ���������͵�equals��������
		return this.age == s.age && this.name.equals(s.name);
	}

//	@Override
//	public String toString(){
//		return "name:"+name+",age:"+age;
//	}
	
	
}
