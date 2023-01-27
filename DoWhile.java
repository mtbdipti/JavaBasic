package controlstatement;
import java.util.*;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String c;
		int a,b;
		String x;
		do{
			System.out.println("Please enter first no.:");
			a=sc.nextInt();
			System.out.println("Please enter Second no.:");
			b=sc.nextInt();
			System.out.println("Please enter Operator:");
			x=sc.next();
			switch(x) {
			case "+": System.out.println(a+b);
			break;
			case"-":System.out.println(a-b);
			break;
			case"/":System.out.println(a/b);
			break;
			case"*":System.out.println(a*b);
			break;
			}
			System.out.println("Please enter Yes for Continue and  No for discontinue");
			c=sc.next();
			}while(c=="Yes");
		}

}
