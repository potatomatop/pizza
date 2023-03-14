/*	
問題.for文を使用して九九の計算を出力してください。
	※出力例 	1×1=1 1×2=2…1×9=9
				2×1=2 2×2=4…2×9=18
						・
						・
						・
				9×1=9 9×2=18…9×9=81
				*/
package lesson1_10;

public class practice2 {

	public static void main(String[] args) {
		int answer = 0;
		int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int i : number) {
			for(int x : number) {
			answer = i * x;
			System.out.println(i + "×" + x + "=" + answer);
			}
		}
	}
}
