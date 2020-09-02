
public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e = new Emp();
		e.display();
	}
	
	
	Emp(){
		int emp_id = 795000;
		String name = "Bharath";
		String Dept = "Testing";
		int basic_sal = 18000;
		int HRA = 3000;
		int DA = 2800;
		int tax = 6000;			
	}
	
	Emp(int emp_id, String name, String dept, int basic_sal,int HRA,
			int DA, int tax){
		
	}
	
	int[] calculateSalary(int basic_sal, int HRA, int DA, int tax){
		
		int[] a = new int[2];
		int gross_sal = basic_sal+HRA+DA+tax;
		a[0] = gross_sal;
		int take_home = basic_sal+HRA+DA;
		a[1] = take_home;
		return a;
	}
	
	void display(){
		
		System.out.println("in display");
	}

}
