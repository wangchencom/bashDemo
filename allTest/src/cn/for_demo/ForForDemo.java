package cn.for_demo;

/*���ڿ���̨����������ݣ�
 *
 **
 ***
 ****
 *****

 �������Σ�
 ��ѭ�������У���ѭ�������С��볤���������ѭ�����ж����������仯��
 * 
 */
public class ForForDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("*******************");
		for (int i = 5; i >0 ; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
			}
		
	//����ʹ�ÿ��Եģ��Ҿ�����������ƣ���ô����?
	//�����������java�ṩ��һ�ַ���������ŵĽ�����
	//���ȣ�����һ����ţ����ţ�ʹ��break����continue�������˱�ż��ɡ�
	//��ʽ��
	//����: for(){...}
	wc:for(int x=0; x<3; x++)
	{
		for(int y=0; y<4; y++)
		{
			System.out.print("*");
			break wc;
		}
		System.out.println();
	}

	System.out.println("over");
	}
}
