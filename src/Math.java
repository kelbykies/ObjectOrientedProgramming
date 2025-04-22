import java.util.List;

public class Math implements Major {

	final String mathMajor;
	
	public Math(String majorCheck)
	{
		mathMajor = majorCheck;
	}
	
	public boolean qualifiesForMajor(List<Course> classSchedule)
	{
		boolean declaration = false;
		int coursesCountQualify = 0;
		final int difficultyLevel = 200;
		final int requiredAmount = 3;
		
		for(Course classBeingCompared : classSchedule)
			if( classBeingCompared.matchDepartmentName(mathMajor))
			{	
				if(classBeingCompared.compareCourseNumber(difficultyLevel))
						{
							coursesCountQualify++;
							if(coursesCountQualify >= requiredAmount)
							{
								declaration = true;
							}
						}
			}	
		
		return declaration;	
	}
	public String toString()
	{
		return mathMajor;
	}
}

