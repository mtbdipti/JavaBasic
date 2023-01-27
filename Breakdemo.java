package controlstatement;

public class Breakdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(int i=1;i<=5;i++) {
    	 System.out.println(i+"character equivalent is"+(char)i);//unboxing
    	 if(i==3){
    		 System.out.println("i in second layered nested loop");	
    	 }
    	 //System.out.println(i+"character equivalent is"+(char)i);
    	 //System.out.println("i am out of if");	 
     }
     System.out.println("break is executed");
	}

}
