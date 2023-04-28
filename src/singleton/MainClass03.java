package singleton;

class A03{
	static A03 a;
	// static이 붙은 것이 이미 만들어진 것이기 때문에
	// 변수에도 static이 있어야 함.
	int num;
	
	private A03() {
		System.out.println("생성자 실행");
	}
	public static A03 getInstance() {
		System.out.println(a);
		// 최초 => null
		if(a==null) {
			a = new A03();
		} // 객체를 한번만 생성
		return a;
		// 내부 접근 방식
		// 생성자 호출이 되고 return으로 값을 돌려줌
		// static ; class 이름을오 접근가능
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		A03 a01 = A03.getInstance();
		A03 a02 = A03.getInstance();
		A03 a03 = A03.getInstance();
		System.out.println();
		a01.num=100;
		a02.num=200;
		a03.num=300;
		System.out.println("01 : " + a01.num + " : " +a01 );
		System.out.println("01 : " + a02.num + " : "+a02);
		System.out.println("01 : " + a03.num + " : "+a03);
	}
}
