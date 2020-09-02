
public class Bank {
	
public static void main(String args[]){
		
		int Ac_no = 1022;
		int amount = 200000;
		Bank b = new Bank();
		
		b.display(Ac_no,amount);
	}
	
	
	
	void display(int ac_no,int amount){
		
		System.out.println(ac_no+" "+"has"+" "+amount);
	}
}
