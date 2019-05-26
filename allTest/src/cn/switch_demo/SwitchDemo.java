package cn.switch_demo;
/***
 * 
 * switch的语句格式：
		switch(表达式)
		{
			case 取值1:
				执行语句；
				break；
			case 取值2:
				执行语句；
				break；
			...
			default:
				执行语句；
				break；
		}

 *
 */
public class SwitchDemo {
public static void main(String[] args) {
	int x = 5;
	switch (x) {
	case 1:
		System.out.println("星期一");	
		break;
	case 2:
		System.out.println("星期二");	
		break;
	case 3:
		System.out.println("星期三");	
		break;
	case 4:
		System.out.println("星期四");	
		break;
	case 5:
		System.out.println("星期五");	
		break;
	case 6:
		System.out.println("星期六");	
		break;
	case 7:
		System.out.println("星期日");	
		break;

	default:
		System.out.println("日期输入有误");
		break;
	}
}
}
