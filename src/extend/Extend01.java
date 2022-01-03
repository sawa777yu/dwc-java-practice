package extend;

import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
	public static void main(String[] args) {
		Human sugimoto = new Human("杉本", 16);
		System.out.println("Humanクラスのメソッド:名前は、" + sugimoto.getName());
		
		Student sato = new Student("佐藤", 17, 70);
		System.out.println("Humanクラスのメソッド:名前は、" + sato.getName());
		System.out.println("Studentクラスのメソッド:プロフィールを紹介します。" + sato.getStudentProfile());
		
//		HunamクラスなのにインスタンスはEmployeeで作るのか
//		→Employeeクラスのインスタンスを生成してHumanクラスの変数にアップキャストしているらしい
		Human human = new Employee("田中", 28, "システム部");
		System.out.println("Humanクラスのメソッド:名前は、" + human.getName());
		
//		これがダウンキャスト？
//		→アップキャストしたHumanクラスの変数をEmployeeクラスの変数にダウンキャスト
		Employee tanaka = (Employee) human;
		System.out.println("Employeeクラスのメソッド:プロフィールを紹介します。" + tanaka.getEmployeeProfile());
		
//		printNameはstaticメソッド（クラスメソッド）なのでインスタンスを生成しなくても使用できる
		Extend01.printName(sugimoto);
		Extend01.printName(sato);
		Extend01.printName(tanaka);
	}
	
//	引数の型がHuman？
	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド:名前は、" + human.getName());
	}

}
