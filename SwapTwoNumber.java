package controlstatement;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a=70;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);//without using third variable
		
		int x=20;
		int y=30;
		int z=0;
		z=y;
		y=x;
		x=z;
		System.out.println(x);
		System.out.println(y);//using third variable
		

	}

}
