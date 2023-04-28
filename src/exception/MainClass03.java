package exception;

public class MainClass03 {
	public static void main(String[] args) {
		int num=2;
		int[] arr = new int [3];
		arr[0]=1; arr[1]=2; arr[2]=3;
		
		try {
			System.out.println(10/2);
			for(int i=0; 1<10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArithmeticException  e) {
			System.out.println("0으로 나눌 수 없음");
		} catch(ArrayIndexOutOfBoundsException ee) {
			System.out.println("index는 2번까지 있습니다.");
		}
		System.out.println("Next!");
	}
}
