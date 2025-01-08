import java.util.*;
public class Averageofthreenumber{
	public static void main(String [] args){
		Scanner sc= new Scanner (System.in);
		System.out.println("enter three numbers");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double Average= (a+b+c)/3;
		System.out.println("Average of three number is " + Average);
		}
	}
	