import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner s= new Scanner(System.in); 
		System.out.print("Enter a Number: ");
		String str= s.nextLine();
		int a = Integer.parseInt(str);
		String st = "";
		String st1 = "";
		while(count<20){
			if(a%2 == 0){
				st+= Integer.toString(a)+' ';
			
			}
			else{
				st1+= Integer.toString(a)+' ';
				
			}
			count++;
			a= a+1;
		}
		System.out.println("10 Even numbers"+' '+ st);
		System.out.println("10 Odd numbers"+ ' '+st1);
	}

}
