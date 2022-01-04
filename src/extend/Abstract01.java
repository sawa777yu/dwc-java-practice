package extend;

import extend.animal.Dog;

public class Abstract01 {
	public static void main(String[] args) {
		Dog dog = new Dog();
//		eatはAnimalクラスで定義されているのでanimalインスタンスを生成して使用しそうな気もするが
//		抽象クラスはインスタンスを生成できないので、サブクラスインスタンスで使用する
		dog.eat();
		dog.cry();
	}
}
