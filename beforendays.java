package src.class_obj;

import java.util.Scanner;

public class beforendays {
	public static void main (String[] args)
	{
	int day_number;
	String day_name;
	//Current day - 0-Sunday;1-Monday; 2- Tuesday,3-Wednesday,4-Thursday,5-Friday,6-Saturday
	System.out.println("Enter the number of current day");
	Scanner sc = new Scanner(System.in);
	int d = sc.nextInt();
	System.out.println("Enter the number of day of days before you want to know");
	int n = sc.nextInt();
	
	int x = n%7;
	
	int ans = d-x;
	
	if (ans>0)
	{
		System.out.println(ans);
	}
	
	if(ans<0)
	{
		System.out.println(ans+7);
	}
	
	
	
	
	}
	

}
