package hw7;

public class ArrowMan extends Hero {  //ArrowMan子類別 繼承 Hero

	// 建立建構子
	public ArrowMan() {
		super();
	}

	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
	}
	
	//-------------------------------------------------
	// 建立方法
	@Override
	public void attack() {
		System.out.println("放弓箭");
	}
}