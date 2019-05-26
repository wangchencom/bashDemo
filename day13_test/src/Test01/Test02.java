package Test01;

public class Test02 {
	public static void main(String[] args) {
		long  lo =System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			System.out.println(i);
			
		
		}
		 long l =System.currentTimeMillis()	;
				 System.out.println(l-lo);
	}

}
