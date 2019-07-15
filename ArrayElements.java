package javalab;

public class ArrayElements {
public static int getSecondSmallest(int a[],int total)
{
	int temp;
	for(int i=0;i<total;i++)
	{
		for(int j=0+i;j<total;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	return a[1];
}
public static void main(String args[])
{
	int a[]={1,4,9,6,8,8};
	System.out.println("Second Largest Element"+ getSecondSmallest(a,6));
	
}
}
