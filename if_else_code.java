package src.class_obj;

import java.util.Scanner;

public class if_else_code {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0)
		{
			if ((n%2)==0)
			{
				System.out.println("The number is negative & Even");
			}
			else
				System.out.println("Then number is negative & odd");
		}
		if(n>0)
		{
			if ((n%2)==0)
			{
				System.out.println("The number is positive & Even");
			}
			else
				System.out.println("Then number is positive & odd");
		}
		if (n==0)
			System.out.println("Number is Zero");
	}

}
