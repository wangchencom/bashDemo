package Test_01;

import java.util.ArrayList; 
import java.util.Collection;
import java.util.Iterator;

/**
 * 
 *����һ�����ϣ�ʵ����ArrayListʵ�֡�Ȼ���򼯺����5���ַ���Ԫ�ء�
 *�ֱ��ǣ���hello������itcast������fanzhuan������ketang������best�����жϼ������Ƿ����"ketang"���Ԫ�أ�
 *�á�������󡱺͡�������̡�����˼·ȥ��

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
	 Iterator it = c.iterator();//Iterator�@��һ���ӿڣ��������c.iterator
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
