package src.class_obj;

public class bitwisecontest {
	public static void main (String[] args)
	{
		int n=3;
		int temp=0;
		int s=0;
		for (int i=1;i<=n;i++)
		{
			s = temp|i;
			temp=i;
		}

		System.out.println(s);
	}

}
