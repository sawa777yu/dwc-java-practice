package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

//わけが分からなすぎて答え見た

public class Chapter15_2 {
	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
//		Pathオブジェクトを使ってファイルやディレクトリを表す
//		https://www.javadrive.jp/start/file/index1.html
		Path inputPath = fs.getPath("resources/input.txt");
		Path outputPath = fs.getPath("resources/output.txt");
		
//		・newBufferedReader(Path path)
//		→ファイルを読み取り用に開き、効率的な方法で
//		ファイルからテキストを読み込むBufferedReaderを返すメソッド
//		・try-with-resources
//		→resourceをオープンした場合（＝インスタンスを生成した場合）は
//		必ずクローズ処理をしないといけないのだが
//		クローズ漏れが多かったのでjava７以降
//		try-with-resourcesという書き方が使えるようになった
//		tryの後ろに初期化処理を記載することでクローズが不要となる
		try(BufferedReader br = Files.newBufferedReader(inputPath);
//				実行してもファイルが出力されない
				BufferedWriter bw = Files.newBufferedWriter(outputPath);) {
			
//			readLineメソッド
//			→テキストファイルから１行分のテキストをまとめて読み込むメソッド
//			line変数を一旦nullで定義しているのはなんでなんやろう
//			直接br.readLine()ではだめなのか
			String line = null;
			while ((line = br.readLine()) != null) {
				if (line.length() != 5) {
//					条件に一致するものを強制的に飛ばして先頭にもどす文
//					今回でいうと５文字の文以外が読み込まれたときに
//					書き出しは行わず次の行を読み込む
					continue;
				}
				bw.write(line);
//				newLineメソッド
//				→プログラムを実行しているOSなどの環境に合わせて
//				適した改行を自動で判断して出力してくれるメソッド
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("出力処理終了");
		}
	}
}
