
package Test_02;

import java.util.ArrayList;
import java.util.List;

public class Test_02 {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add("hello");
	list.add("itcast");
	list.add("fanzhuan");
	list.add("ketang");
	list.add("best");
	for(int i=0; i<list.size(); i++){
		System.out.println(list.subList(i,i+1));

}}
}

