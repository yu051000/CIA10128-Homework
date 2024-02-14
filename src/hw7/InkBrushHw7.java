package hw7;

public class InkBrushHw7 extends PenHw7 {
//	• 建立兩個子類別Pencil與InkBrush繼承Pen父類別
//	 (1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫  ok
//	 (2) Pencil實際售價為定價8折，InkBrush為定價9折
//	 (3) 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額
	
	private double InkBrushprice;
	
	// 建立建構子
	public InkBrushHw7() {
		super();
	}

	public InkBrushHw7(String brand, double price , double InkBrushprice) {
		super(brand , price);
		this.InkBrushprice = InkBrushprice;
	}

	// -------------------------------------------------
	// 繼承Pen方法
	public void write(){
		System.out.println("InkBrush：");
		System.out.println("沾墨汁再寫");
	}
	
	// override
	public double getPrice() {
        return InkBrushprice*0.9;
    }
}
