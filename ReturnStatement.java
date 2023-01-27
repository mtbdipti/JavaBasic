package controlstatement;

public class ReturnStatement {

	public static void main(String[] args){
		ReturnStatement ob=new ReturnStatement();
		ob.m1();
		//int s=ob.m1();
		//System.out.println(s);
		//int a=ob.m1();
		////System.out.println(a);
		//System.out.println(ob.m1());
		//ob.m2();
		//System.out.println(ob.m2());
		//ob.m3();
		//System.out.println(ob.m3());
	}
 
	/*void m1()
	{
		int no1=10, no2=20;
	}*/
int m1()
{
	
	return 10;
	
}
void m2()
{
	System.out.println("hi");
}
int m3()
{
	System.out.println("hi");
	System.out.println("hello");
	return 10;
	//System.out.println("hello");
}
}
