package interviewcodingquestion;
import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please eneter no.");
		Scanner sc=new Scanner(System.in);
		int c=121;
		int t=c;
		int rev = 0;
		int rem;
		while(t!=0) {
			
			rem=t%10;
			rev=rev*10+rem;
			t=t/10;
			
		}
		
		System.out.println(rev);
		if (c==rev) {
			System.out.println("This is a palindrome number");
		}
		else {
			System.out.println("This is not a palindrome number");	
		}

	}

}
