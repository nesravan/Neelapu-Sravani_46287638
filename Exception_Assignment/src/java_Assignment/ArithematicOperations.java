package java_Assignment;
interface Operations
{
	
	public int arithematicoperations(int num1,int num2);
}
	public class ArithematicOperations {
		public static void main(String[] args)
		{
			Operations addition=(int num1,int num2)->num1+num2;
			Operations substraction=(int num1,int num2)->num1-num2;
			Operations multiplication=(int num1,int num2)->num1*num2;
			Operations division=(int num1,int num2)->num1/num2;
			System.out.println("Addition="+addition.arithematicoperations(4, 5));
			System.out.println("substraction="+substraction.arithematicoperations(4, 5));
			System.out.println("multiplication="+multiplication.arithematicoperations(4, 5));
			System.out.println("division="+division.arithematicoperations(4, 5));
		}
	}
