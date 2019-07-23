package study;

public class Method {

	public static void main(String[] args) {
		int i = 1;
		loop(1, 10);
		System.out.println("********");
		loop(20, 40);

	}

	public static void loop(int step, int finalValue) {
		while (step <= finalValue) {
			System.out.println(step);
			step++;
		}
	}
//	public static void loop2() {
//		int j=20;
//		while(j<=40) {
//			System.out.println(j);
//			j++;
//		}
//		}

}
