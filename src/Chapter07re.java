
public class Chapter07re {
	public static void main(String[] args) {
		int distance = 7;
		if (distance <= 5) {
			System.out.println("とても近いです");
//		else if文の&&以前は不要。前回も同じ記述をしている
		} else if (distance > 5 && distance <= 10) {
			System.out.println("近いです");
		} else if (distance > 10 && distance <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
		String color = "red";
		switch (color) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄色信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
//			defaultはcaseが全て不該当ならこれなのでbreak文は不要
			break;
		}
	}
}
