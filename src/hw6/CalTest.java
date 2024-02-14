package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
//  CalTest.java執行後,使用者可以輸入x與y的值,請加入例外處理機制,讓程式能解決以下狀況:
//  (1) x與y同時為0,(產生自訂的CalException例外物件)
//  (2) y為負值,而導致x的y次方結果不為整數
//  (3) x與y皆正確情況下,會顯示運算後結果

		// 輸入 x、y 的值
		System.out.println("請輸入x的值： ");
		Scanner numa = new Scanner(System.in);
		int num1 = numa.nextInt();

		System.out.println("請輸入y的值： ");
		Scanner numb = new Scanner(System.in);
		int num2 = numb.nextInt();

		// "try...catch" 的例外處理
		try {
			Calculator t = new Calculator();
			t.setx(num1);
			t.sety(num2);
			System.out.println("x的y次方 = ");
			System.out.println(t.getpowerXY());
		} catch (CalException p) {
			p.printStackTrace();
		};
	}
}
