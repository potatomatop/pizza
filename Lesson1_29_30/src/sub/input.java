package sub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class input {
	
	// コンソールに入力受付＋nullチェック
	public ArrayList<String> inputConsole() {
		ArrayList<String> inputData = new ArrayList<String>();
		
		
		// 入力受付
		System.out.println("数字と順（昇順／降順）を入力してください");
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			String value = scan.nextLine();
			if(value.length() == 0) {
				break;
			}
			inputData.add(value);
		}
		
		// 「昇順／降順」の値を取り除いてソートする
		if(inputData.remove("昇順")) {
			Collections.sort(inputData);
		} else if(inputData.remove("降順")) {
			Collections.sort(inputData);
			Collections.reverse(inputData);
		}
		
		// 表示テスト
		for(int i = 0; i < inputData.size(); i++) {
			System.out.println(inputData.get(i));
		}
		
		return inputData;
	}
}
