
public class EmpModel {

	private int emp_id;
	private String name ;
	private String Dept;
	private int basic_sal;
	private int HRA;
	private int DA;
	private int tax ;
	
	public EmpModel(int emp_id, String name, String dept, int basic_sal, int hRA, int dA, int tax) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		Dept = dept;
		this.basic_sal = basic_sal;
		HRA = hRA;
		DA = dA;
		this.tax = tax;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public int getBasic_sal() {
		return basic_sal;
	}

	public void setBasic_sal(int basic_sal) {
		this.basic_sal = basic_sal;
	}

	public int getHRA() {
		return HRA;
	}

	public void setHRA(int hRA) {
		HRA = hRA;
	}

	public int getDA() {
		return DA;
	}

	public void setDA(int dA) {
		DA = dA;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	
}
