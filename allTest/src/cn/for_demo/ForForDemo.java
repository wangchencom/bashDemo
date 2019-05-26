package cn.for_demo;

/*请在控制台输出以下内容；
 *
 **
 ***
 ****
 *****

 正三角形：
 外循环控制行，内循环控制列。与长方形相比内循环的判断条件发生变化。
 * 
 */
public class ForForDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("*******************");
		for (int i = 5; i >0 ; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
			}
		
	//这样使用可以的，我就想在里面控制，怎么办呢?
	//针对这种需求，java提供了一种方案：带标号的结束。
	//首先，定义一个标号，接着，使用break或者continue结束到此标号即可。
	//格式：
	//名字: for(){...}
	wc:for(int x=0; x<3; x++)
	{
		for(int y=0; y<4; y++)
		{
			System.out.print("*");
			break wc;
		}
		System.out.println();
	}

	System.out.println("over");
	}
}
