package hw8;

import java.util.*;

public class TestTrain {

	public static void main(String[] args) {


        Set<Train> train = new TreeSet<Train>();
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222,"區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		train.add(t1);
		train.add(t2);
		train.add(t3);
		train.add(t4);
		train.add(t5);
		train.add(t6);
		train.add(t7);
		
//---------------------------------------------------------------------------------------------		
//		1、請寫一隻程式,能印出不重複的Train物件
		System.out.println("印出不重複的Train物件：\n");
		
		//(1) for寫法：
		System.out.println("for寫法：");
		Iterator<Train> iterator = train.iterator();
		for(int i = 0; i < train.size(); i++) {
			Train result = iterator.next();
			System.out.println(result.getnumber() + "-" + result.gettype() + "-" + result.getstart() + "-" + result.getdest() + "-" + result.getprice());
		}
		System.out.println("=============================");  
		
		
		//(2) for-each寫法：
		System.out.println("for-each寫法：");
		for(Train get : train) {
			System.out.println(get.getnumber() + "-" + get.gettype() + "-" + get.getstart() + "-" + get.getdest() + "-" + get.getprice());
		}
		
		System.out.println("=============================");
		
		
		//(3) 迭代器寫法：
		System.out.println("迭代器寫法：");
		Iterator<Train> get1 = train.iterator();
		while (get1.hasNext()) {
			Train result3 = get1.next();
			System.out.println(result3.getnumber() + "-" + result3.gettype() + "-" + result3.getstart() + "-" + result3.getdest() + "-" + result3.getprice());
		}
		
		System.out.println("=============================");
		
		
		
//---------------------------------------------------------------------------------------------		
//		2、請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出

		System.out.println("以班次編號由大到小排列：\n");
		
		//(1) for寫法：
		System.out.println("for寫法：");
		Iterator<Train> iterator1 = train.iterator();
		for(int z = 0; z < train.size(); z++) {
			Train result4 = iterator1.next();
			System.out.println(result4.getnumber() + "-" + result4.gettype() + "-" + result4.getstart() + "-" + result4.getdest() + "-" + result4.getprice());
		}
		System.out.println("=============================");  
		
		
		//(2) for-each寫法：
		System.out.println("for-each寫法：");
		for (Train getTrain : train) {
			System.out.println(getTrain.getnumber() + "-" + getTrain.gettype() + "-" + getTrain.getstart() + "-" + getTrain.getdest() + "-" + getTrain.getprice());
		}
		System.out.println("=============================");
		
		
		//(3) 迭代器寫法：
		System.out.println("迭代器寫法：");
		Iterator<Train> get2 = train.iterator();
		while (get2.hasNext()) {
			Train result5 = get2.next();
			System.out.println("迭代器寫法：" + result5.getnumber() + "-" + result5.gettype() + "-" + result5.getstart() + "-" + result5.getdest() + "-" + result5.getprice());
		}
		
		System.out.println("=============================");
		
		
		
//---------------------------------------------------------------------------------------------		
//		3、承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
		
		System.out.println("班次編號由大排到小印出 & 不重複印出Train物件：\n");
		
		//(1) for寫法：
		List<Train> list = new ArrayList<>(train); //將"TreeSet" 轉成 "ArrayList"
		Stack stack1 = new Stack(); //建立空的 "stack"
		
		
		System.out.println("for寫法：");
		Iterator<Train> tit1 = list.iterator();
		for(int z = 0; z < train.size(); z++) {
			Train stackpush1 = tit1.next();
			stack1.push(stackpush1.getnumber() + "-" + stackpush1.gettype() + "-" + stackpush1.getstart() + "-" + stackpush1.getdest() + "-" + stackpush1.getprice());
		}	
		
		//用 "pop()" 將stack的元素取出
		while (!stack1.empty()) {
			System.out.println(stack1.pop());
		}
		System.out.println("=============================");
		
		
		
		//(2) for-each寫法：
		System.out.println("for-each寫法：");
		Stack stack2 = new Stack(); //建立空的 "stack"
		
		for(Train stackpush2 : list) {
			stack2.push(stackpush2.getnumber() + "-" + stackpush2.gettype() + "-" + stackpush2.getstart() + "-" + stackpush2.getdest() + "-" + stackpush2.getprice());
		}	
		
		//用 "pop()" 將stack的元素取出
		while (!stack2.empty()) {
			System.out.println(stack2.pop());
		}
		System.out.println("=============================");
		
		
		//(3) 迭代器寫法：
		System.out.println("迭代器寫法：");
		Stack stack3 = new Stack(); //建立空的 "stack"
		
		Iterator<Train> tit = list.iterator();
		while (tit.hasNext()) {
			Train result2 = tit.next();
//			用 "push()" 將stack的元素加入
			stack3.push(result2.getnumber() + "-" + result2.gettype() + "-" + result2.getstart() + "-" + result2.getdest() + "-" + result2.getprice());
		}		
		
		
		//用 "pop()" 將stack的元素取出
		while (!stack3.empty()) {
			System.out.println(stack3.pop());
		}
	}
}
