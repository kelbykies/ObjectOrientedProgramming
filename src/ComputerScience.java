import java.util.List;

public class ComputerScience implements Major
{
	final String cmscMajor;
	
	public ComputerScience(String majorCheck)
	{
		cmscMajor= majorCheck;
	}
	
	public boolean qualifiesForMajor(List<Course> classSchedule)
	{
		boolean declaration = false;
		int coursesCountQualify = 0;
		final int difficultyLevel = 300;
		final int requiredAmountOfClasses = 3;
			
		for(Course classBeingCompared : classSchedule)
		{	
			if(classBeingCompared.matchDepartmentName(cmscMajor))
			{	
				if(classBeingCompared.compareCourseNumber(difficultyLevel))
				{
					coursesCountQualify++;
					if(coursesCountQualify >= requiredAmountOfClasses)
					{
						declaration = true;
					}
				}
				else
				{
					coursesCountQualify++;
				}
			}	
		}
		
		return declaration;
	}
	
		public String toString()
		{
			return cmscMajor;
		}
}
