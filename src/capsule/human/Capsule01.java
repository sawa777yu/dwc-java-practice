package capsule.human;

public class Capsule01 {
	public static void main(String[] args) {
//		HumanNoCapsuleクラスのインスタンスの生成。
//		引数はHumanNoCapsule.javaのコンストラクタで記述しているから渡すことができる
		HumanNoCapsule human1 = new HumanNoCapsule("田中", 28);
		human1.name = "今田";
		human1.age = 70;
//		NoCapsuleの方はカプセル化していないので
//		human1.nameとしてそのままフィールドの情報を拾える
//		再代入しているのでhuman1の情報は田中さんではなく今田さんになっているはず
		System.out.println("名前は" + human1.name + "、　年齢は" + human1.age + "です。");
		
		HumanCapsule human2 = new HumanCapsule("小林", 32);
//		こちらはカプセル化しているのでhuman2.nameという書き方では拾えない。
		System.out.println("名前は" + human2.getName() + ", 年齢は" + human2.getAge() + "です。");
		human2.setName("佐々木");
		System.out.println("変更した名前は" + human2.getName() + "です。");	
	}
}
