package practice;

public class Playboy implements Character {
	private final int hp = 0;
	private final String job = "遊び人";
	
	public int attack() {
		System.out.println(job + "はただ遊んでいるだけだった");
		return this.hp;
	}
}
