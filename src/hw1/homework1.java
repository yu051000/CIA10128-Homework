package hw1;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1、請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12 , b = 6;
		int c = a + b;
		System.out.println("12,6 的和 = " + c);
		int d = a * b;
		System.out.println("12,6 的積 = " + d);
		
		
//		2、請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int total_egg = 200 , carton = 12;
		int use_carton = total_egg / carton;
		int use_egg = total_egg % carton;
		System.out.println("總共" + use_carton + "打，" + use_egg + "顆");
		
		
//		3、請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int total_sec = 256559 , sec = 1;
		int min = sec * 60;
		int hr = min * 60;
		int day = hr * 24;
		
		
		int total_day = total_sec /day;     // 計算共有幾天
		int rem_sec = total_sec - (day * 2);
		
		
		int total_hr = rem_sec / hr;        // 計算共有幾小時
		int rem_sec2 = rem_sec - (hr * 23);
		
		
		int total_min = rem_sec2 / min;     // 計算共有幾分、幾秒
		int rem_sec3 = rem_sec2 - (min * 15);
		System.out.println("256559秒為" + total_day + "天" + total_hr + "小時" + total_min + "分" + rem_sec3 + "秒");
		
		
//		4、請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double radius = 5 , pi = 3.1415;
		
		// 計算圓面積
		double area = pi * radius * radius;
		System.out.println("圓面積 = " + area);
		
		// 計算圓周長
		double perimeter = pi * radius * 2;
		System.out.println("圓周長 = " + perimeter);
		
		
//		5、某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢
//		   複利公式(FV)＝ 期初本金(PV)×（1 ＋ 每期利率(R)）期數(n)次方
		   //期末 = 期初*(1+利率)的n次方 ---------複利公式
		
		
		double PV = 1_500_000 , R = 0.02;
		int year = 10;
		double FV = PV * Math.pow((1 + R) , 10);
		System.out.println(FV);
		
		
//		6、請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		
		
		// 5+5 並沒有引號影響，為單純數字計算。故答案10。
		int e = 5;
		System.out.println("5 + 5 = " + (e+e));
		
		
		// 5+‘5’ 因‘5’有使用單引號，是屬於字元碼(53)，故答案為58。
		int f = 5;
		char g = '5';
		System.out.println("5 + ‘5’ = " + (f+g));
		
		// 5+“5” 因“5”有使用雙引號，是屬於字串類型，故答案為55。
		int h = 5;
		String i = "5";
		System.out.println("5+“5” = " + (h+i));
		
	}

}
