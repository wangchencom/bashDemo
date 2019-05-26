package cn.for_demo;

/*
 * 
 需求：把一句话打印5次：我爱Java
 后来改了,我要50000次，肿么办?
 想了想，它是一个重复的动作?
 接着在想一个游戏：植物大战僵尸2。
 针对这种重复的动作问题，Java就提供了一种语句：循环语句。

 循环语句：
 循环体:要做的事情。
 初始化条件:从哪里开始
 判断条件:在什么情况下结束
 控制条件:控制台初始化条件的变化

 Java提供了三种循环：
 for
 while
 do...while

 for格式：
 for(初始化条件;判断条件;控制条件)
 {
 循环体;
 }

 执行流程：
 A:先执行初始化表达式。
 B:执行判断条件。
 C:根据判断条件的返回值
 如果true,执行循环体。
 如果false,for循环结束。
 D:执行控制条件,接着返回B。\
 */
public class For_Demo {
	public static void main(String[] args) {
		for (int i = 0; i <100000000; i++) {
			System.out.println("Hello");
		}
	}
}
