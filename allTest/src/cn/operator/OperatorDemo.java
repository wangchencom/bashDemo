package cn.operator;

public class OperatorDemo {
	public static void main(String[] args) {
		// ������ĸ�ֵ
		int a = 10;
		// ���ָ�ֵ
		a += 20;// ����ߺ��ұߵ����ݼ������ٸ������.
		// �ȼ��� a= a + 20.
		// ������
		short s = 5;
		// s = s + 2 ;//�ᱨ��
		s += 2;// += ���Զ�����ת��
		// ����ת��: ��ʽת��(��С����)
		// byte ,short , char -- int --long -- float --double
		// long �ǰ˸��ֽ�,float��4���ֽ� long������,float�Ǹ�����,�����͸������Ĵ������һ��
		// long�ķ�ΧС��float

		// ǿ��ת��(�Ӵ�С)
		// ��ʽ:(ת�������������)��������ֵ
		// �����������Ͳ�һ�±���
		// int x = 10;
		// byte b = 20;
		// �������������мӷ�����
		// byte b2 = x + b;
		// System.out.println(b2);

		// ������������һ�µı���
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println(z);

		// ��ʽת��
		byte x1 = 10;
		int b = x1;
		System.out.println(b);

		float f = 12.5F;
		// byte b2 = a+b+f;
		// int i2 = a+b+f;
		// float f2 = a+b+f;
		double d = a + b + f;
		System.out.println(d);

		// ǿ������ת��
		int i = 10;
		byte b2 = (byte) i;
		System.out.println(b2);
		byte b1 = 3;
		byte b21 = 4;
		byte b3 = (byte) (b1 + b21);
		byte b4 = 3 + 4;
		// ASCII��������ַ���ֵ. 'a' - 97
		// 'A' - 65
		// '0' - 48

	}
}
