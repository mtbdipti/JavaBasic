package interviewcodingquestion;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//what is Fibonacci series
		/*two number will be given then we will generate no. in series whichll wiil be the sum of two no preceding the no to be found*/
		/*logic1:for  loop,swapping no using third variable,statement placement*/
		int no1=0;
		int no2=1;
		int c;
		System.out.print(no1+","+no2);
		for(int i=3;i<=13;i++) {
			c=no1+no2;
			no1=no2;
			no2=c;
			System.out.print(","+c);
			
		}

	}

}
