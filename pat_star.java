package src.class_obj;

public class pat_star {
	public static void main(String[] args)
	{
		int n=4;
		int i=1;
		int j=1;
		int k=1;
		//pyramid pattern
		/*
		while(i<=n)
		{
			j=1;
			while(j<=(n-i))
			{
			System.out.print(" ");
			j++;
			}
			k=1;
			while(k<=((2*i)-1))
			{
				System.out.print("*");
				k++;
				
			}
			i++;
			System.out.println();
			
		}*/
		//Inverted triangel
		while (i<=n)
		{
			j=1;
			while(j<=(n-i))
			{
				System.out.println(" ");
				j++;
			}
			while(j<=n)
			{
				System.out.println("*");
				j++;
			}
				
		}
	}

}
