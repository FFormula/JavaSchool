import java.util.ArrayList;

public class Point 
{
	// laukai
	
	public Point (int id, int course_id, int student_id, int value)
	{
		// kodas
	}
	
	public Point (int course_id, int student_id, int value)
	{
		// kodas
	}

	public void add ()
	{
		// kodas, query 7c
	}
	
	public static ArrayList<Point> getList (int course_id, int student_id)
	{
		ArrayList<Point> list = new ArrayList<Point>(); 
		// kodas, query 8
		return list;		
	}

	public static float getAverage (int course_id)
	{
		float avg = 0.0f; 
		// kodas, query 9
		return avg;		
	}
}
