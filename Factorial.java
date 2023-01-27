package interviewcodingquestion;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//calculate facrorial using for
		
		Scanner sc=new Scanner(System.in);
		//decending order
		/*System.out.println("Enter the number for which you want to find factorial");
		int factorial=sc.nextInt();
		int i=factorial-1;
		for(;i>0;i--) {
			
			factorial=factorial*i;
		}
		System.out.println("the factorial of the given number is "+ factorial);*/
		//ascending order
		System.out.println("enter no for the factorial");
		int no=sc.nextInt();
		int result=1;
		for(int j=1;j<=no;j++) {
			result=result*j;
			
		}
		System.out.println("the factorial of the given number is "+ result);
		
		

	}

}
