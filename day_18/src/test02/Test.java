package test02;

import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @author 琛 
 * 		      有一个字符串: "cbxzbvavdvgd"
 *         要求获取字符串中，每一个字母出现次数："a(1)b(2)c(1)d(2)g(1)v(3)x(1)z(1)" 1、把字符串转成字符数组。
 *         toCharArray();
 *         2、定义一个TreeMap集合，Character做键（代表字符），Integer做值（代表每个字符出现的次数）。
 *         3、遍历字符数组，然后获取到每一个字符。 4、然后根据获取到的字母去TreeMap集合中找对应的值。 Object get(Object
 *         obj):根据键找值; 5、如果第4步的返回值为null，就把该字母添加到集合中，次数记录为1.
 *         如果第4步的返回值不为null，就把次数++，然后重新存储该字符。 6、把集合中的键值对按照我们的需求拼接成字符串。
 * 
 */

public class Test {
	public static void main(String[] args) {
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		String str = "cbxzbvavdvgd";
		// 先转换为数组
		char[] chs = str.toCharArray();
		// 遍历用增强for
		for (char ch : chs) {
		
			//将拿到的字符去集合中找对应的值，根据返回值进行相应的操作，
			Integer i = tm.get(ch);
			if (i==null) {
				tm.put(ch,1);
			}else{
				i++;
				tm.put(ch, i);
			}
		}
		//将得到的键值对集合，根据转变成字符串
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
