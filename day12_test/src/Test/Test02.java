/**
 *获取字符串长度：
 *
 * 
 */

package Test;

public class Test02 {
	//方法一:String()
	public static void main(String[] args) {
		String str = new String();
		System.out.println("str；"+str);
		System.out.println("str.lenght():"+str.length());
		//方法二String(byte[]bytes)
		byte[] bytes = {97,98,99,100,101};
		String s = new String(bytes,2,3);
		System.out.println("s:"+s);
		System.out.println("s.lenght():"+s.length());
		//方法三String(byte[]bytes,int index,int length)
		byte[] b ={97,98,99,100,101};
		String st = new String(b);
		System.out.println("st:"+st);
		System.out.println("st.length():"+st.length());
		//方法四
		
		
	}
	
	

}
