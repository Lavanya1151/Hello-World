package study;

public class NestedClass {

	public static void main(String[] args) {
//		for(int i=1;i<=10;i++) {
//			for(int j=1;j<=10;j++) {
//				System.out.println(i +"And"+ j);
//			}System.out.println("&*^^");
//		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('@');
			}System.out.println();
		}

	}

}
