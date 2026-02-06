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
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		System.out.println("%0.2f",obj.calculateArea(a));
		System.out.println("%0.2f",obj.calculateArea(l,b));
		System.out.println("%0.2f",obj.calculateArea(base,height));
	}
}