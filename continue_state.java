package src.class_obj;

public class continue_state {
	public static void main(String[] args)
	{
		int n =10;
		//print numebr of even numbers within n
		
		for( int i=0;i<n;i++)
		{
			if((n%2)==0)
				continue;
			System.out.println("Odd is  "+i);
				
		}
		
	}

}
