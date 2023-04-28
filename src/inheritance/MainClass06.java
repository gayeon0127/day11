package inheritance;

class A06{
	public A06(String s) {
		System.out.println(s + ": 부모실행");
	}
	public A06() {
		// 디폴트 생성자 
		// 오버로딩
	}
}

class B06 extends A06{
	public B06() {
		System.out.println("자식생성자 실행");
	}
}

public class MainClass06 {
	public static void main(String[] args) {
		B06 b = new B06();
	}

}
