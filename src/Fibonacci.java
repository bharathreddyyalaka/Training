
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 0,b=1,count=10,c=0,d;
		System.out.print(a);
		while(count!=0){
			c= a+b;
			System.out.print(","+b);
			a=b;
			b=c;
			count-=1;
			
		}
		
	}

}
