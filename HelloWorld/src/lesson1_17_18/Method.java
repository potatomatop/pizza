package lesson1_17_18;

public class Method {

	public static void main(String[] args) {
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
		hello();
		
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
//		add(6);								//関数（処理）のみ
		System.out.println(add(6));		//出力確認
		
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
//		mul(2, 8);							//関数（処理）のみ
		System.out.println(mul(2, 8));		//出力確認
		
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
//		mul(7.1, 9.4);							//関数（処理）のみ
		System.out.println(mul(7.1, 9.4));		//出力確認
		
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
//		rndm(3);				//関数（処理）のみ

		int[] b;				//出力確認ここから
		b = rndm(3);			//関数（処理）代入	
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}						//出力確認ここまで
		
	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
	//     配列の要素の平均値を返すメソッド（関数）を作成してください。
		
		avg(b);							//関数（処理）のみ
		
//		System.out.println(avg(rndm(5)));		//出力確認
		
//		System.out.println(avg(4));
	}
	
//	Q1
	public static void hello() {
		System.out.println("Hello Java");
	}
	
//	Q2
	public static int add(int a) {
		return a + 1;
	}
	
//	Q3
	public static int mul(int a, int b) {
		return a * b;
	}
	
//	Q4
	public static double mul(double a, double b) {
		return a * b;
	} 
	
//	Q5
	public static int[] rndm(int a) {
		int x = 0;
		int y[] = new int[a];
		while(x < a) {
			y[x] = (int)Math.ceil(Math.random()*100);
			x++;
		}
		return y;
	}

//	Q6 rndm()ごとぶち込んで平均を出す <------ 迷走１
//	public static float avg(int[] a) {
//		float x = 0;
//		float total = 0;
//		for(float b: a) {
//			System.out.println(b);		//出力確認（配列の値）
//			total += b;
//		}
//		x = total/a.length;
//		System.out.println(x);
//		return x;
//		
//	}
//	Q6 この関数の「引数」をQ5の関数に入れて、配列の中身を全部足し、要素数で割る <------ 迷走２
//	public static float avg(int a) {
//		int[] b;
//		b = rndm(a);
//		float x = 0;
//		float total = 0;
//		for(float c: b) {
//			System.out.println(c);		//出力確認（配列の値）
//			total += c;
//		}
//		x = total/b.length;
//		
//		return x;
//	}
	
//	Q6 Q5を引数として受け取り、その平均を出す <------ ◎
	public static float avg(int[] a) {
	float x = 0;
	float total = 0;
	for(float b: a) {
//		System.out.println(b);		//出力確認（配列の値）
		total += b;
	}
	x = total/a.length;
	System.out.println(x);			//出力確認（平均）
	
	return x;
	}	
}
