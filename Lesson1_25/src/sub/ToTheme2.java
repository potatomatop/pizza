/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
	 	 メソッドのオーバーライドを使用してください
		 superクラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */

package sub;

import java.util.Scanner;

public class ToTheme2 {
	String name;
	
	public String inputCon() {
		System.out.println("名前を入力してください");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		
		if(name != null) {
			setName(name);
		} else {
			System.out.println("やり直して名前を入力してください");
		}
		
		return getName();
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}

	// Getter
	public String getName() {
		return name;
	}
	

}



