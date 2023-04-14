package sub;

public class dataCustom {
	
	// 
	public void animals() {
		
		// 入力クラスをインスタンス化
		input ipt = new input();
		
		// コンソールに入力された値を「,」で6つに分け、配列animalsに格納
		// （＝各動物ごとのデータに分かれる）
		String[] animals = null;
		animals = ipt.inputConsole().split(",", 6);
		
		// 動物の継承クラスをインスタンス化
		animal ani = new animal();
		
		// 引数として配列animals[i]とiを渡す
		for(int i = 0; i < animals.length; i++) {
			ani.data(animals[i], i);
		}

	}

}
