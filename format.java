package src.class_obj;

public class format {
	public static void main (String[] args)
	{
		int x = 50;
		int y =60;
	float d = (float) Math.PI;
	double f=  22.300000190734863;
		System.out.println(d);
		System.out.format("Value of PI= %.2f\n",d);
		System.out.format("%5.2f",d);
		System.out.format("Value of PI= %05.2f",d);
		System.out.printf("x=%d,y=%d",x,y);
		System.out.println();
		
		System.out.println("Print path: C:\\xy3\\abc.txt");
		
		System.out.printf("%1.1f",f);
		
		
		String s = "12";
		Integer n = Integer.parseInt(s);
		int ans = n*2;
		System.out.println();
		char ch = 'a';
		System.out.println("value is" + ch+1);
		
		
		
	}

}
