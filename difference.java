package javalab;

public class difference {
public int calculateDifference(int n)
{
	int i=n*(n+1)*((2*n)+1)/6;
	int j=n*(n+1)/2;
	int k=j*j;
	int diff=k-i;
	return diff;
	
}
public static void main(String args[])
{
	difference c=new difference();
	int var=c.calculateDifference(10);
	System.out.println("difference is "+var);
	
}
}
