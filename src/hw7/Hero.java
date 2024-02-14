package hw7;

public abstract class Hero {  //父類別(抽象類別)
	// 省略 getter/setter...
	
	// 屬性定義
	protected String name;
	private int level;
	private double exp;
	
	private FaceMove move1;
	private FaceDefend defend1;
	
	//-------------------------------------------------
	// 建立建構子
	public Hero() {
		this("David", 1, 0);
	}

	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	//-------------------------------------------------
	// 寫入資料
	public void setFaceMove(FaceMove move1) {
		this.move1 = move1;
	}
	public void setFaceDefend(FaceDefend defend1) {
		this.defend1 = defend1;
	}
	
	//-------------------------------------------------
	// 建立抽象方法 attack()
	public abstract void attack();
	
	// 建立方法(抽象方法) -> 轉為介面
	protected void move(){
		move1.move();
	}
	
	protected void defend(){
		defend1.defend();
	}
	
}