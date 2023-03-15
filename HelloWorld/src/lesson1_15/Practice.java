/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package lesson1_15;

public class Practice {

	public static void main(String[] args) {
		
/*		
		下のコードの方がスマートで分かりやすいので供養。
		int[][] test;
		test = new int[4][3];
		int y[] = {64, 73, 69, 58, 81, 75, 86, 68, 79, 72, 55, 80};
		int z = 0;
		int avg1 = 0;
		int avg2 = 0;
		int avg3 = 0;
		
		while(z<12) {
			for(int i = 0; i < test.length; i++) {
				for(int x = 0; x < test.length-1; x++) {
					test[i][x] = y[z];
					z++;
					
					if(x == 0) {
						avg1 += test[i][x];
					} else if(x == 1) {
						avg2 += test[i][x];
					} else {
						avg3 += test[i][x];
					}
//					System.out.println("test[" +i+ "][" +x+ "]=" + test[i][x]);
				}
			}
		}
*/

		int[][] test = {{64, 73, 69},
				{58, 81, 75},
				{86, 68, 79},
				{72, 55, 80}};
		int avg1 = 0;
		int avg2 = 0;
		int avg3 = 0;
		
		for(int i = 0; i < test.length; i++) {
			System.out.print("生徒" + (i+1) + "：");
			System.out.print("国語" + test[i][0] + "点、");
			System.out.print("数学" + test[i][1] + "点、");
			System.out.println("英語" + test[i][2] + "点");
			
			for(int x = 0; x < test.length-1; x++) {

				if(x == 0) {
					avg1 += test[i][x];
				} else if(x == 1) {
					avg2 += test[i][x];
				} else {
					avg3 += test[i][x];
				}
				
			}
			
		}
		System.out.println("国語の平均点は" + avg1/test.length + "点です。");
		System.out.println("数学の平均点は" + avg2/test.length + "点です。");
		System.out.println("英語の平均点は" + avg3/test.length + "点です。");
	}

}


