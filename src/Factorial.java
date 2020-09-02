import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in); 
		System.out.print("Enter a Number: ");
		String str= s.nextLine();
		int a = Integer.parseInt(str);
		int result = 1;
		while(a>0){
			result*=a;
			a= a-1;
		}
		System.out.println(result);
	}

}
