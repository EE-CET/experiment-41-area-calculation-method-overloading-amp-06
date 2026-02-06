import java.util.*;
 class Demo
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

public class AreaCalculator{
	public static void main(String args[])
	{
		Demo obj=new Demo();
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		float base=sc.nextFloat();
		float height=sc.nextFloat();
		System.out.println(obj.calculateArea(5));
		System.out.println(obj.calculateArea(4,5));
		System.out.println(obj.calculateArea(3,6));
	}
}