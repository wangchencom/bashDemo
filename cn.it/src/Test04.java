/**
���󣺹�˾�г���Ա�����������ţ�нˮ���������ݡ�
	      ��Ŀ������������������ţ�нˮ�����н��𣬹������ݡ�
˼·��
	Ա��������Ա����Ŀ����
		���� ���� нˮ
		����

	����Ա �򵥵ļ̳�
	��Ŀ���� �򵥼̳�+����
	//Ա��������
	1.�ȶ���Ա����.
		
*/
//

  abstract class Staff
{	
	//���췽��:
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
		System.out.println("����Ա�Ĺ���");
	}
	public void show()
	{
		System.out.println("����"+getName()+"����"+getNum()+"����"+getSalary());
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
		System.out.println("��Ŀ����Ĺ���");
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
//дע�� ������ϸ��д���ÿ��������ôд
//����ʼ� �����ıʼ�������Լ�û�����յĲ��ֺ���Ҫ���еĸ���,��ǳ������׵�֪ʶ��