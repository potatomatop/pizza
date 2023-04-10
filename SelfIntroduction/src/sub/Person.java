package sub;

public class Person{
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
//	private static int count;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
//		count++;
	}
	
	public double bmi() {
		return (weight / (height * height));
	}
	
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + String.format("%.1f", bmi()) + "です");
//		System.out.println("合計" + count + "人です");
	}

}
