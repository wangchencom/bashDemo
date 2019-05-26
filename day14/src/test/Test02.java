/**
 * 1、我得有一个日期对象。
			2、我得有一个具有格式化功能的对象。
			3、调用他的方法（format()）
				public final String format(Date date)
			4、输出

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
