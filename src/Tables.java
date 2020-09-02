import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in); 
		System.out.print("Enter a Number: ");
		String str= s.nextLine();
		int a = Integer.parseInt(str);
		for(int i=1;i<=10;i++){
			System.out.println(a*i);
		}
		
		/*sum of digits */
		int sum =0,res;
		
		while(a!=0){
			res = a%10;
			sum+=res;
			a= a/10;
		}
		System.out.println(sum);
		
		
		/* Reverse the digits*/
		int i = 123;
		int res1 =0;
		int reverse = 0;
		while(i!=0){
			res1 = i%10;
			reverse = reverse*10+ res1;		
			i = i/10;
		}
		System.out.println(reverse);
	}

}
