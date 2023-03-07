package class_obj;

public class multi_obj_sameclass {
	public static void main(String[] args)
	{
		mobject c1=new mobject(10,20);
		c1.print();
		mobject c2=new mobject(100,200);
		c1.add(c2);
		
	}
	

}

class mobject {
	int real;
	int imaginary;
	mobject(int r, int s)
	{
		real =r;
		imaginary=20;
	}
	void print()
	{
		System.out.print("Value of r in C1 :"+real);
		System.out.println("Value of s in C1 :"+imaginary);
	}
	void add(mobject c2)
	{
		System.out.print(real+"Value of r in object 2 is "+c2.real);
		System.out.print(real+"Value of i in object 2 is "+c2.imaginary);
	}
}