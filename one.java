package src.class_obj;

public class one {
	public static void main (String[] args)
	{
		int n =7;
		System.out.println("Hello");
		System.out.println(within(n));
		
	}
	public static boolean within(int n)
	{
		if(n==0)
		return true;
		if(n%10==0)
		{
			if((n>=-3)&&(n<=3))
			return true;
							
			if((n>=7)&&(n<=13))
			return true;
		}
		
		return false;
		
	}

} 
