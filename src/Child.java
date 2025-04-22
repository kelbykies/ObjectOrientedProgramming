
public class Child extends Parent
{
	int sameName;
	
	public void assignNumber()
	{
		sameName = 597;
		super.sameName = "Bye";
		System.out.print("Child 1 " + sameName + "\nChild 2 " + super.sameName);
	}
}
