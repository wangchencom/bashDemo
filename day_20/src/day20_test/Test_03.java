package day20_test;
//需求:用递归求下列数列的第二十项的值：
//1，1，2，4，7，13，24...
//前三项的和，
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
