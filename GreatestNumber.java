package controlstatement;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=10;
     int b=20;
     int c=5;
     int z;
     //Ternary
     z=(a>b)? a : b;
     System.out.println(z + "is the greatest no.");
     //Using &&
     if(a>b && a>c){
    	 System.out.println("the greatest no is a" + a);
    	 }
     else if(b>a && b>c) {
    	 System.out.println("the greatest no is b" + b );
     }
     else {
    	 System.out.println("the greatest no is c" +c );
     }
     //nested if
     if(a>b) {
    	 if(a>c) {
    		 System.out.println("the greatest no is a" + a );
    	 }
    	 else {
    		 System.out.println("the greatest no is c" + c );
    	 }
     }
     else {
    	 if(b>c) {
    		 System.out.println("the greatest no is b" + b );
    	 }
    	 else {
    		 System.out.println("the greatest no is c" + c);
    	 }
     }
}

}
