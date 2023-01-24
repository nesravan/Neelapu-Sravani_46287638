package oops_Assignment;

public abstract class Abstract {
	public static void main(String args[]) {
		demo1 ob=new demo1();
		ob.show();
	}
		}
abstract class demo{
	void show() {
	}
}
class demo1 extends demo{
	public void show()
	{
		System.out.println("this is show class");
	}
}
