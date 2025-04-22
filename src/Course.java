
public class Course implements Comparable<Course>
{
	private final String departmentName;
	private final int courseNumber;
	private final int credits;
	
	public Course(String departmentName, int courseNumber, int credits)
	{
		this.departmentName = departmentName;
		this.courseNumber = courseNumber;
		this.credits = credits;
	}
	
	public boolean matchDepartmentName(String majorName)
	{
		return this.departmentName.equals(majorName);
	}
	
	public boolean compareCourseNumber(int requirementNumber)
	{
		return this.courseNumber >= requirementNumber;
	}
	
	public int compareTo(Course course)
	{
		if(this.departmentName.compareToIgnoreCase(course.departmentName) < 0)
		{
			return -1;
		}
		else if(this.departmentName.compareToIgnoreCase(course.departmentName) > 0)
		{
			return 1;
		}
		else
		{
			if(this.courseNumber > course.courseNumber)
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
	}
	
	public CGPcourse makeCGPCourse(String location)	
	{
		CGPcourse makeCGPCourse = new CGPcourse(this.departmentName, this.courseNumber, this.credits, location);
		return makeCGPCourse;
	}
	
	public boolean equals(Object course1)
	{	
		if(course1 == null) 
		{
			return false;
		}
	
		Course secondCourse = (Course) course1;
		return ((this.departmentName.equals(secondCourse.departmentName)) && (this.courseNumber == secondCourse.courseNumber) && (this.credits == secondCourse.credits));
		
	}
	
	
	public String toString()
	{
		return "Course Name: " + departmentName + " " + courseNumber + " Number of credits: " + credits;
	}
}
