import java.util.Scanner;
public class Circle extends Shape{
	Scanner scannerRef = new Scanner(System.in);
	final float pi = 3.14f;
	float radius=0;
	float inputFor_radius() {
		System.out.println("Enter value for radius :-");
		radius = scannerRef.nextFloat();
		return radius;
	}
	@Override
	void area() {
		super.area();
		float circleArea=(pi*radius);
		System.out.println(circleArea);
	}
}
