import java.util.*;
public class Volumeofcylinder{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		double radius=sc.nextDouble();
		System.out.println("Enter height");
		double height=sc.nextDouble();
		double Volume =3.14*radius*radius*height;
		System.out.println("Volume of Cylinder is "+ Volume);
		}
	}
	
