package sub;

public class PlaceData {
	
	// 地域のデータを配列placesに格納
	protected String places[] = {
		"北海道:札幌市:83424",
		"青森県:青森市:9646",
		"岩手県:盛岡市:15275",
		"宮城県:仙台市:7282",
		"秋田県:秋田市:11638",
		"山形県:山形市:9323",
		"福島県:福島市:13784",
		"茨城県:水戸市:6097",
		"栃木県:宇都宮市:6408",
		"群馬県:前橋市:6362",
		"埼玉県:さいたま市:3798"
		};
	// setter・getter用変数
	int place = 0;
	// Inputクラス呼び出し
	Input ipt = new Input();
	
	
	// 入力された値をString型からint型に変換し、
	// 対応するインデックス番号の配列要素に対して処理をする
	public PlaceData() {
		
		// 配列inputData（入力した数字たち）の値を１つずつ全部拾い、
		// 対応する配列placesのデータを読み込む
		for(String area: ipt.inputConsole()) {
			// 文字列型として入っている値を数値型に変換
			int areaNum = Integer.parseInt(area);
			
			// areaNum（コンソールに入力された値）が0～10に収まっているかチェック
			if(0 <= areaNum || areaNum <= 10) {
				// setterに値（0～10）を渡す
				setPlace(areaNum);
				// customDataに引数としてplaces[place]を渡す <----- String型
				new CustomData(getPlace());
			} else {
				// 0～10でない値なら処理終了
				break;
			}
			
		}
	}

	// getter　インデックス番号が「place」のデータを配列placesから引っ張ってくる
	public String getPlace() {
		return places[place];
	}

	// setter　引数thereをフィールド変数placeに格納
	public void setPlace(int there) {
		this.place = there;
	}
	
	
}
