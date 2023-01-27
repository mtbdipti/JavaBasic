package controlstatement;
import java.util.*;

public class CalculatorDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

		int no1, no2;
		String sym, yn;
		do
		{
			System.out.println("Enter 1st No.");
			no1=s.nextInt();		

			System.out.println("Enter 2nd No.");
			no2=s.nextInt();
			
			System.out.println("Enter symbol (+,-,*,/)");
			sym=s.next();	

			switch(sym)
			{
				case "+": System.out.println("Result is : "+(no1+no2));
					  break;
				case "-": System.out.println("Result is : "+(no1-no2));
					  break;
				case "*": System.out.println("Result is : "+(no1*no2));
					  break;
				case "/": System.out.println("Result is : "+(no1/no2));
					  break;
				default: System.out.println("Invalid Symbol");
					 break;
			}

			System.out.println("DO you want to continue (Press y for Yes or n for no)");
			yn=s.next();
			System.out.println("-----------------------------------------");
		}
		while((yn=="y" ||yn=="Y"));
		
	}

}
