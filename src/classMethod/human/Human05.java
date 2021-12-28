package classMethod.human;

public class Human05 {
	
//	private：現在のクラスからだけアクセスできるアクセス修飾子
	private String name;
	private int age;
	
//	引数なしのコンストラクタ
	public Human05() {
		name = "山田";
		age = 20;
	}
	
//	多分インスタンスメソッドなのでインスタンスを生成してから出ないと使えない
	public String getName() {
		return name;
	}
//	これも
	public int getAge() {
		return age;
	}
}
