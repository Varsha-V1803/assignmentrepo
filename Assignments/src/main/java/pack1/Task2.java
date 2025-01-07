package pack1;

public class Task2 {
	public static void main(String[] args) {
		Task2 obj=new Task2();
		int result=obj.factorial(5);
		System.out.println("Factorial of 5 " +" is "+result);

	}
	public int factorial(int n)
	{
		if(n>=1)
		{
			return n*factorial(n-1);
		}
		else
		{
			return 1;
		}
	}
}
