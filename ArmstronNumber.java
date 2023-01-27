package interviewcodingquestion;
import java.util.*;

public class ArmstronNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no.");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int x=no;
		int digit=0;
		while(x!=0) {
			x=x/10;
			digit=digit+1;
		}
		int y=no;
		int mul=1;
		int rem;
		int sum=0;
		while(y!=0) {
			rem=y%10;
			y=y/10;
			for(int i=1;i<=digit;i++) {
				mul=mul*rem;
				}
			sum=sum+mul;
			
		}
		if(sum==no) {
			System.out.println("This is a armstrong no");
		}
		else {
			System.out.println("This is not a armstrong no");
		}

	}

}
