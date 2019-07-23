package study;

public class ParameterAndReturnType {
	public static void main(String[] args) {
		double area = areaRectangle(12.2, 3.5);
		System.out.println(area);
		
		
	}
//	public static void areaRectangle(double length, double width) {
//		
//		System.out.println(length*width);
//		
//	}
//	return type
public static double areaRectangle(double length, double width) {
		
//		System.out.println(length*width);
		return length*width;
		
	}

}
