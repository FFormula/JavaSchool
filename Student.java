import java.util.ArrayList;

public class Student 
{
	// laukai
	
	public Student (int id, String name)
	{
		// kodas
	}
	
	public Student (String name)
	{
		// kodas
	}
	
	@Override
	public String toString()
	{
		return "Student: "; // kodas
	}	

	public void add ()
	{
		// kodas, query 4
	}
	
	public static ArrayList<Student> getList ()
	{
		ArrayList<Student> list = new ArrayList<Student>(); 
		// kodas, query 5
		return list;
	}	
	
	public static Student find (String name)
	{
		Student student = null;
		// kodas, query 6
		return student;		
	}	
}
