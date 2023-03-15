/*
	string型の配列を作成し、アルファベットa～jまでを格納してください。
	brake文を使用し、a～dまで表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	          
	cotinue文を使用し、i以外を表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	           e
	           f
	           g
	           h
	           j
*/
package lesson1_14;

public class practice {

	public static void main(String[] args) {
		String words[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		for(String word: words) {
			System.out.println(word);
			if(word == "d") {
				break;
			}
		}
		
		for(String word: words) {			
			if(word == "i") {
				continue;
			}
			System.out.println(word);
		}
			

	}

}
