package practice;

//スレッドの複数処理の方法はThreadクラスを継承するか
//Runnableインターフェースを読み込むかの２つのやり方がある
//Runnableインターフェース：クラスライブラリのひとつ
public class ThreadSample implements Runnable {
	int num;
	
	public ThreadSample(int num) {
		this.num = num;
	}
	
//	runメソッドなんかどこで使ってるねん間違ってるやろと思ったけど
//	startメソッドとセットで使うものっぽい
//	startメソッドでrunメソッドが読み込まれる
	public void run() {
		for (int i = 1; i <= 3; i++ ) {
			try {
				Thread.sleep(1000);
				System.out.println("ThreadSample"+ this.num + "のスレッド：" + i + "回目");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
