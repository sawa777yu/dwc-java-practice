
public class Chapter08 {
	public static void main(String[] args) {
		int number = 0;
		int answer1 = 0;
		while (number < 4) {
			number += 1;
			answer1 = number * number;
			System.out.println("1の答え" + answer1);
		}
		
		int array[] =  { 1, 2, 3, 4 };
		for (int i = 0; i < array.length; i++ ) {
			System.out.println(array[i]);
		}
		
		for (int arrayfor : array) {
			if ( arrayfor % 2 == 0 ) {
				continue;
			}
			System.out.println("arrayfor = " + arrayfor);
		}
	}
}
