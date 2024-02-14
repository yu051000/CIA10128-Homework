package hw1;
import java.util.Scanner;
import java.util.Arrays;

public class homework4 {
// ---------------------------------------------------------------------------
	private static void getbignumber(int[] a, int average) {
		for (int bignumber : a) {
			if (bignumber > average) {
				System.out.print(bignumber + "  ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1、有個一維陣列如下:
//		   {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		   請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		   (提示:陣列,length屬性)
		int[] a = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		// 先計算加總總額
		int sum = 0, count = 0, average = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			count++;
		}

		// 計算平均值
		average = sum / count;
		System.out.println("平均值 = " + average);

		// 找出大於平均值的元素
		System.out.print("大於平均值的元素： ");
		getbignumber(a, average);
		System.out.println();

//		2、請建立一個字串,經過程式執行後,輸入結果是反過來的
//		   例如String s = “Hello World”,執行結果即為dlroW olleH
//		   (提示:String方法,陣列)
		String s = "Hello World";
		StringBuilder s1 = new StringBuilder(s);
		System.out.println(s1.reverse().toString());

//		3、有個字串陣列如下 (八大行星):
//		   {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		   請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		   (提示:字元比對,String方法)

		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int count1 = 0;
		for (int c = 0; c < planet.length; c++) {
			for (int d = 0; d < planet[c].length(); d++) {
				switch (planet[c].charAt(d)) {
				case 'a':
					count1 += 1;
					break;

				case 'e':
					count1 += 1;
					break;

				case 'i':
					count1 += 1;
					break;

				case 'o':
					count1 += 1;
					break;

				case 'u':
					count1 += 1;
					break;
				}
			}
		}
		System.out.println("共有" + count1 + "個母音");

//		4、阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
//		   請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		   有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		   員工編號: 25 19 27 共 3 人!」
//		   (提示:Scanner,二維陣列)
		int [][] atm = {{25 , 2500},
		                {32 , 800},
		                {8 , 500},
		                {19 , 1000},
		                {27 , 1200}};
		
		Scanner borrow = new Scanner(System.in);
		System.out.println("想借多少? : ");
		int borrowmoney = borrow.nextInt();
		System.out.print("有錢可借的員工編號: ");
		
		int count2 = 0;
		for (int q = 0; q < atm.length; q++) {
			int employeeNumber = atm[q][0];
            int employeemoney = atm[q][1];

			if (employeemoney >= borrowmoney) {
				System.out.print(employeeNumber + "  ");
				count2++;
			}
		}
		System.out.print("共" + count2 + "人");
		

//		5、請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		   例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//		   (提示1:Scanner,陣列)
//		   (提示2:需將閏年條件加入)
//		   (提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
		
		// 每月天數
		int[]totalday = {31,28,31,30,31,30,31,31,30,31,30,31};
				
		// 輸入年份
		System.out.println("請輸入年份(西元)： ");
		Scanner year = new Scanner(System.in);
		int getyear = year.nextInt();
		
		// 輸入月份
		System.out.println("請輸入月份： ");
		Scanner month = new Scanner(System.in);
		int getmonth = month.nextInt();
		
		
		// 擋下錯誤輸入:例如月份輸入為2,則日期不該超過29
		int getday = 0;
		while (true) {
			// 輸入日期
			System.out.println("請輸入日期： ");
			Scanner day = new Scanner(System.in);
			getday = day.nextInt();

			if (getmonth == 2 && getday > 28) {
				System.out.println("2月日期必須小於29，請重新輸入。");
			}else break;
		}
		
		// 計算總天數
		int gettotalday = 0;
		for (int d = 0; d < getmonth-1; d++) {  
			gettotalday += totalday[d];
			}
		gettotalday += getday;
		
		// 判斷閏年 (可被4整除且不為100整除者 & 可被400整除 皆為閏年)
		if ((getyear % 4 == 0) && (getyear % 100 != 0) || (getyear % 400 == 0)) {
			gettotalday +=1;  // 若為閏年，天數+1
		}
		
		System.out.println("西元" + getyear + "年，第" + gettotalday + "天");
		
		
		
//		6、班上有8位同學,他們進行了6次考試結果如下:
//         請算出每位同學考最高分的次數
//		   (提示:二維陣列)
		int[][] test = { { 10 , 35 , 40 , 100, 90 , 85 , 75 , 70 },  // 考試1
						 { 37 , 75 , 77 , 89 , 64 , 75 , 70 , 95 },  // 考試2
						 { 100, 70 , 79 , 90 , 75 , 70 , 79 , 90 },  // 考試3
						 { 77 , 95 , 70 , 89 , 60 , 75 , 85 , 89 },  // 考試4
						 { 98 , 70 , 89 , 90 , 75 , 90 , 89 , 90 },  // 考試5
						 { 90 , 80 , 100, 75 , 50 , 20 , 99 , 75 }}; // 考試6

		
		int[] win = new int[8];  // 紀錄學生分數最高次數(8位)
		
		
		for (int b = 0; b < test.length; b++) { // 考試次數(6次)
			int max = test[b][0];  // 預設每列第一個值是最大值
			int count4 = 0; 
			
			for (int m = 0; m < test[b].length; m++) { // 學生(8位)
				if (test[b][m] > max) {
					max = test[b][m];  // max = 該列最大值
					count4 = m; // 紀錄最大值的位置
				}
			}
			win[count4] +=1;  // 最高者次數+1
		} 
		
		// 顯示每位高分次數
		for (int w = 0; w < win.length; w++) {
			System.out.println((w+1) + "號最高分次數 = " + win[w]);
		}
	}
}
