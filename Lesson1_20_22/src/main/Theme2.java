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

package main;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import sub.ToTheme2;

public class Theme2 {
	
	public static void main(String[] args) {
		//where
		ToTheme2 where = new ToTheme2("日本");
		System.out.println(where.hello);
		
		//taste + genre
		ToTheme2 what = new ToTheme2("");
		System.out.println();
		System.out.println();
		
		//date
		DateTime date = new DateTime();
		System.out.println(DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss").print(date));
	}
	
}