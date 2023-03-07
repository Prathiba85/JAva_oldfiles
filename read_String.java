package src.class_obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class read_String {
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter integer");
		int s = Integer.parseInt(br.readLine());
		System.out.println(s);
		
		System.out.println("Enter the string");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String f = br1.readLine();
		System.out.println(f);
		
		System.out.println("Enter the string");
		Scanner sc1 = new Scanner(System.in);
		String k = sc1.nextLine();
		System.out.println(k);
		
	}

}
