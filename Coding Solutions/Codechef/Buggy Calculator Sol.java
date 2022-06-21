/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt(); //T is the no. of test cases
		for(int j= 1;j<=T;j++)
		{
		    int n1= sc.nextInt();
    		int n2= sc.nextInt();
    		int power= 0;
    		int sum= 0;
    		int i=1;
    		while(n1>0 || n2>0)
    		{
    		    power= (int) Math.pow(10,i-1);
    		    if((n1%10)+(n2%10)<10)
    		    sum= ((n1%10)+(n2%10))*power + sum;
    		    else
    		    sum= (((n1%10)+(n2%10))%10)*power + sum;
    		    n1=n1/10;
    		    n2=n2/10;
    		    i++;
    		}
    		System.out.println(sum);
    	}
        sc.close();
	}
}
