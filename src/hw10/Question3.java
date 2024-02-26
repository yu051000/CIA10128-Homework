package hw10;

import java.text.SimpleDateFormat;
import java.text.Format;
import java.util.Scanner;
import java.util.Date;

public class Question3 {

	public static void main(String[] args) {
//	• 請設計一隻程式,讓使用者輸入日期(年月日,例如:20110131)後,可以轉成想要的輸出格式化成(1)
//	年/月/日(2)月/日/年(3)日/月/年三選一,而輸入非指定日期數字格式會顯示出提示訊息如圖
//	(提示:TestFormatter.java, Java API文件,判斷格式可用正規表示法)

		System.out.println("請輸入日期 (年月日，例如：20110131)：");
		Scanner scanner = new Scanner(System.in);
		String dateresult = scanner.nextLine(); // 列為string型別

		// 使用正規表達式判斷是否為數字
		if (dateresult.matches("^-?\\d+$")) {
			System.out.println("欲格式化成：");
			System.out.println("(1) 年/月/日");
			System.out.println("(2) 月/日/年");
			System.out.println("(3) 日/月/年");

			int choice = scanner.nextInt(); // 轉列為int型別

			// 選擇想要顯示的表示法
			SimpleDateFormat dateFormat;
			switch (choice) {
			case 1:
				dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//				System.out.println("年/月/日 表示：" + dateFormat.format(date));
				break;
			case 2:
				dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//				System.out.println("月/日/年 表示：" + dateFormat.format(date));
				break;
			case 3:
				dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//				System.out.println("日/月/年 表示：" + dateFormat.format(date));
				break;
			default:
				System.out.println("請再輸入一次。");
				return;
			}

			try {
				// 将字符串日期解析为Date对象
				Date date = new SimpleDateFormat("yyyyMMdd").parse(dateresult);
				// 格式化日期并输出
				System.out.println("格式化后的日期：" + dateFormat.format(date));
			} catch (Exception e) {
				System.out.println("日期格式不正确，請再輸入一次。");
			}

		} else {
			System.out.println("數字格式不正確，請再輸入一次。");
		}
	}
}
