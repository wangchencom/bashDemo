package cn.itcast;
/*
 * helloWorld
 * 
 * Helloworld
 * 
 * ˼·��
 * 	1. ��ͼ����ĸ��ת���ɴ�д
 *  2. ��ȡ������ĸ��ת����Сд
 *  3. ƴ��
 * 
 */
public class StringTest {
	
	public static void main(String[] args) {
		String str = "helloWorld";
		//��ʽһ
		//1. 
		String headStr = str.substring(0,1);
		headStr = headStr.toUpperCase();
		
		//2. 
		String otherStr = str.substring(1);
		otherStr = otherStr.toLowerCase();
		
		//3
		String str1 = headStr + otherStr;
		System.out.println(str1);
		
		
		//��ʽ��
		//��ʽ���
		//�ɶ��Բ��д��
		String str2  = str.substring(0,1).toUpperCase().concat(str.substring(1).toLowerCase());
		System.out.println(str2);
		
		
	}

}
