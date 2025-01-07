package pack1;
import java.util.Scanner;
public class Task2Modified {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=S.nextInt();
		Task2Modified obj=new Task2Modified();
		int result=obj.factorial(n);
		System.out.println("Factorial of " + n +" is "+result);
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
