package day20_test;
//��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
//С���ӳ����������º�ÿ��������һ�����ӣ���������
//���������ʣ��ڶ�ʮ���µ����Ӷ���Ϊ���٣�

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
