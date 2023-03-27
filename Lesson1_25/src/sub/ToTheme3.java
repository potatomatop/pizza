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

public class ToTheme3 {

//	int rdm = (int)Math.ceil(Math.random()*1000);
//	String hp = "HP";
//	String mp = "MP";
//	String atk = "攻撃力";
//	String agi = "素早さ";
//	String def = "防御力";
	
	
//	public ToTheme3() {
//		System.out.println();
//	}

	class parent {
		int rdm = (int)Math.ceil(Math.random()*1000);
		public parent(String statusName) {
			System.out.println(statusName + "：" + rdm); 
		}
		
	}
	
	class HP extends parent {
		int rdm = (int)Math.ceil(Math.random()*1000);
		public HP() {
			super("HP");
			
		}
		
	}
	
	class MP extends parent {
		int rdm = (int)Math.ceil(Math.random()*1000);
		public MP() {
			super("MP");
			
		}
		
	}

	class ATK extends parent {
		int rdm = (int)Math.ceil(Math.random()*1000);
		public ATK() {
			super("攻撃力");
		}

	}
	
	class AGI extends parent {
		int rdm = (int)Math.ceil(Math.random()*1000);
		public AGI() {
			super("素早さ");
		}
	}
	
	class DEF extends parent {
		int rdm = (int)Math.ceil(Math.random()*1000);
		public DEF() {
			super("防御力");
		}
	}

	// 表示用集約
	public void pass() {
		
		new HP();
		new MP();
		new ATK();
		new AGI();
		new DEF();
	}
} 


	
