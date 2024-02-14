package hw7;

public class PencilHw7 extends PenHw7 {
//	• 建立兩個子類別Pencil與InkBrush繼承Pen父類別
//	 (1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫  ok
//	 (2) Pencil實際售價為定價8折，InkBrush為定價9折 ok
//	 (3) 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額
	
	private double Pencilprice;
	
	// 繼承Pen建構子
	public PencilHw7() {
		super();
	}

	public PencilHw7(String brand, double price , double Pencilprice) {
		super(brand , price);
		this.Pencilprice = Pencilprice;
	}

	// -------------------------------------------------
	// 繼承Pen方法
	public void write(){
		System.out.println("Pencil：");
		System.out.println("削鉛筆再寫");
	}
	
	// override
	public double getPrice() {
          return Pencilprice*0.8;
     }
}
