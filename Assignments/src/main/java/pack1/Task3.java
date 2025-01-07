package pack1;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=S.nextInt();
		Task3 obj=new Task3();
		int reverse=obj.reverse(n);
		System.out.println("The reverse of a number is " +reverse);
		boolean pal=obj.palindrome(n);
		System.out.println("The palindrome of a number is " +pal);

	}
	public int reverse(int n)
	{
		int rev=0,rem;
		while(n>0)
		{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		return rev;
		
		
	}
	public boolean palindrome(int n)
	{
		int Rev=reverse(n);
		if(n==Rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
