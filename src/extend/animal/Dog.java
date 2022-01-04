package extend.animal;

public class Dog extends Animal {
	
	public Dog() {
		this.name = "犬";
	}
	
//	抽象クラスであるAnimalを継承したサブクラスでは
//	抽象メソッドをオーバーライドする必要がある。
//	これをしていないとコンパイルエラーとなる。
	public void cry() {
		System.out.println(this.name + "が吠えました。ワン！ワン！");
	}
}
