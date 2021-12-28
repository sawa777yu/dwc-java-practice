
public class For01 {
	public static void main(String[] args) {
//		以下のfor文の処理ではまずはnumberが５以下であれば一旦ブロックの処理がされて
//		１が出力される。その後でインクリメント(++)による計算が行われる
//		なのでインクリメントの計算は一発目はスルーされる。
		for (int number = 1; number <= 5; number++) {
			System.out.println("For01 = " + number);
		}
	}
}
