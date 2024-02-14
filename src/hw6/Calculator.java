package hw6;

public class Calculator {

	private int x;
	private int y;

	// 建立無參數的建構子
	public Calculator() {
	}

	// 建立有參數的建構子
	public Calculator(int x, int y) throws CalException {
		setx(x);
		sety(y);
	}

	public int getx() {
		return x;
	}

	public void setx(int x){
		this.x = x;
	}

	public int gety() {
		return y;
	}

	public void sety(int y) throws CalException {
		if (y > 0) {
			this.y = y;
		} else if (y == 0 && x == 0) {
			System.out.println("x 與 y 不可同時為0，請重新輸入。");
		} else
			System.out.println("y不可為0，請重新輸入");
	}

	// 計算x的y次方並回傳結果。
	public double getpowerXY() {
		return Math.pow(x, y);
	}

}
