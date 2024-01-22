package hw1;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1、請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum1 = 0;
		for(int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {  // 餘數不等於0，為 "偶數"。
				sum1 += i;
			}
		}
		System.out.println("1~1000的偶數和 = " + sum1);

		
//		2、請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sum2 = 1;
		for (int a = 1; a <= 10; a++) {
			sum2 *= a;
		}
		System.out.println("1~10的連乘積 = " + sum2);
		
		
//		3、請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int k = 1 , sum3 = 1;
		while (k <= 10) {
			sum3 *= k;
			k++;
		}
		System.out.println("1~10的連乘積 = " + sum3);
		
//		4、請設計一隻Java程式,輸出結果為以下: 1 4 9 16 25 36 49 64 81 100
		for (int p = 1; p <= 10; p++) {
			double g = Math.pow(p , 2);    // 計算數值的平方
			System.out.println("結果 = " + g );
		}
		
		
//		5、阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//			輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		System.out.println("可以選擇的數字是：");
		int count = 0;
		for (int number = 1; number <= 49; number++) {
			if(number % 10 != 4 && number <40) {   // 若數值除以10的餘數 != 4，且小於40
				count++;
			}
			System.out.print(number + "、");
		}	
		System.out.println("\n數字總共有：" + count + "個");
		
//		6、請設計一隻Java程式,輸出結果為以下:
//			1 2 3 4 5 6 7 8 9 10
//			1 2 3 4 5 6 7 8 9
//			1 2 3 4 5 6 7 8
//			1 2 3 4 5 6 7
//			1 2 3 4 5 6
//			1 2 3 4 5
//			1 2 3 4
//			1 2 3
//			1 2
//			1
	
		for (int w = 1; w <= 10; w++) {
			for (int r = 1; r <= 10 - w + 1; r++) {
				System.out.print(r);
				}
			System.out.println();
		}
		
		
//		7、請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		
		for (int z = 1; z <= 6; z++) {
			for (int y = 1; y <= z; y++) {
			switch (z) {
			case 1:
				System.out.print("A");
				break;
			case 2:
				System.out.print("B");
				break;
			case 3:
				System.out.print("C");
				break;
			case 4:
				System.out.print("D");
				break;
			case 5:
				System.out.print("E");
				break;
			case 6:
				System.out.print("F");
				break;
			}
		}
			System.out.println();
		}
			
	}
}
