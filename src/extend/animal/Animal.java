package extend.animal;

//abstractと記述することでこのクラスは抽象クラスとなる
public abstract class Animal {
	protected String name;
	
	public void eat() {
		System.out.println(name + "が食事をしました！");
	}
	
//	abstractと記述することでこのメソッドは抽象メソッドとなる
//	抽象メソッドはブロックの中身は記述せず宣言のみを行う
//	記述をしてしまうとコンパイルエラーになる
//	抽象メソッドとするとサブクラスごとに異なる処理を行わせることができる
//	（サブクラスにてオーバーライドが必須となるが）
	public abstract void cry();
}
