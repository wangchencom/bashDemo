package test02;

import java.util.HashMap;
import java.util.TreeMap;

public class Test02 {
public static void main(String[] args) {
	//�������϶���--czbk
	TreeMap<String, TreeMap<String, String>> hm = new TreeMap<String, TreeMap<String, String>>();
	//���������Ԫ�ض���yr��jy
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
