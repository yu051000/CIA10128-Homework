package hw5;
import java.util.Arrays;

public class randAvg {
	// 建立方法
	public void randAvg() {
		int[] numarray = new int[10];
		int sum = 0 , count = 0;
		
		// 取得亂數總和
		System.out.print("此串亂數為：");
		for (int i = 0; i < numarray.length; i++) {
			int randnum = (int)(Math.random()*101);
			numarray[i] = randnum;
			sum += numarray[i];		
			count++;
			System.out.print(numarray[i] + " ");
		}
		System.out.print("\n平均值：" + (sum/count));
	}
}
