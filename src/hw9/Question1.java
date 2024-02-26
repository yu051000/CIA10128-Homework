package hw9;

import java.util.concurrent.ThreadLocalRandom;

public class Question1 implements Runnable { // 實作Runnable介面
	
	//設立名字
	private final String name;
	
    public Question1(String name) {
        this.name = name;
    }

    
	int counter = 1; // 跟蹤迴圈的執行次數
	
	// 執行緒執行的地方
	public void run() {
		while (counter <= 10) { // 當counter計數器不超過10，迴圈會持續
			System.out.println(name + "吃第" + counter + "碗飯");
			counter++;

			try {
				// ThreadLocalRandom.current().nextInt() --> 取得500~3000隨機數
				Thread.sleep(ThreadLocalRandom.current().nextInt(500, 3001)); // 使用sleep暫停
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
//		• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//		競賽過程。
//		• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//		Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//		• 參考範例:CounterRunnable.java
//		• 需留意主執行緒執行順序
		
		System.out.println("---大胃王快食比賽開始!---");
		Question1 one = new Question1("饅頭人"); // 產生Runnable物件
		Thread test_one = new Thread(one);     // 產生執行緒Thread物件
		Question1 two = new Question1("詹姆士");
		Thread test_two = new Thread(two);
		
		
		//啟動執行緒，執行物件的run方法
		test_one.start();
		test_two.start();
		
		
		// 等待所有執行緒結束
		try {
            test_one.join();
            test_two.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("---大胃王快食比賽結束!---");
	}
}
