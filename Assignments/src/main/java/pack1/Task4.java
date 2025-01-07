package pack1;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter your age:");
	int age=S.nextInt();
	Task4 obj=new Task4();
	boolean res=obj.vote(age);
	System.out.println(res);
	}
	public boolean vote(int age )
	{
		if(age>=18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
