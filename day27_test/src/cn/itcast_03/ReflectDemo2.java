package cn.itcast_03;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {
public static void main(String[] args) {
	Class c = Class.forName("/day27_test/src/cn/itcast_02/Person.java");
	Constructor con = c.getConstructor();
	object obj = con.newInstance();
	
}
}
