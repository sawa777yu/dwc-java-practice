package practice;

import extend.phone.FlyingPhonere;
import extend.phone.MobilePhone;
import extend.phone.Phone;

public class Chapter13re {
	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
		mobilePhone.takePicture();
		Chapter13re.staticCall(mobilePhone, "99-8888-7777");
		mobilePhone.powerOff();
		
		FlyingPhonere flyingPhone = new FlyingPhonere(5);
		flyingPhone.fly();
		Chapter13re.staticCall(flyingPhone, "000-1111-2222");
		flyingPhone.powerOff();
	}
	
	public static void staticCall(Phone phone, String number) {
		phone.call(number);
	}
}
