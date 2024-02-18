package hw70215;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class random1000 {

	public static void main(String[] args) {

//	2、請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//	append功能讓每次執行結果都能被保存起來)

		try {
			File file = new File("C:\\CIA101_Workspace\\Data.txt");
			FileWriter getran = new FileWriter("Data.txt", true); // append功能，保存每次紀錄

			// 產生亂數
			Set num = new HashSet();
			while (num.size() != 10) {  // 取出10個數
				int getnum = (int) (Math.random() * 1000) + 1;
				num.add(getnum);
			}

			// 取值
			Iterator k = num.iterator();
			while (k.hasNext()) {                  // "hasNext()" 用來檢查迭代器是否還有下一个元素
				System.out.print(k.next() + "  "); // 如果還有，使用 "next()" 返回下一个元素

			}
			getran.write(k + "  "); //資料匯入檔案
			getran.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
