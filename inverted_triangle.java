package src.class_obj;

public class inverted_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=1;
		int j=1;
		
		
		while(i<=n)
		{
			j=1;
		while (j<(n-i))
		{
			
			System.out.print(" ");
			j++;
		}
		
		while(j<=n)
		{
			System.out.print("*");
			j++;
		}
		
		System.out.println();
		i++;
	}
	}

}
