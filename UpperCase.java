package javalab;

import java.util.Arrays;

public class UpperCase {
int num;
	public void arrange(String arr[])
	{
			if(arr.length%2==0)
			{
				 num=arr.length/2;
				 for(int i = 0; i <=num; i++){
		    arr[i] = arr[i].toUpperCase();
		}
		}
			else
			{
			num=arr.length/2+1;
			for(int i=0;i<=num;i++)
			{
				arr[i]=arr[i].toUpperCase();
			}
			}
 
Arrays.sort(arr); 

System.out.println("Modified arr[] :"+
                  Arrays.toString(arr)); 
System.out.println(arr.length);

	}
	public static void main(String args[])
	{
		UpperCase up=new UpperCase();
		String arr[] = {"kavya", "aany","madhu","prisha","prinku","sound" ,"kkk","www","ggg","yyy"}; 
		up.arrange(arr);
		
		
	}
}
