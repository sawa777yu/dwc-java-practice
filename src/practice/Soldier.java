package practice;

public class Soldier implements Character {
	
	private final int hp = 100;
	private final String job = "戦士";
	
	public int attack() {
		System.out.println(job + "の会心の一撃！");
		return this.hp;
	}
}
