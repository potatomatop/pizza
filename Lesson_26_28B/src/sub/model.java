package sub;

// 抽象クラス？
public abstract class model {
	// 学名判定クラスをインスタンス化
	addScientificName addName = new addScientificName();
	
	// 抽象メソッド
	public abstract void data(String animal, int x);
	
	// 抽象メソッドの引数animalをそのまま用いて、１匹分のプロフィール表示を完成させる
	public void profile(String animal, int x) {
		// データを「動物名・体長・速度」に切り分け、配列eachに格納
		String[] each = animal.split(":", 3);
		
			// 配列each（「動物名・体長・速度」のデータ入り）を順番に出力する
			for(int i = 0; i < each.length; i++) {
				if(i == 0) {
					System.out.println("動物名：" + each[i]);
				} else if(i == 1) {
					System.out.println("体長：" + each[i] + "m");
				} else if(i == 2) {
					System.out.println("速度：" + each[i] + "km/h");
				}
			}
			// 抽象メソッドの引数xを学名判定クラスに渡す
			System.out.println("学名：" + addName.sName(x));
			System.out.println();
	}
}


// 継承・各動物表示
class animal extends model {
	
	@Override
	public void data(String animal, int x) {
		profile(animal, x);
	}
	
}


