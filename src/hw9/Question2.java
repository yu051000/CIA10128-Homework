package hw9;

// 帳戶端
class Bank_account {
	private int totalmoney; // 所有金額

	
	// 建立匯款方法(搭配 "synchronized" 避免同步使用)
	synchronized public void remit(int a) {
		while (totalmoney > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		totalmoney += a;
		System.out.println("媽媽存了" + a + "，帳戶共有：" + totalmoney);
		if (totalmoney > 3000) {
			System.out.println("熊大被老媽告知帳戶已有錢!");
			notify();
		}
	}

	
	// 建立領錢方法(搭配 "synchronized" 避免同步使用)
	synchronized public void withdraw(int a) {
		while (totalmoney < a) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款!");

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		totalmoney -= a;
		System.out.println("熊大提了" + a + "，帳戶共有：" + totalmoney);
		if (totalmoney < 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
}

// 領錢端(繼承Thread)
class getmoney extends Thread {
	Bank_account bank_account;

	public getmoney(Bank_account bank_account) {
		this.bank_account = bank_account;
	}

	// 使用父類別(Thread)的run方法
	public void run() {
		for (int i = 1; i <= 10; i++)
			bank_account.withdraw(1000); // 每次領1000
	}

}

// 匯款端(繼承Thread)
class atm extends Thread {
	Bank_account bank_account;

	public atm(Bank_account bank_account) {
		this.bank_account = bank_account;
	}

	// 使用父類別(Thread)的run方法
	public void run() {
		for (int j = 1; j <= 10; j++)
			bank_account.remit(2000); // 每次匯2000
	}
}

public class Question2 {
	public static void main(String[] args) {
//		• 熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花,不好好唸書,
//		所以只要看到熊大帳戶的餘額超過3000元,就會停止匯款給熊大;
//		但要是帳戶餘額在2000元以下,熊大就會要求媽媽匯款給他。
//		如果帳戶餘額低於熊大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。
//		假設媽媽一次匯款 2000 元,熊大一次提款1000元,寫一個Java程式模擬匯款10次與提款10次的情形。
//		• 參考範例:TestWaitNotify.java

		Bank_account bank_account = new Bank_account();
		// 建立兩個執行續物件(爭奪物為depot物件)
		atm a = new atm(bank_account);
		getmoney g = new getmoney(bank_account);
		
		g.start();
		a.start();
	}
}
