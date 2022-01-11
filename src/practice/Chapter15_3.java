package practice;

//全問正解
public class Chapter15_3 {
	public static void main(String[] args) {
		int i1 = 123;
		double d1 = i1;
		System.out.println(d1);
		
		double d2 = 12.345;
		int i2 = (int)d2;
		System.out.println(i2);
		
		int i3 = 1;
		int i4 = 2;
/*		
 		ここも（ダウン？）キャストしないと0.0が出力される
		int→doubleという大きな型への代入なのに
		なぜキャストが必要なのか
		（予想）キャストしないとint型のまま計算されるから小数点以下が切られてしまって
		答えが「０」となって０．０になっている？
		↓
		予想合っていた。キャストしないとint型の答えをdouble型に変換することになるのかな。
		キャストをすると計算自体をdouble型で行うし答えもdouble型で出てくるんやと思う
*/
		double d3 = (double)i3 / i4;
		System.out.println(d3);
		
		int i5 = 128;
		byte b1 = (byte)i5;
		System.out.println(b1);
	}
}
