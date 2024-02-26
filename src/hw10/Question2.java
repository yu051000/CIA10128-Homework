package hw10;

import java.text.Format;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Question2 {
	public static void main(String[] args) {

//	• 請設計一隻程式,讓使用者可以輸入一個任意數後,可以選擇要以下列何種表示方法顯示：
//	(1)千分位 (2)百分比  (3)科學記號，而輸入非任意數會顯示提示訊息如圖
//	(提示: TestFormatter.java, Java API文件, 判斷數字可用正規表示法)
//	• 補充 (依此類推):
//		例1：輸入12345,千分位為12,345,輸入123,千分位為123
//		例2：輸入0.75,百分比為75%,輸入1,結果為100%

		System.out.println("請輸入數字：");
		Scanner scanner = new Scanner(System.in);
		String result = scanner.nextLine(); // 列為string型別

		
		// 使用正規表達式判斷是否為數字
		if (result.matches("^-?\\d+(\\.\\d+)?$")) {
			double number = Double.parseDouble(result);
			System.out.println("請選擇要顯示的方式：");
			System.out.println("(1) 千分位");
			System.out.println("(2) 百分比");
			System.out.println("(3) 科學記號");
			
			int choice = scanner.nextInt(); // 轉列為int型別

			//選擇想要顯示的表示法
			switch (choice) {
			case 1:
				Format dfm1 = new DecimalFormat("#,###");
				System.out.println("千分位表示：" + dfm1.format(number));
				break;
			case 2:
				Format dfm2 = new DecimalFormat("0.##%");
				System.out.println("百分比表示：" + dfm2.format(number));
				break;
			case 3:
				System.out.println("科學記號表示：" + number);
				break;
			default:
				System.out.println("請再輸入一次。");
			}
		} else {
			System.out.println("數字格式不正確，請再輸入一次。");
		}
	}
}