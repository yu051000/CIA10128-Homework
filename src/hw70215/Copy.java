package hw70215;

import java.io.*;
import java.io.IOException;

public class Copy {

//	3、請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案

	public static void copyFile(String Fileone, String Filetwo) throws IOException { //定義例外處理(給呼叫此方法的程式)

		// 建立新檔
		File intputfile = new File(Fileone);
		File outputfile = new File(Filetwo);
		
		// 如果尚未建立目的檔案，會自行新增
        if (!intputfile.exists())
        	intputfile.createNewFile();
       
        if (!outputfile.exists())
        	outputfile.createNewFile();
        

		try {
			// 建立資料流
			FileInputStream in = new FileInputStream(intputfile);
			FileOutputStream out = new FileOutputStream(outputfile);

			int i = 0;
			while ((i = in.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1
				out.write((char)i);
//				System.out.print((char) i); // 轉換成字元char
				System.out.flush();         // 強制匯出剩餘內容
			}
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		String getfileone = "source.txt"; // 输入源文件路径
        String getfiletwo = "destination.txt"; // 输入目标文件路径
		try {
		copyFile("getfileone.txt" , "getfiletwo.txt");  //使用方法
		System.out.println("複製成功");
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
