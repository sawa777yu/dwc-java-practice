package practice;

import java.util.ArrayList;
import java.util.List;

public class Chapter14 {
	public static void main(String[] args) {
		List<Character> party = new ArrayList<Character>();
		
//		addの中身の引数？の指定方法がわからなかった
//		List<Character>に対してnew Soldier(),new Playboy()で呼び出せる意味が理解できない
//		→＜＞の中身はどうやらジェネリクスと呼ぶっぽい。これについては次章で学べる
		party.add(new Soldier());
		party.add(new Playboy());
		
		Chapter14.partyAttack(party);
	}
	
	public static void partyAttack(List<Character> party) {
		for (Character character : party) {
			int hp = character.attack();
			System.out.println("ヒットポイント:" + hp);
		}
	}
}
