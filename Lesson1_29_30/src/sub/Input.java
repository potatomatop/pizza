package sub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Input {
	
	// コンソールに入力受付＋nullチェック
	public ArrayList<String> inputConsole() {
		ArrayList<String> inputData = new ArrayList<String>();
		
		
		// 入力受付
		System.out.println("数字と順（昇順／降順）を入力してください");
		Scanner scan = new Scanner(System.in);
		
		
		// 値が入力されている間続く処理
		while(scan.hasNextLine()) {
			// 入力した値をvalueに格納
			String value = scan.nextLine();
			
			// 入力がなければwhile文（ArrayListへの追加）を終了
			if(value.length() == 0) {
				break;
			}
			
			//valueの値を配列inputData（ArrayList）に追加する			
			inputData.add(value);
		}
		
		
		// 「昇順／降順」の値を取り除いてソートする
		if(inputData.remove("昇順")) {
			// inputDataの値「昇順」を取り除き、残った値を昇順にする
			Collections.sort(inputData);
		} else if(inputData.remove("降順")) {
			// inputDataの値「降順」を取り除き、残った値を昇順にする
			Collections.sort(inputData);
			// （昇順を）逆順に並べ替える
			Collections.reverse(inputData);
		}	


		
		// 表示テスト
		for(int i = 0; i < inputData.size(); i++) {
			// 配列inputDataに入力された値を順番に出力
			System.out.println(inputData.get(i));
		}
		// inputDataを返す
		return inputData;
	}
}


