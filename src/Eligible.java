import java.util.Scanner;

public class Eligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in); 
		System.out.print("Enter your age: ");
		String str= s.nextLine();
		int a = Integer.parseInt(str);
		if(a<18){
			System.out.println("Not eligible to vote");
			
		}
		else{
			System.out.println("Eligible to vote");
		}
	}

}
