package cn.itcast_07;

/*
 * ��ȡһ���ַ�����ָ���Ӵ����Ĵ���������˵��hanbasdnbafllgnbahjnbakqqqqlnbaxi�� ������ַ����У����и�nba��
 */
public class StringTest2 {
	public static void main(String[] args) {
		String str = "hanbasdnbafllgnbahjnbakqqqqlnbaxnbai";
		String regex = "nba";
		// ����
		int count = getCount(str, regex);
		int count2 = getCount2(str, regex);
		System.out.println(count);
	}

	/*
	 * ����ֵ��ͳ�Ʊ�����ֵ int �����б��󴮺�С��
	 */
	public static int getCount(String maxString, String minString) {
		// ����ͳ�Ʊ���
		int count = 0;
		// �ڴ��в���С��һ��
		int index = maxString.indexOf(minString);
		// �������ֵ����-1��˵��С���ڴ����Ǵ��ڵġ�
		while (index != -1) {
			// ͳ�Ʊ���++
			count++;
			// �Ѳ��ҹ������ݸ���ȡ��,���¸�ֵ����
			maxString = maxString.substring(index + minString.length());
			// ���µĴ��в���һ��С��
			index = maxString.indexOf(minString);
		}
		return count;
	}

	// �Ż�����
	// 
	public static int getCount2(String maxString, String minString) {
		// ����ͳ�Ʊ���
		int count = 0;
		// �ڴ��в���С��һ��
		int index = 0;
		// �������ֵ����-1��˵��С���ڴ����Ǵ��ڵġ�
		// �ж�
		while ((index  = maxString.indexOf(minString)) != -1) {
			// ͳ�Ʊ���++
			count++;
			// �Ѳ��ҹ������ݸ���ȡ��,���¸�ֵ����
			maxString = maxString.substring(index + minString.length());
		}
		return count;
	}
}