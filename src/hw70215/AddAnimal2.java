package hw70215;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AddAnimal2 {

	public static void main(String[] args) throws Exception{
//		1-2、 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何
//		      (請利用多型簡化本題的程式設計)
		
		File addanimal2 = new File("Object.ser");
		AnimalHw7[] animal = new AnimalHw7[2];
		animal[0] = new Dog2("杜賓");
		animal[1] = new Cat2("加菲");

		// 輸出
		FileOutputStream ifile = new FileOutputStream(addanimal2);
		ObjectOutputStream ofile = new ObjectOutputStream(ifile);
		for(int a = 0; a < animal.length; a++) {
			ofile.writeObject(animal[a]);
		}
		ofile.close();
		ifile.close();

		// 輸入
		FileInputStream inpu = new FileInputStream(addanimal2);
		ObjectInputStream outpu = new ObjectInputStream(inpu);
		System.out.println("內容如下: ");
		try {
			while (true) {
				// 因此時回傳型態是Object類型，故需要自行轉型。
				// 轉型後再操作"speak()"方法
				AnimalHw7 currentAnimal = (AnimalHw7) outpu.readObject();
		        if (currentAnimal instanceof AnimalHw7) {
		        	currentAnimal.getname();
		            currentAnimal.speak();
		            System.out.println("speaking.");
		            System.out.println("------------------------");
		        }
			}
		} catch (EOFException e) {
			System.out.println("已讀取");
		}
		outpu.close();
		inpu.close();
	}
}
