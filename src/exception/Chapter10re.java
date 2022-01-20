package exception;

import java.sql.SQLException;

public class Chapter10re {
	public static void main(String[] args) {
		
		try {
			int array[] = { 1, 3, 5 };
			Chapter10re.validIndex(array, 2);
			Chapter10re.validIndex(array, 3);
			
			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}
		
		try {
			Chapter10re.throwSQLException();
//			解答では以下はfinally文で記述
			System.out.println("throwSQLExceptionの呼び出し終了");
		} catch (SQLException e) {
			System.out.println("SQLExceptionが発生しました");
			e.printStackTrace();
		}
		
		System.out.println("mainメソッドの終了");
	}
	
	private static void validIndex(int array[], int index) {
		if (index < array.length) {
			System.out.println("インデックス" + index + "の要素数は" + array[index] + "です");
		} else {
			throw new IllegalArgumentException(index + "はサイズの範囲外です");
		}
	}
	
	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQLエラーです");
	}
}
