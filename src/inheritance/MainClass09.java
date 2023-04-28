package inheritance;

/*
 * protected 
 * 외부의 접근은 불가능하고 (같은 패키지내는 허용?) 
 * 자식에게는 허용
 * 
 * private < default(없는거) < protected < public
 * 
 */

class A09{
	protected int num = 100;
	String s = "부모";
}

class B09 extends A09{
	String s = "자식";
	public void test() {
		System.out.println(num);
		System.out.println(this.s);
		System.out.println(super.s);
		// 우선적으로 자기 자신을 먼저 찾아가고 
		// 해당 값이 없으면 부모의 값을 찾아감
	}
}

public class MainClass09 {
	public static void main(String[] args) {
		B09 b = new B09();
		b.test();
	}
}
