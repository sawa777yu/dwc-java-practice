package extend.human;

public class Student extends Human {
	private int score;
	
	public Student(String name, int age, int score) {
//		スーパークラスのコンストラクタを呼び出すための記述らしい
//		サブクラスのコンストラクタでは
//		最初にスーパークラスのコンストラクタを呼び出す必要があるらしい
		super(name, age);
		this.score = score;
	}
	
	public String getStudentProfile() {
//		サブクラスのフィールドにageが無いのであればsuperを使わずthisでも参照できる
		String profile = "年齢は" + super.age + "です。";
		profile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
	}
}
