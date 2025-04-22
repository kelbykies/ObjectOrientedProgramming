public class CGPcourse extends Course
{
	private final String location;
	
	public CGPcourse(String departmentName, int courseNumber, int credits, String location) 
	{
		super(departmentName, courseNumber, credits);
		this.location = location;	
	}

	public String toString()
	{
	   return super.toString() + " CGP course: located at " + this.location;
	}
}

