package src.class_obj;

public class star_pattern {
public static void main(String[] args)
{
	int i = 0;
    int j =0;
    int n=5;
/* Using for loop    
    for (i=0;i<5;i++)
    {
    	for (j=0;j<n;j++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }*/
    
 //using while loop
    while (i<n)
    {
    	 j=0;
    	while(j<n)
    	{
    		System.out.print("*");
    		j++;
    	}
    	System.out.println();
		i++;
    }
}

}
