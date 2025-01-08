import java.util.*;
public class Areaofcircle{
	public static void main (String []args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter value of radius");
		double radius = sc.nextDouble();
		double Area = 3.14*radius*radius;
		System.out.println("Area of Circle is "+ Area);
	}
}
		