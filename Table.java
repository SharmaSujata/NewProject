import java.util.Scanner;

public class Table {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int A=scan.nextInt();
		
		for (int a=1 ; a<=10 ; a++)
		{
			System.out.println(a + " * " + A + " = " + (a*A));
		}
	}

}
