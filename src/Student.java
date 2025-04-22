import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Student {
	
	private final String studentName;
	private final int studentID;
	private List<Course> classSchedule;
	private final Major studentsMajor;
	private static int count = 1;
	
	public Student(String studentName, Major studentsMajor)
	{
		this.studentName = studentName;
		this.studentID = count;
		this.classSchedule = new LinkedList <>();
		count++;
		this.studentsMajor = studentsMajor;
	}
	
	/*public boolean precedesByID(Student newStudent)
	{
		this.idNumber < newStudent.idNumber;
	}*/
	
	public void addCourse(Course courseInfo)
	{
		final int classSize = 20;
		if(classSchedule.size() < classSize)
		{
			if(!classSchedule.contains(courseInfo))
			{
				this.classSchedule.add(courseInfo);	
			}
		}
	}
	
	public void dropCourse(Course courseInfo)
	{
		classSchedule.remove(courseInfo);
	}
	
	
	public String toString()
	{
		String stringCourse = "";
		String courseSchedule = "";
		boolean sorted = false;
		if(sorted == true)
		{
			sorted = true;
		}
		else
		{
			Collections.sort(classSchedule);
		}
	
		for (Course course : classSchedule)
		{
			stringCourse = course.toString();
			courseSchedule += stringCourse + "\n";
		}
		
		return "Student name: " + this.studentName + "\nId Number is: " + this.studentID +
					"\n" + courseSchedule + "\n" + "This student qualifies for the " +  this.studentsMajor + " major: " + studentsMajor.qualifiesForMajor(classSchedule);
	}
	
}
