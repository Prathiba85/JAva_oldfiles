package src.class_obj;

public class gcd {
	public static void main(String[] args)
	{
		int a =10;
		int b=15;
		int i;
		int hcf=0;
		int lcm=0;
		//System.out.println(gcd(a,b));
		
	   int min = Math.min(a,b);
	   for (i = min;i>0;i--)
	   {
		   if(((a%i)==0)&&((b%i)==0))
			{
			hcf=i;
			System.out.println("gcd is :"+hcf);
			break;
			}
			   
	   }
		//lcm=(a*b)/hcf;
		//System.out.println(lcm);
		
		int max = Math.max(a,b) ;
		for(i=max;i<=(a*b);i++)
		{
			if(((i%a)==0)&&((i%b)==0))
			{
				System.out.println(i);
				break;
			}
			
			
		}
		System.out.println(" lcm is one");	
		
		
		//Other oprion is iteration between Maximum of (a,b) till (a*b);
	}
	
	

}
