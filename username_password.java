package src.class_obj;

import java.util.Scanner;

public class username_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "prathiba";
		String password = "vimal";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user name :");
		String name = sc.next();
		System.out.print("Enter password :");
		String pass = sc.next();
		
		if ((username .equals(name))&&(password.equals(pass)))
		{
			System.out.println ("Welcome");
			
		}
		else 
		{
			System.out.println("Try next time ");
		}
		

	}

}
