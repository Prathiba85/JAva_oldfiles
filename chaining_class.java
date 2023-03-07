package class_obj;

public class chaining_class {
	public static void main(String args[])
	{
		point p1=new point(10,20);
		p1.setx();
		p1.sety();
	}

}
class point
{
	int x;
	int y;
	point(int x, int y)
	{
		this.x =x;
		this.y=y;
	}
	point setx()
	{
		this.x=x;
		System.out.print(this.x);
		return this;
	}
	point sety()
	{
		this.y=x;
		System.out.print(this.y);
		return this;
	}
}
