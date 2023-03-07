package src.class_obj;

public class check_prime {
public static void main (String[] args)
{
	int n =298;
	n=n+1;
	checkprime(n);
	while((checkprime(n)) == false)
	{
		n=n+1;
		checkprime(n);
		
	}
	
	System.out.println(n);
	
}

public static boolean checkprime(int n)
{
	if (n==1)
	    return false;
		if((n==2)||(n==3))
		return true;
		if((n%2==0)||(n%3)==0)
		return false;
		
		for(int i=5;i*i<=n;i=i+6)
		{
		if(((n%i)==0)||(n%(i+2)==0))
			
			return false;
					
		}
		
		return true;		
}

}
