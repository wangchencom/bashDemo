package cn.switch_demo;
/***
 * 
 * switch������ʽ��
		switch(���ʽ)
		{
			case ȡֵ1:
				ִ����䣻
				break��
			case ȡֵ2:
				ִ����䣻
				break��
			...
			default:
				ִ����䣻
				break��
		}

 *
 */
public class SwitchDemo {
public static void main(String[] args) {
	int x = 5;
	switch (x) {
	case 1:
		System.out.println("����һ");	
		break;
	case 2:
		System.out.println("���ڶ�");	
		break;
	case 3:
		System.out.println("������");	
		break;
	case 4:
		System.out.println("������");	
		break;
	case 5:
		System.out.println("������");	
		break;
	case 6:
		System.out.println("������");	
		break;
	case 7:
		System.out.println("������");	
		break;

	default:
		System.out.println("������������");
		break;
	}
}
}
