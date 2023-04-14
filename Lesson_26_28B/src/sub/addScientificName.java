package sub;

// 引数からデータを参照し、setter・getterを使って条件に合う値を返す
public class addScientificName {
	
	// 学名変数
	protected String Lion = "パンテラ レオ";
	protected String Elephant = "ロキソドンタ・サイクロティス";
	protected String Panda = "アイルロポダ・メラノレウカ";
	protected String Chimpanzee = "パン・トゥログロディテス";
	protected String Zebra = "チャップマンシマウマ";
	protected String Parakeet = "不明";
	protected String nothing = "データにないよ！";
	// setter・getter用変数
	protected String sName;
	
	// 引数と合致したケースのデータ（学名）を返す
	public String sName(int num) {
		
		// 引数と合致したフィールド変数をセットする
		switch(num) {
			case 0:
				setsName(Lion);
				break;
			case 1:
				setsName(Elephant);
				break;
			case 2:
				setsName(Panda);
				break;
			case 3:
				setsName(Chimpanzee);
				break;
			case 4:
				setsName(Zebra);
				break;
			case 5:
				setsName(Parakeet);
				break;
			default:
				setsName(nothing);
				break;
		}
		
		return getsName();
	}

	
	// getter
	public String getsName() {
		return sName;
	}

	// setter
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	
}
