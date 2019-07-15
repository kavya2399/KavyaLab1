package javalab;

public class NaturalNumbers {
	static int calculateSum(int n)
	{
		int sum3,sum5,sumtotal,total=0,sum=0;
		sum3=((n/3)*(2*3+(n/3-1)*3)/2);
		sum5=((n/5)*(2*5+(n/5-1)*3)/2);
		sumtotal=((n/15)*(2*15+(n/15-1)*15)/2);
		total=sum3 + sum5 - total;
	return total;
	}
public static void main(String args[])
{
	int n=10;
	System.out.println(calculateSum(n));
	  
}
}
