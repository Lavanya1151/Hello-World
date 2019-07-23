package study;

public class MethodOverloading {

//	public static void main(String[] args) {
//		System.out.println(area(5.2d,5.3d));
//		System.out.println(area(3.2d));
//		// TODO Auto-generated method stub
//
//	}
//	public static double area(double length, double width) {
//		return length*width;
//		
//	}
//	public static double area(double side) {
//		return side*side;
//		
//	}
	
	//method overloading
	
//	public static void main(String[] args) {
//		System.out.println(sum(5,5));
//		System.out.println(sum(5,2.5f));
//		
//	}
//	public static int sum(int x, int y) {
//		System.out.println("Adding 2 entities");
//		return x+y;
//		
//	}
//	public static float sum(int x, float y) {
//		System.out.println("Adding 1 int and 1 float entities");
//		return (x+y);
//		
//	}
	
//	Exercise: prime number using method
	public boolean isprime(int num) {
		int temp;
		boolean isPrime = true;
		for(int i=2; i<=num/2;i++) {
			temp = num%i;
			if(temp==0) {
				isPrime = false;
				break;
			}
		}
//		if(isPrime) 
//			System.out.println("prime");
//		else
//			System.out.println("not prime");
		
		return isPrime;
		
		
	}
	public boolean isprime(double value) {
		int num = (int) value;
		int temp;
		boolean isPrime = true;
		for(int i=2; i<=num/2;i++) {
			temp = num%i;
			if(temp==0) {
				isPrime = false;
				break;
			}
		}
//		if(isPrime) 
//			System.out.println("prime");
//		else
//			System.out.println("not prime");
		
		return isPrime;
		
		
	}

}
