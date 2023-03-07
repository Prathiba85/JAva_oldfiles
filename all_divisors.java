package src.class_obj;

public class all_divisors {
public static void main(String[] args)
{
	int n=12;
	
	for (int i=2;i<=n;i++)
	{
		if((n%i)==0)
		{
			System.out.println(i);
		}
	}
}

}
