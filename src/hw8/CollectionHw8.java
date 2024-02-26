package hw8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.math.BigInteger;


public class CollectionHw8 {

	public static void main(String[] args) {

//		• 請建立一個Collection物件並將以下資料加入:
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)

		Collection<Object> collection = new ArrayList<>();

		collection.add(100);
		collection.add(3.14);
		collection.add(21L);
		collection.add((short) 100);
		collection.add(5.1);
		collection.add("Kitty");
		collection.add(100);
		collection.add(new Object());
		collection.add("Snoopy");
		collection.add(new BigInteger("1000"));

		
//		1、印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		
		//使用Iterator：
		Iterator<Object> it1 = collection.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		//使用傳統for：
		Iterator<Object> it2 = collection.iterator();
		for(int a = 0; a < collection.size(); a++) {
			System.out.println(it2.next());
		}
		
		//使用foreach：
		for(Object result : collection) {
			System.out.println(result);
		}
		
		
		
//		2、移除不是java.lang.Number相關的物件
		Iterator<Object> it3 = collection.iterator();
		while (it3.hasNext()) {
		    Object obj = it3.next();
		    
		    // instanceof：測試Number是不是obj的子類別或是實作介面
		    if (!(obj instanceof Number)) { 
		        it3.remove();
		    }
		}
		
//		3、再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
		for(Object result : collection) {
		System.out.println(result);
		}
	}
}
