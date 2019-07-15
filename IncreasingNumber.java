package javalab;

public class IncreasingNumber {
	public static boolean Number(int number)
	{
		boolean flag=true;
		int sum = 0,currentdigit,num;
		currentdigit=number%10;
		num=number/10;
		while( num>0)
		{
			if(currentdigit<num%10)
			{
				flag=false;	
			break;
			}
			currentdigit=num%10;
			num=num/10;
		}
		
		if(flag==true)
			System.out.println("in increasing order");
		else
			System.out.println("Not In increasing order");
		return flag;
	}
	public static void main(String args[])
	{
		System.out.println(Number(1234));
		
	}

}
