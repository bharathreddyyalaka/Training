import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square();
		Scanner s= new Scanner(System.in); 
		System.out.print("Enter a Number: ");
		//String str= s.nextLine();
		//int a = Integer.parseInt(str);
		int a = s.nextInt();
		//int c= s.nextInt();
		/* -------------Functions--------------------*/
		//int b = sq.cube(a);
		int b = sq.factorial(a);
		//int b = sq.reverse(a);
		//String b = sq.EvenOrOdd(a);
		//String b = sq.Fibonacci(a);
		//String b = sq.Palindrome(str);
		//String b = sq.Prime(a);
		//int[] Ar1 = sq.Swap(a, c);
		//System.out.println(Ar1[0]+" "+Ar1[1]);
		System.out.println(b);
	}
	
	/*------------------	 cube of a number ------------------------*/
	int cube(int x){
		
		return x*x*x;
	}
	/*------------------------ factorial of a number-------------------*/
	int factorial(int x){
		
		int result = 1;
		while(x>0){
			result*=x;
			x= x-1;
		}
		return result;
	}
	/* -----------------reverse the digits -----------------------------*/
	int reverse(int x){
		
		int i = 123;
		int res1 =0;
		int reverse = 0;
		while(i!=0){
			res1 = i%10;
			reverse = reverse*10+ res1;		
			i = i/10;
		}
		return reverse;
	}
	/* ---------------------------------Even or Odd ------------------------------*/
	String EvenOrOdd(int x){
		
		if(x%2 == 0){
			return "Number is Even";
		}
		else{
			return "Number is Odd";
		}
		
	}
	
	/* ---------------- Fibonacci---------------------------*/
	String Fibonacci(int x){
		
		int a= 0,b=1,count=x,c=0;
		String str="0";
		while(count!=0){
			c= a+b;
			str+=","+b;
			a=b;
			b=c;
			count-=1;
		}
		return str;
	}
	/*------------palindrome ----------------------*/
	
	String Palindrome(String x){
		
		String str ="";
		for(int i =x.length()-1;i>=0;i--){
			str+=x.charAt(i);
		}
		System.out.println(str);
		if(x.equalsIgnoreCase(str)){
			return "is Palindrome";
		}
		else{
			return "is not Palindrome";
		}
	}
	
	/*------------------prime or not---------------*/
	
	String Prime(int x){
		
		int cnt=0;
		for(int i=1;i<x;i++){
			if(x%i == 0){
				cnt++;
			}
			else{
				continue;
			}
		}
		if(cnt>1){
			return "Number is not Prime";
		}
		else{
		return "Number is prime";
		}
	}
	
	/* -------------------Swap two numbers------------------*/
	int[] Swap(int x,int y){
		
		int z = x;
		x = y;
		y = z;
		int[] Ar = new int[2];
		Ar[0] = x;
		Ar[1] = y;
		return Ar;
	}
}
