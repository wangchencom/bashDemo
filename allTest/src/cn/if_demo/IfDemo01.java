package cn.if_demo;

/***
 * 
 * 流程控制语句： A:顺序结构 代码按照顺序从上往下执行。
 *  B:选择结构 根据以下选择或者判断做出不同的执行。
 *   a:选择结构 b:判断结构 C:循环结构
 * 把某些事情做很多次。
 * 
 * 选择结构：if语句体现。
 * 
 * 格式1： if(条件表达式) { 语句体; } 
 * if语句的第二种格式： if(条件表达式) { 语句体1; } 
 * else //否则的意思 { 语句体2;
 * } if语句的第三种格式： if(条件表达式1) {
 * 
 * } else if(条件表达式2) {
 * 
 * } else if(条件表达式3) {
 * 
 * } ... else {
 * 
 * }
 */
public class IfDemo01 {
	public static void main(String[] args) {
		int x = 2;
		//格式一
		if (x<10) {
			System.out.println("你好");
		}else {
			System.out.println("hello");			
		}
		//格式二
		if (x>0) {
			System.out.println("xx");
			
		}else {
			System.out.println("oo");
		}
		//格式三
		if (x<20) {
			System.out.println("xx");
			
		}else if(x<50){
			System.out.println("xx");
		}else{

			System.out.println("hello");		
		}
	}
}
