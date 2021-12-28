package classMethod.human;

public class Human04 {
	
//	static変数　多分これがクラスのインスタンス変数？
	static public int humanCount = 0;
	
//	アクセス修飾子publicを用いてメンバー変数nameを定義
	public String name;
	
//	final修飾子を記述することで定数となる。定数とは最初に代入した値を後から変更できない変数のこと
	public static final String GREETING = "こんにちは";
	
//	引数が一つのコンストラクタ。
//	コンストラクタとは、そのクラス（下記ではHuman04）のオブジェクトが生成されたときに
//	自動的にコンストラクタ内に記述された内容が実行されるというもの
	public Human04(String name) {
		this.name = name;
		Human04.humanCount++;
	}
	
//	staticとはクラスメソッドやクラスインスタンスの定義の際に付けられるもの。
//	クラスのオブジェクトを生成していなくても「クラス名.クラスメソッド」で呼び出せるのが特徴
//	void　戻り値を返さないメソッドは「戻り値の型」にvoidを入れる
	static public void staticMethodPrint() {
		System.out.println("人の数は" + Human04.humanCount);
	}
	
//	staticがついていないのがインスタンスメソッド？
	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
	}
}
