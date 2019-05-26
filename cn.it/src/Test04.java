/**
需求：公司中程序员有姓名，工号，薪水，工作内容。
	      项目经理除了有姓名，工号，薪水，还有奖金，工作内容。
思路：
	员工（程序员、项目经理）
		姓名 工号 薪水
		工作

	程序员 简单的继承
	项目经理 简单继承+奖金
	//员工抽象类
	1.先定义员工类.
		
*/
//

  abstract class Staff
{	
	//构造方法:
	Staff( ){}
	Staff(String name,String num,int salary)
	{
		this.name = name;
		this.num = num;
		this.salary = salary;
	}
	private String name;
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	private String num;
	public void setNum(String num)
	{
		this.num = num;
	}
	public String getNum()
	{
		return num;
	}
	private int salary;
	public void setSalary( int salary)
	{
		this.salary = salary;
	}
	public int getSalary()
	{
		return salary;
	}	
	public abstract void work();
}
class Programmer extends Staff
{
	Programmer(){}
	Programmer( String name,String num,int salary)
	{
		super(name,num,salary);
	}
	public void work()
	{
		System.out.println("程序员的工作");
	}
	public void show()
	{
		System.out.println("名字"+getName()+"工号"+getNum()+"工资"+getSalary());
	}
	
}
class ProjectManager extends Staff
{
	ProjectManager(){}
	ProjectManager(String name,String num,int salary,int bonus)
	{
		super(name,num,salary);
		this.bonus = bonus;
	}
	private int bonus;
	
	public void work()
	{
		System.out.println("项目经理的工作");
	}
}
class Test04
{
	public static void main(String []args)
	{
		Programmer p = new Programmer();
		p.setName("zhi");
		p.setNum("123");
		p.setSalary(123456);
		p.show();
		p.work();
		System.out.println();	
			
		
			
		
	}
}
//写注释 尽量详细的写清楚每个部分怎么写
//整理笔记 阿亮的笔记整理出自己没有掌握的部分和需要背诵的概念,标记出不明白的知识点