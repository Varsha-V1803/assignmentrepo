package pack1;
import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the number of products:");
		int n=S.nextInt();
		int prices[]=new int[n];
		System.out.println("Enter the prices of products:");
		for(int i=0;i<n;i++)
		{
			prices[i]=S.nextInt();
		}
		Task5 obj=new Task5();
		int result1=obj.method1(prices);
		System.out.println("The total amount is "+ result1);
		int result2=obj.method2(prices);
		System.out.println("The discount is "+ result2);
		int final_amt=result1-result2;
		System.out.println("The final amount is "+ final_amt);
		

	}
	public int  method1(int prices[])
	{
		int total_amount=0;
		for(int i=0;i<prices.length;i++)
		{
			total_amount=total_amount+prices[i];
		}
		return total_amount;
		
	}
	public int method2(int prices[])
	{
		int amt=method1(prices);
		if(amt>5000)
		{
			int discount=(int) (amt*0.2);
			return discount;
		}
		else
		{
			return 0;
		}

	}

}
