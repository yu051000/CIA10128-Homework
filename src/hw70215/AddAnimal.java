package hw70215;

import java.io.*;
import java.io.EOFException;


public class AddAnimal {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
//		1、請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。
//		   注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
		
		// 若C:\\內沒有data資料夾，自動新增
		File datafile = new File("C:\\data");
		if(!datafile.exists())    //判斷是否有存在
			datafile.mkdir();     //確認新增
		
		// 建立ser檔
		File addanimal = new File("Object.ser"); 
		
		Dog dog = new Dog("小白");
		Cat cat = new Cat("小橘");
		
		
		// 輸出
		FileOutputStream intfile = new FileOutputStream(addanimal);
		ObjectOutputStream outfile = new ObjectOutputStream(intfile);
		outfile.writeObject(dog);
		outfile.writeObject(cat);
		
		outfile.close();
		intfile.close();
		
		
		// 輸入
		FileInputStream in = new FileInputStream(addanimal);
		ObjectInputStream out = new ObjectInputStream(in);
		System.out.println(datafile.getName() + "內容如下: "); //"getName()" 回傳檔案名稱
		try {
			while (true) {
				// 因此時回傳型態是Object類型，故需要自行轉型。
				// 轉型後再操作"speak()"方法
				((Dog) out.readObject()).speak();
				((Cat) out.readObject()).speak();
				System.out.println("--------------------");
			}
			
		}catch(EOFException e) {
			System.out.println("已讀取");
		}
		out.close();
		in.close();
	}

}
