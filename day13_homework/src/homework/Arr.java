/**
 * ��������int[] arr = { 37, 92, 54, 18, 76 };��18�������м��ַ�ʽ?
 * 
 */

package homework;

public class Arr {
	public static void main(String[] args) {
		int[] arr = { 37, 92, 54, 18, 76 };
		for(int i = 0;i<arr.length;i++){
			if (arr[i]==18) {
				System.out.println(i);
			}
		}
	}
}
