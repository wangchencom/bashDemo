package test;

import java.util.Calendar;

public class Test03 {
	public static void main(String[] args) {
		Calendar cd =Calendar.getInstance();
		int i = cd.get(Calendar.YEAR);
		int i2 = cd. get(Calendar. MONTH +1);
		int i3 = cd.get(Calendar. DAY_OF_WEEK_IN_MONTH );
		int i4 = cd.get(Calendar.DAY_OF_WEEK);
		System.out.println(i);
	}
}
