package controlstatement;

public class Continuedemo {

	public static void main(String[] args)
	{
		outer:
		for(int i=1; i<=3; i++)
		{
			System.out.println(i);
			inner:
			for(int j=1; j<=3; j++)
			{
				if(j==2)
				{
					continue ;
				}
				System.out.println(j);
			}
		}
	}
}	    		 

