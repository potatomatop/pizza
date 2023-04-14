package sub;

public class ToTheme4 {

	ToTheme2 tt2 = new ToTheme2();
	ToTheme3 tt3 = new ToTheme3();
	
	public void output() {
		
		System.out.println("こんにちは 「 " + tt2.inputCon() + " 」 さん");
		System.out.println("ステータス");
		tt3.pass();
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
	}
}
