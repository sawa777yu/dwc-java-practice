package extend.phone;

public interface Flyingre {
	void fly();
	
	default void powerOff() {
		System.out.println("飛んでいる場合は落下します");
	}
}
