package hw7;

public class SwordMan extends Hero {  //SwordMan子類別 繼承 Hero
	
	// 建立建構子
	public SwordMan() {
		super();
	}
	
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
	}
	
	//-------------------------------------------------
	// 建立方法
	@Override
	public void attack() {
		System.out.println("揮劍");
	}	
}