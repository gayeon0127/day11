package inheritance;

/*
 * 상속
 * 부모-자식관계
 * 부모가 가진 코드를 그대로 물려받아 사용하는 것
 * extends를 사용하여 상속
 */

class Calc{
	public void cacl() {
		System.out.println("계산기");
	}
}

class Computer extends Calc{
	public void computer() {
		System.out.println("컴퓨터");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		/*
		Calc c = new Calc();
		c.cacl();
		*/
		Computer com = new Computer();
		com.computer();
		com.cacl();
	}
}
