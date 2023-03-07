package src.class_obj;
import java.util.*;
public class table {

	public static void main(String[] args)
	{
		System.out.println("Enter the number for table ");
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int m = i*n;
			System.out.println(m);
		}
	}

}
