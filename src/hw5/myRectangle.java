package hw5;

public class myRectangle {
	// 建立屬性
	private double width;
	private double depth;
	
	
	// 建立建構子
	public myRectangle() { // 不帶參數也無內容的建構子
		
	}
	
	public myRectangle(double width, double depth) { // 傳入的兩個引數會指定給對應的屬性
		this.width = width;
		this.depth = depth;
	}
	
	
	// 建立方法
	public double getwidth() {
		return width;
	}
	
	public void setwidth(double width) {  // 將收到的引數指定給width屬性
		this.width = width;
	}
	
	public double getdepth() {
		return depth;
	}
	
	public void setdepth(double depth) {  // 將收到的引數指定給depth屬性
		this.depth = depth;
	}
	
	public void getArea(){  // 能計算該長方形的面積
		System.out.println("長方形的面積 = " + width*depth);
	}
	
}
