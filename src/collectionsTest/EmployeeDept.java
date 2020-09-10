package collectionsTest;

public class EmployeeDept implements Comparable<EmployeeDept> {
	
	
	EmployeeDept(int id, String name, String dept, String designation){
		System.out.println("In EmployeeDept constructor");
		this.id = id; 
		this.name = name; 
		this.dept = dept; 
		this.designation=designation;
	}
	
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
		private int id;
		private String name;
		private String dept;
		private String designation;
		
		public int hashCode()
		{
			
			int hCode = 0;
			hCode = id*10 + name.hashCode();
			System.out.println("Hash code is "+hCode);
			return hCode;
		}
		
		public boolean equals (Object obj)
		{
			boolean returnData=false;
			if (obj instanceof EmployeeDept)
			{
				EmployeeDept emp = (EmployeeDept)obj;
				if (this.id == emp.id)
					returnData=  true;			
			}
			System.out.println("In Equals"+returnData);
			return returnData;
		}
		

		@Override
		public int compareTo(EmployeeDept o) {
			if(id == o.id){  
				return 0;  
			}
			else if(id > o.id)  {
				return 1;  
			}
			else  {
				return -1;  
				}  
			}  
		
}
