package hw70215;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Sample {
	public static void main(String[] args) {

//	1、請自行建立一個文字檔Sample.txt,內容如下:
//	請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//	Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

		// 輸入
		String line;
		int byteCount = 0, charCount = 0, lineCount = 0;
		try {
			FileReader rs = new FileReader("C:\\CIA101_Workspace\\Sample.txt");
			BufferedReader bs = new BufferedReader(rs);

			while ((line = bs.readLine()) != null) {
				lineCount++;                         // 紀錄檔案中的行數
				charCount += line.length();          // 紀錄檔案幾個字元
				byteCount += line.getBytes().length; // 紀錄檔案位元組
			}
			System.out.println("Sample.txt檔案共有：");
			System.out.print(byteCount + "個位元組, ");
			System.out.print(charCount + "個字元, ");
			System.out.print(lineCount + "列資料");
			bs.close();
			rs.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
