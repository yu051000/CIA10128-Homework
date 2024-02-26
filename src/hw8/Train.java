package hw8;

public class Train implements Comparable<Train> {

	// 屬性
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	// 建構子
	public Train() {
	}

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getnumber() {
		return number;
	}

	public void setnumber() {
		this.number = number;
	}

	public String gettype() {
		return type;
	}

	public void settype() {
		this.type = type;
	}

	public String getstart() {
		return start;
	}

	public void setstart() {
		this.start = start;
	}

	public String getdest() {
		return dest;
	}

	public void setdest() {
		this.dest = dest;
	}

	public double getprice() {
		return price;
	}

	public void setprice() {
		this.price = price;
	}

	
	public int compareTo(Train train) {
		// 物件本身與 train 相比較，如果 retrun 正值，就表示比 train 大
		if (this.number > train.number) {
			return 1;
		} else if (this.number == train.number) {
			return 0;
		} else
			return -1; // 正、負值用來代表兩個物件之間的 "左右" 關係。
	}
}
