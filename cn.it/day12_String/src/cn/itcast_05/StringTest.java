package cn.itcast_05;

/*
 * ����:���ַ���������ĸת�ɴ�д������ΪСд
 * 
 * ������
 * 		helloWorld
 * 
 * 		�����
 * 		Helloworld
 * 
 * ˼·��
 * 		A:��ȡ����ĸ��
 * 		B:��ȡ������ĸ��
 * 		C:��Aת��д+BתСд
 */
public class StringTest {
	public static void main(String[] args) {
		String s = "helloWorld";
		String s1 = s.substring(0, 1);
		String s2 = s.substring(1);
		String s3 = s1.toUpperCase().concat(s2.toLowerCase());
		System.out.println(s3);

		// ��ʽ���
		// String result = s.substring(0, 1).toUpperCase()
		// .concat(s.substring(1).toLowerCase());
		// System.out.println(result);
	}
}
