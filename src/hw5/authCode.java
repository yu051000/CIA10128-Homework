package hw5;
import java.util.Arrays;
import java.util.Random;

public class authCode {
	// 建立方法
	public void getAuthCode() {
		// 將數字 0~9+大寫英文 10~35(ASCII碼)+小寫英文 36~61(ASCII碼)
		int[]element = new int [62];
		for (int e = 0; e < element.length; e++) {
			if (e < 10) {
				element[e] = 48 + e;   // 字元'0'~'9'對應int 48~57。
			}else if(e < 36) {
				element[e] = 55 + e;   // 字元'A'~'Z'對應int 65~90。
			}else
				element[e] = 61 + e;   // 字元'a'~'z'對應int 97~122。
		}
		
		// 建立存取的字串(8碼)
		int[]randomarray = new int [8];
		Random r = new Random();   //初始化
		
		// 從array陣列中取亂數0-62位置的元素放入arrayB陣列中
		for (int i = 0; i < randomarray.length; i++)
			randomarray[i] = element[r.nextInt(62)];  // "nextInt"生成一個隨機的整數
		
		// 將 int 轉型 char
		System.out.print("驗證碼： ");
		for (int j = 0; j < randomarray.length; j++)
			System.out.print((char) randomarray[j]); 
	}
}
