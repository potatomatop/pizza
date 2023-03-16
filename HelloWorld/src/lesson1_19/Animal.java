package lesson1_19;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
			 Dog name = new Dog();
			 System.out.println(name.animalName);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
			 Dog num = new Dog(5);
			 System.out.println(num.animals);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください			 
			 DateTime date = new DateTime();
			 System.out.println(DateTimeFormat.forPattern("yyyy-MM-dd H:m:s").print(date));
		
	}
	
	
	
}
