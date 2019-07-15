package javalab;

public class PowerNumber {
public static boolean checkNumber(int n) 
    { 
	int sum = 0,value;
    boolean flag = false;
        if (n == 0) 
           flag=true;
               //false
        while (n != 1) 
        { 
            if (n % 2 != 0) 
            n = n / 2; 
        } 
       value=2;
       //true
       if(flag==true)
    	   System.out.println("power of two");
       else
    	   System.out.println("not a power of two");
return flag;
}
public static void main(String args[])
{
	int n=8;
	System.out.println(checkNumber(n));
}
}
