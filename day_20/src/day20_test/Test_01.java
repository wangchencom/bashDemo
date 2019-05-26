package day20_test;

public class Test_01 {
	public static void main(String[] args) {
		long num = 64;
		System.out.println(jc(num));
	}

	public static long jc(long n) {
		if (n == 1) {
			return 1;

		} else {
			return n * jc(n - 1);
		}
	}
}
