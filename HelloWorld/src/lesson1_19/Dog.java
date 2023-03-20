package lesson1_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
		String animalName;
	
	// Q2：フィールドに動物の数の変数を定義してください。
		int animals;
		
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
		public Dog() {
			animalName = "犬";
			return;
		}
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
		public Dog(int a) {
			animals = a;
			return;
		}
}
