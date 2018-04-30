import java.util.ArrayList;

public class Course 
{
	// laukai
	
	public Course (int id, String name)
	{
		// kodas
	}
	
	public Course (String name)
	{
		// kodas
	}
	
	@Override
	public String toString()
	{
		return "Course: "; // kodas
	}

	public static ArrayList<Course> getList ()
	{
		ArrayList<Course> list = new ArrayList<Course>(); 
		// kodas, query 2
		return list;
	}

	public static Course find (String name)
	{
		Course course = null;
		// kodas, query 3
		return course;
	}
}
