package class_obj;

public class stringoverride {
	public static void main(String[] args)
	{
		dog bence = new dog("Bence", "German shepard", 12);
		System.out.print(bence.toString());
	}

}

 class dog{
	String name;
	String breed;
	int age;
	
	 dog(String name,String breed,int age)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public String getname()
	{
		return name;
	}
	public String getbreed()
	{
	return breed;
	}
	public int get_age()
	{
		
		return this.age;
			}
	public String toString (String name,String breed,int age)
	{
		return ("The name is "+this.getname()+" and breed is "+this.getbreed()+" and the age is "+this.age);
	}
	
}