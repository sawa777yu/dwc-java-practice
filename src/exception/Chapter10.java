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
//			解答では以下の文はfinallyで記述されている。catchに書いていてもいいような。
			System.out.println("throwSQLExceptionの呼び出し終了");
		}
		System.out.println("mainメソッド終了");
	}
	
	public static void validIndex(int array[], int i) {
//		解答では範囲外ならば例外をスローするという記載方法。
//		そのように記載すればelse文の記載は不要なのでよりスマート。
//		また、if文の書き方も要素の大きさは2と指定するのではなくarray.lengthで指定をしている。
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
