package interviewcodingquestion;
import java.util.*;

public class FactorialUsingRecursion {
	static int factorial=1;
	int factorial(int no) {
		if(no>=1) {
			
			factorial=factorial*no;
			no=no-1;
			factorial(no);
		}
		
		return factorial;
		}
	/*ivoid factorial(int no) {
		if(no>=1) {
			
			factorial=factorial*no;
			no=no-1;
			factorial(no);
		}
		}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. for which you want to find factorial");
		int no=sc.nextInt();
		FactorialUsingRecursion ob=new FactorialUsingRecursion();
		int c=ob.factorial(no);
		System.out.println("The factorial of the no is" +c);
		//System.out.println("The factorial of the no is" +factorial);
	}

}
