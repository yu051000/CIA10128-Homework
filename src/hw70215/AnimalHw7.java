package hw70215;
import java.io.Serializable;

public abstract class AnimalHw7 implements Serializable { //設為抽象父類別
	//版本設定為統一，final最終版。
	private static final long serialVersionUID = 2L;
	
	//屬性
	private String name;
	
	
	//建構子
	public AnimalHw7() {}
	
	public AnimalHw7(String name) {
		this.name = name;
	}
	
	
	public String getname() {
		return name;
	}
	
	public void setname() {
		this.name = name;
	}
	
	
	//抽象方法
	public abstract void speak();
	

}
