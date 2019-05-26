package Test;

/**
 * @author è¡
 *
 */
public class Test01 {
	public static void main(String[] args) {
		String s = "helloWorld";
		String s1 = s.substring(0, 1);
		String s2 = s.substring(1);
		String s3 = s1.toUpperCase().concat(s2.toLowerCase());
		System.out.println(s3);

		System.out.println(s.substring(0, 1).toUpperCase()
				.concat(s.substring(1).toLowerCase()));
	}
}
