package hw7;

public class homework7 {
	public static void main(String[] args) {

//	   1、建立兩個子類別Pencil與InkBrush繼承Pen父類別
//		 (1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
//		 (2) Pencil實際售價為定價8折，InkBrush為定價9折
//		 (3) 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額
		
		PenHw7[] p = new PenHw7[2];
		p[0] = new PencilHw7("雄獅" , 100 , 100);    // Pencil
		p[1] = new InkBrushHw7("蕙風堂" , 100 , 100);  // InkBrush
		
		for (int i = 0; i < p.length; i++) {
			p[i].write();
			System.out.println("實際售價：" + p[i].getPrice());
			System.out.println("==========================");
		}
	}
}
