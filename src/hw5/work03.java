package hw5;
import java.util.Arrays;

public class work03{ // 設計為overloading
	
	
	// 建立方法
	public void maxElement(int[][] x) {
		int max1 = x[0][0];  // 預設第一個值是最大值
		for (int x1 = 0; x1 < x.length; x1++) { // 直向
			for (int x2 = 0; x2 < x[x1].length; x2++) { // 縱向
				if (x[x1][x2] > max1) {
					max1 = x[x1][x2];  // max = 最大值
				}
			}
		}
		System.out.println(max1);
	}
	
	// 建立方法
	public void maxElement(double[][] x) {
		double max2 = x[0][0];  // 預設第一個值是最大值
		for (int x3 = 0; x3 < x.length; x3++) { // 直向
			for (int x4 = 0; x4 < x[x3].length; x4++) { // 縱向
				if (x[x3][x4] > max2) {
					max2 = x[x3][x4];  // max = 最大值
				}
			}
		}
		System.out.println(max2);
	}
}
