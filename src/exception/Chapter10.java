package exception;

import java.sql.SQLException;

public class Chapter10 {
	public static void main(String[] args) {
		
		try {
			int array[] = { 1, 3, 5 };
			Chapter10.validIndex(array, 2);
			Chapter10.validIndex(array, 3);
			
			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}
		
		try {
			Chapter10.throwSQLException();
		} catch (SQLException e) {
			System.out.println("SQLExceptionが発生しました");
			e.printStackTrace();
			System.out.println("throwSQLExceptionの呼び出し終了");
		}		
		System.out.println("mainメソッド終了");
	}
	
	public static void validIndex(int array[], int i) {
		if (i <= 2) {
			System.out.println("インデックス" + i + "の要素数は" + array[i] + "です");
		} else {
			throw new IllegalArgumentException(i + "はサイズの範囲外です");
		}
	}
	
	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQLエラーです");
	}

}
