package test02;

import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @author � 
 * 		      ��һ���ַ���: "cbxzbvavdvgd"
 *         Ҫ���ȡ�ַ����У�ÿһ����ĸ���ִ�����"a(1)b(2)c(1)d(2)g(1)v(3)x(1)z(1)" 1�����ַ���ת���ַ����顣
 *         toCharArray();
 *         2������һ��TreeMap���ϣ�Character�����������ַ�����Integer��ֵ������ÿ���ַ����ֵĴ�������
 *         3�������ַ����飬Ȼ���ȡ��ÿһ���ַ��� 4��Ȼ����ݻ�ȡ������ĸȥTreeMap�������Ҷ�Ӧ��ֵ�� Object get(Object
 *         obj):���ݼ���ֵ; 5�������4���ķ���ֵΪnull���ͰѸ���ĸ��ӵ������У�������¼Ϊ1.
 *         �����4���ķ���ֵ��Ϊnull���ͰѴ���++��Ȼ�����´洢���ַ��� 6���Ѽ����еļ�ֵ�԰������ǵ�����ƴ�ӳ��ַ�����
 * 
 */

public class Test {
	public static void main(String[] args) {
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		String str = "cbxzbvavdvgd";
		// ��ת��Ϊ����
		char[] chs = str.toCharArray();
		// ��������ǿfor
		for (char ch : chs) {
		
			//���õ����ַ�ȥ�������Ҷ�Ӧ��ֵ�����ݷ���ֵ������Ӧ�Ĳ�����
			Integer i = tm.get(ch);
			if (i==null) {
				tm.put(ch,1);
			}else{
				i++;
				tm.put(ch, i);
			}
		}
		//���õ��ļ�ֵ�Լ��ϣ�����ת����ַ���
		//
		StringBuilder sb = new StringBuilder();
		Set<Character> set = tm.keySet();
		for (char ch : set)
		{
			Integer i = tm.get(ch);
			sb.append(ch).append("(").append(i).append(")");
		}
			
		
	}
}
