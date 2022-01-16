
public class Chapter08re {
	public static void main(String[] args) {
		int num1 = 1;
		while (num1 < 5) {
			System.out.println(num1 * num1);
			num1++;
		}
		
//		int array1[] = {1, 2, 3, 4};
//		配列は上記のように定義することもできる
		int[] array1 = new int[] {1, 4, 5, 8};
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		for (int num2 : array1) {
			if (num2 % 2 == 0) {
				continue;
			}
			System.out.println(num2);
		}
	}
}
