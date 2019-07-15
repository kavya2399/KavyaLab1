package javalab;

public class CubeOfANumber 
{
	static int sum;
	public void sum(int num)
	{
		
		for(int i=1;i<=num;i++)
		{
			sum=sum+(i*i*i);
		}
	}
	public static void main(String args[])
	{
		CubeOfANumber s=new CubeOfANumber();
		s.sum(5);
		System.out.println(sum);
	}
	

}
