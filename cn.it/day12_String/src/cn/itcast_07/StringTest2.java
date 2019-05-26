package cn.itcast_07;

/*
 * 获取一个字符串中指定子串出的次数。比如说“hanbasdnbafllgnbahjnbakqqqqlnbaxi” 在这个字符串中，多有个nba？
 */
public class StringTest2 {
	public static void main(String[] args) {
		String str = "hanbasdnbafllgnbahjnbakqqqqlnbaxnbai";
		String regex = "nba";
		// 功能
		int count = getCount(str, regex);
		int count2 = getCount2(str, regex);
		System.out.println(count);
	}

	/*
	 * 返回值：统计变量的值 int 参数列表：大串和小串
	 */
	public static int getCount(String maxString, String minString) {
		// 定义统计变量
		int count = 0;
		// 在大串中查找小串一次
		int index = maxString.indexOf(minString);
		// 如果返回值不是-1，说明小串在大串中是存在的。
		while (index != -1) {
			// 统计变量++
			count++;
			// 把查找过的数据给截取掉,重新赋值给大串
			maxString = maxString.substring(index + minString.length());
			// 在新的大串中查找一次小串
			index = maxString.indexOf(minString);
		}
		return count;
	}

	// 优化代码
	// 
	public static int getCount2(String maxString, String minString) {
		// 定义统计变量
		int count = 0;
		// 在大串中查找小串一次
		int index = 0;
		// 如果返回值不是-1，说明小串在大串中是存在的。
		// 判断
		while ((index  = maxString.indexOf(minString)) != -1) {
			// 统计变量++
			count++;
			// 把查找过的数据给截取掉,重新赋值给大串
			maxString = maxString.substring(index + minString.length());
		}
		return count;
	}
}