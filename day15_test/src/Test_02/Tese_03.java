package Test_02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 创建集合ArrayList，添加hello，world，java三个元素，然后遍历集合，
 * 判断集合中是否有元素hello，如果有的话就添加一个新元素Android进去。然后再遍历集合
 */

public class Tese_03 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		ListIterator listr = list.listIterator();
		while (listr.hasNext()) {
			String s = (String)listr.next();
			if ("hello".equals(s)) {
				list.add("android");
				//ConcurrentModificationException:并发修改异常，
				
			}	
		}
	}
}
