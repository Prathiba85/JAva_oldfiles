package src.class_obj;

import class_obj.protected_access;

public class protected_childclass {
	public static void main(String[] args)
	{
		childp pa = new childp();
		pa.pchild();
		
	}
	

}

class childp extends protected_access
{
	void pchild()
	{
		System.out.println("This is the child protected print");
	}
}
