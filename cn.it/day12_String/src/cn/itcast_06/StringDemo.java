package cn.itcast_06;

/*
 * 替换功能
 * 		String replace(char oldChar,char newChar)：用新的字符去替换指定的旧字符
 *		String replace(String oldString,String newString)：用新的字符串去替换指定的旧字符串
 *
 * 切割功能
 * 		String[] split(String regex)
 * 
 * 去除字符串两端空格	
 * 		String trim()
 * 
 * 按字典顺序比较两个字符串  
 *		int compareTo(String str)
 */
public class StringDemo {
	public static void main(String[] args) {
		// 替换功能
		String s = "helloworld";
		System.out.println(s.replace('l', 'p'));
		System.out.println(s.replace("ll", "ak47"));

		// 切割功能
		String ages = "20-30";
		// if(age>=20 && age<=30){人显示出来供我选择}
		String[] strArray = ages.split("-");
		for (int x = 0; x < strArray.length; x++) {
			// String -- int
			System.out.println(strArray[x]);
		}

		// 去除空格功能
		String name = "  admin hello      ";
		System.out.println("***" + name.trim() + "***");

		// 按字典顺序比较两个字符串
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
