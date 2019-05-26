package Test_01;

import java.util.ArrayList; 
import java.util.Collection;
import java.util.Iterator;

/**
 * 
 *创建一个集合，实体用ArrayList实现。然后向集合添加5个字符串元素。
 *分别是：“hello”，“itcast”，“fanzhuan”，“ketang”，“best”。判断集合中是否存在"ketang"这个元素？
 *用“面向对象”和“面向过程”两种思路去做

 *
 *
 */
public class Test_01 {
public static void main(String[] args) {
	Collection c = new  ArrayList();
	 c.add("hello");
	 c.add("itcast");
	 c.add("fanzhuan");
	 c.add("best");
	
	/* c.contains("hello");
	
	 //System.out.println(c.contains("hello"));
	 //System.out.println(c.isEmpty());
	 Iterator it = c.iterator();//Iterator這是一個接口，而后面的c.iterator
	while (it.hasNext()) {
		String s = (String) it .next();
		System.out.println(s);
		 //c.clear();}
		*/
	Iterator it = c.iterator();
	//Object obj = it.next();
	//System.out.println(obj);
	//System.out.println(it.next());
	//System.out.println(it.next());
	//System.out.println(it.next());
	//System.out.println(it.next());
	while (it.hasNext()) {
		String s = (String) it.next();
		System.out.println(s);
	}
}
}
