package sub;

public class Person{
	public static int count = 0;
	public String firstName;
// 問題1：インスタンスフィールドに「lastName」を追加しましょう
	public String lastName;
	public int age;
	public double height, weight;

// 問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
// ※順番はfirstNameの次
	public Person(String firstName, String lastName, int age, double height, double weight){
// 問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String fullName(){
		return this.firstName + this.lastName;
	}

	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
}