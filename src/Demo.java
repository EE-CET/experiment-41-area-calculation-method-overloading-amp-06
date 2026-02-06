import java.util.*;
 class AreaCalculator
{
	float calculateArea(float radius)
	{
		return (float)(3.14*radius*radius);
	}
	float calculateArea(float length, float breadth)
	{
		return length*breadth;
	}
	double calculateArea(double base, double height)
	{
		return 0.5*base*height;
	}
}

public class Demo{
	public static void main(String args[])
	{
		AreaCalculator obj=new AreaCalculator();
		System.out.println(obj.calculateArea(5));
		System.out.println(obj.calculateArea(4,5));
		System.out.println(obj.calculateArea(3,6));
	}
}