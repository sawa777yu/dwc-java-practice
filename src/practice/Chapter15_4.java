package practice;

//参考書みてやったけど正解やった
public class Chapter15_4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
//			Runnableインターフェースを読み込んでのスレッドの実行方法
//			1.Runnableインターフェースを実装しているクラスのインスタンスの生成
			ThreadSample ts = new ThreadSample(i);
//			2.そのインスタンスを引数としてThreadクラスのインスタンスを生成
			Thread thread = new Thread(ts);
//			3.生成したThreadクラスのインスタンスでThreadクラスのstartメソッドを呼び出す
			thread.start();
		}
		
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Chapter15_4のスレッド：" + i + "回目");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
