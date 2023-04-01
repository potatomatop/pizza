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
	String hp;
	String mp;
	String atk;
	String agi;
	String def;

	class parent {
		String column = "：";
		
		public void part() {
			int rdm = (int)Math.ceil(Math.random()*1000);
			System.out.println(column + rdm); 
		}
		
	}
	
	class HP extends parent {
		public void part() {
			setHP("HP");
			int rdm = (int)Math.ceil(Math.random()*1000);
			System.out.println(getHP() + super.column + rdm); 	
		}
		
	}
	
	class MP extends parent {
		public void part() {
			setMP("MP");
			int rdm = (int)Math.ceil(Math.random()*1000);
			System.out.println(getMP() + super.column + rdm); 	
		}
		
	}

	class ATK extends parent {
		public void part() {
			setATK("攻撃力");
			int rdm = (int)Math.ceil(Math.random()*1000);
			System.out.println(getATK() + super.column + rdm); 	
		}

	}
	
	class AGI extends parent {
		public void part() {
			setAGI("素早さ");
			int rdm = (int)Math.ceil(Math.random()*1000);
			System.out.println(getAGI() + super.column + rdm); 	
		}
	}
	
	class DEF extends parent {
		public void part() {
			setDEF("防御力");
			int rdm = (int)Math.ceil(Math.random()*1000);
			System.out.println(getDEF() + super.column + rdm); 	
		}
	}

	
	// HPSetter
	public void setHP(String power) {
		this.hp = power;
	}

	// HPGetter
	public String getHP() {
		return hp;
	}
	
	// MPSetter
	public void setMP(String power) {
		this.mp = power;
	}

	// MPGetter
	public String getMP() {
		return mp;
	}
	
	// ATKSetter
	public void setATK(String power) {
		this.atk = power;
	}

	// ATKGetter
	public String getATK() {
		return atk;
	}
	
	// AGISetter
	public void setAGI(String power) {
		this.agi = power;
	}

	// AGIGetter
	public String getAGI() {
		return agi;
	}
	
	// DEFSetter
	public void setDEF(String power) {
		this.def = power;
	}

	// HPGetter
	public String getDEF() {
		return def;
	}
	
	
	// 表示用集約
	public void pass() {
		HP hp = new HP();
		hp.part();
		
		MP mp = new MP();
		mp.part();
		
		ATK atk = new ATK();
		atk.part();
		
		AGI agi = new AGI();
		agi.part();
		
		DEF def = new DEF();
		def.part();
	}
} 


	
