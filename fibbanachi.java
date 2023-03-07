package src.class_obj;

public class fibbanachi {
	public static void main(String[] args)
	{
		int n=6;
		int a=1;
		int b=1;
		int c=0;
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			
		}
		
		System.out.println(c);
	}

}
