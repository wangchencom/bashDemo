package day20_test;
//����:�õݹ����������еĵڶ�ʮ���ֵ��
//1��1��2��4��7��13��24...
//ǰ����ĺͣ�
public class Test_03 {
	public static void main(String[] args) {
		System.out.println(num(20));
	}
public static int num(int n ){
	if (n == 1){
		return 1 ;
	}else if (n == 2) {
		return 1 ;
		
	}else if (n == 3) {
		return 2;
		
	}else {
		return  num(n-1)+num(n-2)+num(n-3);
	}

}
}
