/**
 * 1���ҵ���һ�����ڶ���
			2���ҵ���һ�����и�ʽ�����ܵĶ���
			3���������ķ�����format()��
				public final String format(Date date)
			4�����

 */

package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		
	
	Date d = new Date();
	SimpleDateFormat ds= new SimpleDateFormat();
	System.out.println(ds.format(d));
	System.out.println(new SimpleDateFormat().format(new Date()));
	}
	
}
