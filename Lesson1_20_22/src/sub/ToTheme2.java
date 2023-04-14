/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */

package sub;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class ToTheme2 {
	String a = "こんにちは！";
	String b = "寿司";
	
	public void greeting() {
		String a = "日本";
		System.out.println(this.a + "ここは" + a + "です！");
		check(a);
	}
	
	public void taste() {
		String b = "うまい";
		System.out.println("この" + this.b + "は" + b);
		check(b);
	}
	
	public void genre() {
		String b = "和食";
		System.out.println(this.b + "は" + b + "です");
		check(b);
	}

	public void date() {
		DateTime date = new DateTime();
		System.out.println("今の現在日時は" + DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss").print(date) + "です");
	}
	
	
	public void check(String x) {
		if(x == null) {
			System.out.println("↑このローカルに文字はないよ！出直しな！");
		} 
		
	}
	
}


