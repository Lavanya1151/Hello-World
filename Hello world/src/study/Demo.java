package study;

public class Demo {
	public static void main(String[] args) {
		MethodOverloading prime = new MethodOverloading();
		if(prime.isprime(25)) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}

}
