package hw1;

import java.util.Scanner;

public class homework3 {

	// 是否為三角形 (兩邊相加要大於第三邊)
	private static boolean triangle(int a, int b, int c) {
		return (a + b > c) && (b + c > a) && (a + c > b);
	}

	// 是否為正三角形 (三邊等長)
	private static boolean equilateral_triangle(int a, int b, int c) {
		return (a == b) && (b == c);
	}

	// 是否為等腰三角形 (兩邊等長)
	private static boolean isosceles_triangle(int a, int b, int c) {
		return (a == b) || (b == c) || (a == c);
	}

	// 是否為直角三角形 (兩邊的平方和 = 斜邊的平方)
	private static boolean right_triangle(int a, int b, int c) {
		int maxSide = Math.max(Math.max(a, b), c);
		if (maxSide == a) {
			return a * a == b * b + c * c;
		} else if (maxSide == b) {
			return b * b == a * a + c * c;
		} else {
			return c * c == a * a + b * b;
		}
	}

//  --------------------------------------------------------------------------------------
	private static boolean containsDigit(int number, int play) {
		String number_st = Integer.toString(number);
		String play_st = Integer.toString(play);
		return number_st.contains(play_st);
	}

//  --------------------------------------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1、請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形,如圖示結果:
//			(提示:Scanner,三角形成立條件,判斷式if else)
//		(進階功能:加入直角三角形的判斷)

		System.out.println("請輸入第三個正整數: ");
		Scanner play_side = new Scanner(System.in);
		// 輸入三個數字
		System.out.print("第一個: ");
		int side1 = play_side.nextInt();

		System.out.print("第二個: ");
		int side2 = play_side.nextInt();

		System.out.print("第三個: ");
		int side3 = play_side.nextInt();

		// 判斷三角形
		if (triangle(side1, side2, side3)) {
			if (equilateral_triangle(side1, side2, side3)) {
				System.out.println("正三角形");
			} else if (isosceles_triangle(side1, side2, side3)) {
				System.out.println("等腰三角形");
			} else if (right_triangle(side1, side2, side3)) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}

//		2、請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
//		(提示:Scanner,亂數方法,無窮迴圈)
//		(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

		// 猜數字遊戲 (0~9)
		while (true) {
			int r1 = (int) (Math.random() * 10);
			Scanner game = new Scanner(System.in);
			System.out.print("請輸入 0~9 的數字：");
			int play_num = game.nextInt();

			if (r1 == play_num) {
				System.out.println("答對了! 答案就是" + play_num);
			} else {
				System.out.println("猜錯囉");
				continue;
			}
			break;
		}

		// 猜數字遊戲 (0~100)
		while (true) {
			int r2 = (int) (Math.random() * 100);
			Scanner game2 = new Scanner(System.in);
			System.out.print("請輸入 0~100 的數字：");
			int play_num2 = game2.nextInt();

			if (r2 == play_num2) {
				System.out.println("答對了! 答案就是" + play_num2);
			} else if (r2 > play_num2) {
				System.out.println("猜錯囉，答案是再大一點的數字~");
				continue;
			} else if (r2 < play_num2) {
				System.out.println("猜錯囉，答案是再小一點的數字~");
				continue;
			} else {
				System.out.println("無效輸入");
				continue;
			}
			break;
		}

//		3、阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,
//		   請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數,如圖:
//			(提示:Scanner)
//			(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

		// 刪除不要的數字
		System.out.println("阿文，請輸入你討厭哪個數字(1~9) ?\n");
		Scanner guess = new Scanner(System.in);
		int play = guess.nextInt();

		int count = 0;
		for (int number = 1; number <= 49; number++) {
			if (!containsDigit(number, play)) {
				count++;
				System.out.print(number + " ");
			}
		}
		System.out.println("\n總共有" + count + "個數字可以選擇。");

		// 輸入不要的數字後,直接亂數印出6個號碼且不得重複
		System.out.println("阿文，請輸入你討厭哪個數字(1~9) ?\n");
		Scanner guess1 = new Scanner(System.in);
		int play1 = guess1.nextInt();

		int count1 = 0;
		for (int number = 1; number <= 49; number++) {
			if (!containsDigit(number, play1)) {
				count1++;
				System.out.print(number + " ");
			}
		}
		int num_random = (int) (Math.random() * 50 - 1);
		if (num_random != num_random)
			System.out.println(num_random);
	}
}