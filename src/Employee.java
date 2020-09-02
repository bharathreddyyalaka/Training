
public class Employee {
	
   public static void main(String args[]){
	   
	   Employee e = new Employee();
	   e.takeInputs(18000, 5000, 2000, 2500);
   }
   
   int calculate(int basic_sal, int HRA, int DA, int tax){
	   
	   int gross_sal = basic_sal+HRA+DA+tax;
	   return gross_sal;
   }
   
   void takeInputs(int basic_sal, int HRA,int DA, int tax){
	   Employee e = new Employee();
	   int gross = e.calculate(basic_sal, HRA, DA, tax);
	   e.display(gross);
   }
   
   void display(int gross){
	   System.out.println("Gross Salary is"+" "+ gross);
   }
}
