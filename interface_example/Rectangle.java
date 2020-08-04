package interface_example;
public class Rectangle implements Polygon{
	@Override
	public void lengths(int length, int breadth) {
		int area = ( length * breadth );
		System.out.println("Total area is :- "+area);
	}

}
