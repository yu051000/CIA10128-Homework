package hw7;

public abstract class PenHw7 {  // PenHw7變抽象類別
//	• 建立父類別Pen
//   (1) 兩個屬性：品牌(brand)、價格(price) (封裝設計)  ok
//	 (2) 建構子設計：一個無參數與一個根據屬性而設計  ok
//	 (3) 定義Getter/Setter方法  ok
//	 (4) 宣告一個抽象方法write()  ok
	
	// 屬性定義
	private String brand;
	private double price;
	
	// 建立建構子
	public PenHw7() {}
	
	public PenHw7(String brand , double price) {
		this.brand = brand;
		this.price = price;
	}
	
	//-------------------------------------------------
	// 讀取資料
	public String getbrand() {
		return brand;
	}
	
	public double getprice() {
		return price;
	}
	
	//-------------------------------------------------
	// 寫入資料
	public void setbrand() {
		this.brand = brand;
	}
	
	public void setprice() {
		this.price = price;
	}
	
	//-------------------------------------------------
	// 建立抽象方法 write()
	public abstract void write();
	
	
	// 新增getPrice方法
	public double getPrice() {
		return 0;
	}
	
}
