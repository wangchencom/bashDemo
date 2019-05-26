package Test01;

public class Test05 {
	public static void main(String[] args) {
		
		Integer i1 = new Integer(127);
				Integer i2 = new Integer(127);
				System.out.println(i1 == i2);  //false
				System.out.println(i1.equals(i2));  //true

				System.out.println("--------");

				Integer i3 = new Integer(128);
				Integer i4 = new Integer(128);
				System.out.println(i3 == i4);    //false
				System.out.println(i3.equals(i4)); 
				Integer i5 = 128;
				Integer i6 = 128;
				System.out.println(i5 == i6); 
				System.out.println(i5.equals(i6)); 

				System.out.println("--------");

				Integer i7 = 127;
				Integer i8 = 127;
				System.out.println(i7 == i8); 
				System.out.println(i7.equals(i8)); 

	}

}
