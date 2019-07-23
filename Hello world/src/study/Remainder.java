package study;

public class Remainder {
	public static void main(String[] args) {
//		int x=10/3;
//		System.out.println(x);
//		int x=10%3;
//		System.out.println(x);
		
		int value = 1234;
		//sum of digits
		int sum=0;
		while(true) {
			sum = sum + value%10;
			value = value/10;
			if(value<10) {
				break;
			}
		}
		sum = sum +value;
			System.out.println(sum);
			
		
	}

}
