package cn.itcast_06;

/*
 * �滻����
 * 		String replace(char oldChar,char newChar)�����µ��ַ�ȥ�滻ָ���ľ��ַ�
 *		String replace(String oldString,String newString)�����µ��ַ���ȥ�滻ָ���ľ��ַ���
 *
 * �и��
 * 		String[] split(String regex)
 * 
 * ȥ���ַ������˿ո�	
 * 		String trim()
 * 
 * ���ֵ�˳��Ƚ������ַ���  
 *		int compareTo(String str)
 */
public class StringDemo {
	public static void main(String[] args) {
		// �滻����
		String s = "helloworld";
		System.out.println(s.replace('l', 'p'));
		System.out.println(s.replace("ll", "ak47"));

		// �и��
		String ages = "20-30";
		// if(age>=20 && age<=30){����ʾ��������ѡ��}
		String[] strArray = ages.split("-");
		for (int x = 0; x < strArray.length; x++) {
			// String -- int
			System.out.println(strArray[x]);
		}

		// ȥ���ո���
		String name = "  admin hello      ";
		System.out.println("***" + name.trim() + "***");

		// ���ֵ�˳��Ƚ������ַ���
		String s1 = "hello";
		String s2 = "aello";
		String s3 = "mello";
		String s4 = "hello";
		String s5 = "Hello";
		//System.out.println('m'+1);//109
		System.out.println(s1.compareTo(s2));// 7
		System.out.println(s1.compareTo(s3));// -5
		System.out.println(s1.compareTo(s4));// 0
		System.out.println(s1.compareTo(s5));//32
	}
}
