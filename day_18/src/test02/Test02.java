package test02;

import java.util.HashMap;
import java.util.TreeMap;

public class Test02 {
public static void main(String[] args) {
	//创建集合对象--czbk
	TreeMap<String, TreeMap<String, String>> hm = new TreeMap<String, TreeMap<String, String>>();
	//创建并添加元素对象yr和jy
	//HashMap<String, String> work = new HashMap<String,String>();
	TreeMap<String, String> base = new TreeMap<String, String>();
	base.put("01", "zhangsan");
	base.put("02", "lisi");
	TreeMap<String, String> adv = new TreeMap<String, String>();
	adv.put("03", "wangwu");
	adv.put("04", "zhaoliu");
	//
	hm.put("base", base);
	hm.put("adv", adv);
	

}
}
