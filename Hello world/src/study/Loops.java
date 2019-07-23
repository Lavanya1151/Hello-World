package study;

public class Loops {

	public static void main(String[] args) {
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
////		reverse order
//		for(int i=10; i>=1;i--) {
//			System.out.println(i);
//		}
//		int i=10;
//		for(;i<=10;i++) {
//			System.out.println(i);
//		}
//		int j=10;
//		for(;;) {
//			System.out.println(j);
//			if(j<=1) {
//				break;
//			}
//			j--;
//		infinite loop
//		for(;;) {
//			System.out.println("yudnim");
//		}
//		prime number
		int x=6;
		boolean y=true;
		for(int i=2;i<x/2; i++) {
			if(x%i==0) {
				y=false;
			}
			
		}
if(y==true) {
	System.out.println("prime");
}else {
	System.out.println("not prime");
}
	}

}
