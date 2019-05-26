

/*
 * 标准的学生类
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
	 * 分析：
	 * 		返回值类型：boolean
	 * 		参数列表：两个年龄,int age1,int age2
	 */
//	public boolean compare(int age1,int age2)
//	{
//		return age1==age2;
//	}
	
	//而我们现在学生的是面向对象的思想，一般来说，我们以后传参就会传递对象作为参数。
	//改进版
//	public boolean compare(Student s1,Student s2)
//	{
//		return s1.age == s2.age;
//	}
	
	//用this代替一个对象
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
		//为了提高代码效率
		if(this==obj){
			return true;
		}
		
		//为了提高程序的健壮性
		//加一个判断：判断传递过来的对象是否是Student类型的。
		//怎么判断?
		//格式：对象名 instanceof 类名 判断对象是否是该类的对象,返回boolean类型
		if(!(obj instanceof Student)){
			return false;
		}
		
		/*
		 * this -- s1
		 * obj -- s2
		 */
		Student s =  (Student)obj;
		//重写equals一般就是为了比较某个类的多个对象的所有成员变量值是否相同
		//如果成员变量是基本类型，就用==比较
		//如果成员变量时引用类型,就用该变量对应的引用类型的equals（）方法
		return this.age == s.age && this.name.equals(s.name);
	}

//	@Override
//	public String toString(){
//		return "name:"+name+",age:"+age;
//	}
	
	
}
