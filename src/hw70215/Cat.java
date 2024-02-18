package hw70215;

import java.io.Serializable;

public class Cat implements Serializable {
	//版本設定為統一，final最終版。
	private static final long serialVersionUID = 2L;
	
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak(){
		System.out.println("This is Cat " + name + " speaking.");
	}
	
}