package src.class_obj;
import java.util.*;
public class calculator {

	public static void main(String[] args)
	{
		System.out.println("Enter one of the followin option: \n 1.Addition \n 2.Subtration\n 3.Multiplication \n 4.Division");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if((n!=1)&&(n!=2)&&(n!=3)&&(n!=4))
		{
		System.out.println("Please enter valid input ");
		}
		
		else
		{
			System.out.println("Enter the first number ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			switch (n)
			{
			case 1:
			System.out.println("Addition of Number :"+(a+b));
			
			case 2:
			System.out.println("Subtraction of Number :"+(a-b))	;
			break;
			case 3:
			System.out.println("Multiplication of Number :"+(a*b))	;
			break;
			case 4:
			System.out.println("Division of Number :"+(a*b))	;
			break;
				
			}
			
			
		}
		
		
	}

}
