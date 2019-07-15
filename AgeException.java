package javalab;


public class AgeException extends Exception {


public static void main(String args[])throws Exception
{
int age=17;
	try
	{
		if(age>15)
		
		System.out.println("valid age");
		
		else 
		
			System.out.println("Invalid age");
	throw new AgeException();
	}
	catch(AgeException ae)
	{
	 System.out.println(ae);
	 
	}
		
	
 
}
}

