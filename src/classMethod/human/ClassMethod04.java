package classMethod.human;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 yamada = new Human04("山田");
		
//		「Human04.〜」はインスタンスを生成せずにクラスから呼び出している状態？
//		メンバー変数であるstaticMethodPrintはインスタンスを生成せずに使用できる
		Human04.staticMethodPrint();
//		staticな定数であるGREETINGもインスタンスを生成せずに参照できる
		System.out.println(Human04.GREETING);
		
//		インスタンスメンバーである.instanceMethodPrintはインスタンスを生成してから使用する
//		インスタンスの生成自体はHuman04 yamada = new Human04("山田");でされているので
//		生成されたyamadaを使うことがインスタンスを生成してからという説明につながっている？
		yamada.instanceMethodPrint();	
	}
}
