package sub;

import java.util.Scanner;

public class input {
		String inputData = null;
	
	// コンソールに入力受付＋nullチェック
	public String inputConsole() {
		// 入力受付
		System.out.println("コンソールに文字を入力してください");
		Scanner scan = new Scanner(System.in);
		// inputDataに入力内容を格納
		inputData = scan.nextLine();
		
		// nullチェック
		if(inputData != null) {
			System.out.println();
			System.out.println("コンソール出力結果");
			System.out.println();
		} else {
			System.out.println("入力をやり直してください");
		}
		
		return inputData;
	}
}
