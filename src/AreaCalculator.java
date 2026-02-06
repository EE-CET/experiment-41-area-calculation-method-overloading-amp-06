import java.util.*;
 class Demo
{
	double calculateArea(float radius)
	{
		return (Math.PI*radius*radius);
	}
	double calculateArea(float length, float breadth)
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
		System.out.printf("%.2f\n",obj.calculateArea(a));
		System.out.printf("%.2f\n",obj.calculateArea(l,b));
		System.out.printf("%.2f\n",obj.calculateArea(base,height));
	}
}