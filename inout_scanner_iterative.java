package src.class_obj;
import java.util.*;
public class inout_scanner_iterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   int sum=0;
   while (sc.hasNext())
   {
	   sum = sum+sc.nextInt();
   }
  System.out.println(sum);
	}

}
