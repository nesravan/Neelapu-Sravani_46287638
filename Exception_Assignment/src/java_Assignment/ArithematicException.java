package java_Assignment;
import java.util.Scanner;
public class ArithematicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter s,s1");
		Scanner obj=new Scanner(System.in);
		int s=obj.nextInt();
		int s1=obj.nextInt();
		float c;
		try
		{
			c=s/s1;
			System.out.println(c);
		}
		catch(ArithmeticException e )
		{
			System.out.println("Divided by 0 is not valid");
		}
		}
}
