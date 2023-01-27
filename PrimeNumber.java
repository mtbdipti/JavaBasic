package interviewcodingquestion;
//import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to find where one no is prime or not
   /*Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no. to check");
   int no=sc.nextInt();
   int rem;
   for(int i=2;i<no;i++) {
	   rem=no%i;
	   if(rem==0) {
		   System.out.println("this is not a prime no.");
		   break;
	   }
	   else {
		   System.out.println("this is  a prime no.");
		   break;
	   }
   }*/
		int sum=0;
		for(int no=2; no<=1000; no++)
		{
			boolean b=false;
			

			for(int i=2; i<no; i++)	
			{
				if(no%i==0)
				{
					b=true;
				}
			}
			if(b==false)
			{
				System.out.println(no);
				sum=no+sum;
				
			}
			
		}
		System.out.println("The sum of all prime no is" + sum);
	}

	}
	
