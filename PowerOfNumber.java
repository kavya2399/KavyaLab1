package javalab;

public class PowerOfNumber {
	public static boolean checkNumber(int number)
	{
	if(number%2!=0)
	return false;
	else
	{
		for(int i=0;i<number;i++)
		{
			if(number%2==0)
				return true;
		}
	}
	return false;
	}
	public static void main(String args[])
	{
System.out.println(checkNumber(15));

	}
}