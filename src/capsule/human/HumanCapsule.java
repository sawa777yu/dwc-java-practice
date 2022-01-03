package capsule.human;

public class HumanCapsule {
	private String name;
	private int age;
	
//	これはコンストラクタ。メソッドとの見た目での違いは型の指定があるかどうか？
	public HumanCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	String型のnameという戻り値をもつgetNameメソッド。引数はなし
	public String getName() {
		return this.name;
	}
	
//	voidなので戻り値なしのsetNameメソッド。引数はひとつ
	public void setName(String name) {
		this.name = name;
	}
	
//	getNameと構造は同じ
	public int getAge() {
		return this.age;
	}
}
