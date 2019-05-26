package day20_test;
//有一对兔子，从出生后第3个月起每个月都生一对兔子，
//小兔子长到第三个月后每个月又生一对兔子，假如兔子
//都不死，问：第二十个月的兔子对数为多少？

public class Test_02 {
public static void main(String[] args) {
	System.out.println(fun(20));
}
public static int fun(int n){
	if (n == 1) {
		return 1 ;
	}else if(n == 2){
		return 1;
	}else {
		return (n-1)+(n-2);
	}
	
}
}
