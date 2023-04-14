package sub;

public class Person{
// 問題1：インスタンスフィールドを定義してください
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
// 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
	public double weight;
	public static int count;

// 問題2：コンストラクタを定義してください（下記それぞれの引数）
// name,age,height
	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight){
// 問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}
	
// 問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）	
	public double bmi() {
// 問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
		return (weight / (height * height));
	}
	
// 問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	public void print() {
// 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + String.format("%.1f", bmi()) + "です");
// 問題10：人数の合計を「合計○人です」と出力してください。
		System.out.println("合計" + count + "人です");
	}

}
