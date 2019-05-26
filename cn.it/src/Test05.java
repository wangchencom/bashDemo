//定义说英语的接口
interface SpeakEnglish
{
	public abstract void speak();
}
abstract class Man
{
	private String name;//名字属性
	private int age;//年龄属性
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
	//睡觉方法
	public void sleep()
	{
		System.out.println("睡觉");
	}
	//吃饭的方法
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
		System.out.println(getName()+"会说英语");
	}
	public void eat()
	{
		System.out.println(getName()+"吃蛋");
	}
	public void study()
	{
		System.out.println(getName()+"学习打乒乓球");
	}
	public void show()
	{
		System.out.println("名字"+getName()+"年龄"+getAge());
	}
}
class BasketPlayer extends Player
{
	public void eat()
	{
		System.out.println(getName()+"也吃蛋");
	}
	public void study()
	{
		System.out.println(getName()+"学习打篮球");
	}
public void show()
	{
		System.out.println("名字"+getName()+"年龄"+getAge());
	}
}
class  PingPangCoach extends Coach implements SpeakEnglish
{
	public void  speak()
	{
		System.out.println(getName()+"会说英语");
	}
	public void eat()
	{
		System.out.println(getName()+"不吃蛋");
	}
	public void teach()
	{
		System.out.println (getName()+"教打乒乓球");
	}
	public void show()
	{
		System.out.println("名字"+getName()+"年龄"+getAge());
	}
}
class BasketCoach extends Coach
{
	public void eat()
		{
			System.out.println(getName()+"吃鸡蛋");
		}
	public void teach()
		{
			System.out.println (getName()+"教打蓝球");
		}
		public void show()
	{
		System.out.println("名字"+getName()+"年龄"+getAge());
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
			//System.out.println("乒乓球运动员"+p.getName()+"年龄"+p.getAge());
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
