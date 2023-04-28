package inheritance;

class A05{
	public A05(int num) {
		System.out.println(num + " : 생성자");
	}
}

class B05 extends A05{
	public B05(int n) {
		super(n);
		// 자기자신을 찾아오고 부모를 찾아가 n값을 전달함
		System.out.println("자식 생성자");
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		B05 b = new B05(100);
		// 자식 생성자를 호출해 자기자신을 찾아감
	}
}
