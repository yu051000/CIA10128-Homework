package hw10;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class sqrt {
	public static void get_primenumber(int a) {
		int num = 0;
		if (num > 0) {
			int sqrt = (int) Math.sqrt(num); // 取得num的正平方根
			for (int i = 2; i <= sqrt; i++) {
				if (num % i == 0) {
					System.out.println("不是質數");
				} else {
					System.out.println("是質數");
				}
			}
		}
	}
}

public class Question1 {

	public static void main(String[] args) {

//		• 請設計一隻程式,用亂數產生5個介於1~100之間的整數,而輸出結果可以判斷出這5個整數為是否為質數 (提示:Math類別)

		List collectnum = new ArrayList();

		// 取得5個亂數 (1~100之間的整數)
		while (collectnum.size() != 5) {
			int i = (int) (Math.random() * 100) + 1;
			collectnum.add(i);
		}

		for (int i = 0; i < collectnum.size(); i++) {
			int test_prime = (Integer) collectnum.get(i); // obj物件轉為int

			// 判斷是否為質數
			boolean isPrime = true; //預設

			if (test_prime > 0) {
				int sqrt = (int) Math.sqrt(test_prime); // 取得test_prime的正平方根
				for (int j = 2; j <= sqrt; j++) {
					if (test_prime % j == 0 && test_prime == 1) // 如果可整除 & 數字為1，皆不是質數
						isPrime = false;
				}
			}
			if (isPrime)
				System.out.println(test_prime + "是質數");
			else
				System.out.println(test_prime + "不是質數");
		}
	}
}
