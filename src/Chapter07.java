
public class Chapter07 {
	public static void main(String[] args) {
		int far = 7;
		if (far <= 5) {
			System.out.println("とても近いです");
//		if文の後はelse ifなので&&は不要
		}else if (far > 5 && far <= 10) {
			System.out.println("近いです");
//		ここも
		}else if (far > 10 && far <= 15) {
			System.out.println("遠いです");
		}else if (far > 15) {
			System.out.println("とても遠いです");
		}
		
		String co = "red";
		switch (co) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		default:
			System.out.println("青信号です");
			break;
		}
	}
}
