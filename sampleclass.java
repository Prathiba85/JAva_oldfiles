package src.class_obj;

import java.util.Scanner;

public class sampleclass {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int f=0;f<n;f++)
		{	
		
		
		String S = sc.next();
		char num[] = {'0','1','2','3','4','5','6','7','8','9'};
		char lowercase[] = {'a','b','c','d','e','f','g','h','i','j'	};
		char uppercase[]= {'A','B','C','D','G'};
		int i;
		int j;
		int k;
		int s;
		int countnum =0;
		int countlower=0;
		int countupper=0;
		int count = 0;
		//String S="GFGg1";
		for (i=0;i<S.length();i++)
		{
			char a = S.charAt(i);
			//System.out.println("Value of i "+i+a);
			
			
			for( j=0;j<num.length;j++)
			{
				
				if(countnum<1)
				{
				if(num[j]==a)
				{
					countnum =1;
					
					System.out.print("count number ="+countnum);
					
				}
				}
				
			}
			for( k=0;k<lowercase.length;k++)
			{
				if(countlower<1)
				{
				if(lowercase[k]==a)
				{
					countlower =1;
					System.out.print("count lower = "+countlower);
					
				}
				}
				
			}
			for(s=0;s<uppercase.length;s++)
			{
				if(countupper<1)
				{
				if(uppercase[s]==a)
				{
					countupper =1;
					System.out.print("count upper = "+countupper);
					
				}
				}
				
			}
			count =countnum+countlower+countupper;
			if(count==3)
				break;
			
		}
		if(count==3)
			System.out.print("YES");
			else
			System.out.print("NO");
    }
	}
	}


