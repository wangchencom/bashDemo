//����˵Ӣ��Ľӿ�
interface SpeakEnglish
{
	public abstract void speak();
}
abstract class Man
{
	private String name;//��������
	private int age;//��������
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;	
	}

	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;	
	}
	//˯������
	public void sleep()
	{
		System.out.println("˯��");
	}
	//�Է��ķ���
	public abstract void eat();
}
abstract class Player extends Man
{
	public abstract void study();
	
}
abstract class Coach extends Man
{
	public abstract void teach();
}
class PingPangPlayer extends Player implements SpeakEnglish
{
	public void  speak()
	{
		System.out.println(getName()+"��˵Ӣ��");
	}
	public void eat()
	{
		System.out.println(getName()+"�Ե�");
	}
	public void study()
	{
		System.out.println(getName()+"ѧϰ��ƹ����");
	}
	public void show()
	{
		System.out.println("����"+getName()+"����"+getAge());
	}
}
class BasketPlayer extends Player
{
	public void eat()
	{
		System.out.println(getName()+"Ҳ�Ե�");
	}
	public void study()
	{
		System.out.println(getName()+"ѧϰ������");
	}
public void show()
	{
		System.out.println("����"+getName()+"����"+getAge());
	}
}
class  PingPangCoach extends Coach implements SpeakEnglish
{
	public void  speak()
	{
		System.out.println(getName()+"��˵Ӣ��");
	}
	public void eat()
	{
		System.out.println(getName()+"���Ե�");
	}
	public void teach()
	{
		System.out.println (getName()+"�̴�ƹ����");
	}
	public void show()
	{
		System.out.println("����"+getName()+"����"+getAge());
	}
}
class BasketCoach extends Coach
{
	public void eat()
		{
			System.out.println(getName()+"�Լ���");
		}
	public void teach()
		{
			System.out.println (getName()+"�̴�����");
		}
		public void show()
	{
		System.out.println("����"+getName()+"����"+getAge());
	}
}
class Test05
{
	public static void main(String[] args)
	{
		PingPangPlayer p = new PingPangPlayer();
			p.setName("zz");
			p.setAge(15);
			p.eat();
			p.show();
			//System.out.println("ƹ�����˶�Ա"+p.getName()+"����"+p.getAge());
			p.sleep();
			p.speak();
		System.out.println("************");
		 PingPangCoach ppc = new  PingPangCoach();
			ppc.setName("qq");
			ppc.setAge(19);
			ppc.eat();
			ppc.show();
			ppc.sleep();
			ppc.speak();
			ppc.teach();
			System.out.println("************");
		 BasketPlayer bp = new BasketPlayer();
			bp.setName("bp");
			bp.setAge(19);
			bp.eat();
			bp.show();
			bp.sleep();
			
			System.out.println("************");
		BasketCoach bkc = new BasketCoach(); 
		p.setName("bkc");
			bkc.setAge(1100);
			bkc.eat();
			bkc.show();
			bkc.sleep();
			bkc.teach();
			

	}
}
