import java.util.*;
public class Powercalculation{
	public static void main(String [] args){
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Base value");
		double Base = sc.nextDouble();
		System.out.println("Enter Exponent Value");
		double Exponent=sc.nextDouble();
		double ans = Math.pow(Base,Exponent);
		System.out.println("Power is " + ans);
		}
	}
	