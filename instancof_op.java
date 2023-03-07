package src.class_obj;

public class instancof_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person obj1 = new person();
		System.out.println(obj1 instanceof person);
		System.out.println(obj1 instanceof boy);

	}

}
class person
{
	class boy extends person implements MyInterface
	{
		
	}
}
