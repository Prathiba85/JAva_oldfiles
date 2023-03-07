package class_obj;

public class invoke_constuctors {
	public static void main(String[] args)
	{
		test object =new test();
	}

}
class test
{
	int a;
	int b;
	test()
	{
		this(10,20);
	}
	public test(int a, int b) {
		// TODO Auto-generated constructor stub
		System.out.println("Inside parameterised constructor"+this.a+" "+this.b);
	}
}