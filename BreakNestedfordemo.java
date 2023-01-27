package controlstatement;

public class BreakNestedfordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:
			for(int i=1;i<=5;i++) {
	    	 System.out.println(i);//unboxing
	    	 for(int j=1;j<=5;j++){
	    		 //System.out.println(j);	
	    		 if(j==3){
	        		 	
	        		 continue; //outer;//break;
	        	 }
	    		 System.out.println(j);	
	    		 //break;
	    	 }
	    	 	 
	     }

	}

}
