import java.util.*;
public class Perimeterofrectangle{
	public static void main(String [] args){
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Length");
		double Length=sc.nextDouble();
		System.out.println("Enter Width");
		double Width=sc.nextDouble();
		double Perimeter = 2 * (Length + Width);
		System.out.println("Perimeter of a Rectangle is "+ Perimeter);
		}
	}
		
		
		