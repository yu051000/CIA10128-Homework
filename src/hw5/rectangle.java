package hw5;
public class rectangle {
	// 建立屬性
	private int width;
	private int height;
	
	// 建立無參數的建構子
	public rectangle() {}
	
	// 讀取寬
	public int getwidth(){
		return width;
	}
	
	// 寫入寬
	public void setwidth(int width){
		if (width > 0) {
			this.width = width;
		}else
			System.out.println("寬不可為0，請重新輸入");
	}
	
	// 讀取高
	public int getheight(){
		return height;
	}
	
	// 寫入高
	public void setheight(int height){
		if (height > 0) {
			this.height = height;
		}else
			System.out.println("高不可為0，請重新輸入");
	}
}
