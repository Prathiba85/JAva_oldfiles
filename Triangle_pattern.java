package src.class_obj;

public class Triangle_pattern {
public static void main(String[] args)
{
	int i=1;
	int j=1;
	int n = 3;
	while(i<=n)
	{
		j=1;
		while(j<=i)
		{
			System.out.print("*");
			j++;
		}
		System.out.println();
		i++;
	}
}

}
