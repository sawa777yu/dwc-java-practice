package ouyou;
//intではなくBigDecimalらしい
//丸めなどをしたときに意図しない値が出ないように正確な値を出力させるためのクラスらしい
import java.math.BigDecimal;

abstract class Fruit {
	String name;
	BigDecimal price;
	
	Fruit(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
	
	abstract protected String getName();
	
	abstract protected BigDecimal getPrice();
}
