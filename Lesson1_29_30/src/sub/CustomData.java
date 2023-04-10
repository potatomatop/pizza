package sub;

public class CustomData {
	
	// 受け取った引数placeを３つに切り分けて表示する
	public CustomData(String place) {
		
		// placeを「:」で３つに切り分け、配列eachに格納
		String[] each = null;
		each = place.split(":", 3);
		// 面積（String ---> intにキャスト）格納用変数
		int land = 0;
		
		// eachの要素の数だけ繰り返し表示処理
		for(int i = 0; i < each.length; i++) {
			if(i == 0) {
				System.out.println("都道府県名：" + each[i]);
			} else if (i == 1) {
				System.out.println("県庁所在地：" + each[i]);
			} else if (i == 2) {
				// 値の型変換：String ---> int
				land = Integer.parseInt(each[i]);
				System.out.println("面積：" + (float)land + "km2");
				System.out.println();
			}
		}
	}
}
