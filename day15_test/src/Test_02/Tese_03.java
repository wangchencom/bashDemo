package Test_02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * ��������ArrayList�����hello��world��java����Ԫ�أ�Ȼ��������ϣ�
 * �жϼ������Ƿ���Ԫ��hello������еĻ������һ����Ԫ��Android��ȥ��Ȼ���ٱ�������
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
				//ConcurrentModificationException:�����޸��쳣��
				
			}	
		}
	}
}
