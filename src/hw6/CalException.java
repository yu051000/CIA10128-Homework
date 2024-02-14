package hw6;

public class CalException extends Exception { // 因是自訂"例外" ， 要先繼承Exception

	// 建立兩個建構子
	public CalException() {
	}

	public CalException(String message) {
		super(message);
	}
}
