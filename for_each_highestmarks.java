package src.class_obj;

public class for_each_highestmarks {
	public static void main(String[] args)
	{
		int [] marks = {70,80,100,90};
		int highest_marks = maxmarks(marks);
		System.out.println("Maximum_marks"+highest_marks);
	}

	public static int maxmarks(int[] marks) {
		// TODO Auto-generated method stub
		int max_sofar=marks[0];
		for(int mark:marks)
		{
			if (mark>max_sofar)
			{
				max_sofar=mark;
			}
		}
		return max_sofar;
	}

}
