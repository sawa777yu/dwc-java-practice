package practice;

public class Chapter15_1 {
	public static void main(String[] args) {
		int a = 976;
		int b = 427;
		System.out.println(a + "と" + b + "の最大公約数は、" + gcd(a, b) + "です");
	}
	
	static int gcd(int a, int b) {
		int amari1 = a % b;
		int[] array = new int[] { a, b, amari1};
		int amari2 = 1;
		while (amari2 > 0) {
			amari2 = array[0] % array[1];
			array[0] = array[1];
			array[1] = array[2];
			array[2] = amari2;
		}
		return array[1];
	}
	
//解答では下記
//	static int gcd(int a, int b) {
//		if (b == 0) {
//			return a;
//		}
	
//		再帰呼び出しという便利な方法で繰り返しの処理を行う
//		メソッド内でreturnの後に同じメソッドを呼び出すことができる
//		gcdメソッドの引数int aにbを、int bにa%bを渡し再度gcdメソッドを実行する
//		こんなにシンプルにかけるなんて…
//		return gcd(b, a % b);
	
//	}

}
