/**
 *��ȡ�ַ������ȣ�
 *
 * 
 */

package Test;

public class Test02 {
	//����һ:String()
	public static void main(String[] args) {
		String str = new String();
		System.out.println("str��"+str);
		System.out.println("str.lenght():"+str.length());
		//������String(byte[]bytes)
		byte[] bytes = {97,98,99,100,101};
		String s = new String(bytes,2,3);
		System.out.println("s:"+s);
		System.out.println("s.lenght():"+s.length());
		//������String(byte[]bytes,int index,int length)
		byte[] b ={97,98,99,100,101};
		String st = new String(b);
		System.out.println("st:"+st);
		System.out.println("st.length():"+st.length());
		//������
		
		
	}
	
	

}
