package cn.if_demo;

/***
 * 
 * ���̿�����䣺 A:˳��ṹ ���밴��˳���������ִ�С�
 *  B:ѡ��ṹ ��������ѡ������ж�������ͬ��ִ�С�
 *   a:ѡ��ṹ b:�жϽṹ C:ѭ���ṹ
 * ��ĳЩ�������ܶ�Ρ�
 * 
 * ѡ��ṹ��if������֡�
 * 
 * ��ʽ1�� if(�������ʽ) { �����; } 
 * if���ĵڶ��ָ�ʽ�� if(�������ʽ) { �����1; } 
 * else //�������˼ { �����2;
 * } if���ĵ����ָ�ʽ�� if(�������ʽ1) {
 * 
 * } else if(�������ʽ2) {
 * 
 * } else if(�������ʽ3) {
 * 
 * } ... else {
 * 
 * }
 */
public class IfDemo01 {
	public static void main(String[] args) {
		int x = 2;
		//��ʽһ
		if (x<10) {
			System.out.println("���");
		}else {
			System.out.println("hello");			
		}
		//��ʽ��
		if (x>0) {
			System.out.println("xx");
			
		}else {
			System.out.println("oo");
		}
		//��ʽ��
		if (x<20) {
			System.out.println("xx");
			
		}else if(x<50){
			System.out.println("xx");
		}else{

			System.out.println("hello");		
		}
	}
}
