package src.class_obj;

public class Tut_object_passing {
	public static void main (String[] args)
	{
		point p = new point();
		fun(p);
		System.out.println(p.x+" "+p.y);
	}
public static void fun(point p)
{
	int p.x=10;int p.y=20;
}
}
class point{int x; int y;}