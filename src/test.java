
public class test {
	public static int computeChildExemption(int numberOfChildren)
	{
		if (numberOfChildren == 0) return 1000;
		else if (numberOfChildren == 1) return 4000;
		else if (numberOfChildren == 2) return 6000;
		else if (numberOfChildren == 3) return 7000;
		else if (numberOfChildren == 4) return 8000;
		else if (numberOfChildren == 5) return 9000;
		else if (numberOfChildren == 6) return 9500;
		else return 10000;
	}
	 
}
