package collectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator_collections_test {

	public static void main(String[] args) {
		Employee emp1 = new Employee (1, "Charan", "R&D");
		Employee emp2 = new Employee (3, "Rajesh", "BBMP");
		Employee emp3 = new Employee (2, "Latha", "Testing");
		Employee emp4 = new Employee (21, "Aswath", "Testing");
		Employee emp5 = new Employee (12, "Priyanka", "Artist");
		Employee emp6 = new Employee (16, "Aloka", "Engineer");
		
		List <Employee> empLst = new ArrayList <Employee>();
		empLst.add(emp1);
		empLst.add(emp2);
		empLst.add(emp3);		
		empLst.add(emp4);
		empLst.add(emp5);
		empLst.add(emp6);
		
		System.out.println("Before sorting..");
		
		for (int i = 0; i < empLst.size(); ++i)
		{
			Employee emp = (Employee)empLst.get(i);
			System.out.println("Id: "+emp.getId() + "    Name: "+emp.getName() + "    Dept :"+emp.getDept());
		}
	
		
		//remote the uncommenting portion from Employee class..
		//Collections.sort(empLst);
		System.out.println("\n sorting on ID..");
		Collections.sort(empLst, new IdComparator());
		
		for (int i = 0; i < empLst.size(); ++i)
		{
			Employee emp = (Employee)empLst.get(i);
			System.out.println("Id: "+emp.getId() + "    Name: "+emp.getName() + "    Dept :"+emp.getDept());
		}
		
		
		System.out.println("\n sorting on Name..");
		Collections.sort(empLst, new NameComparator());
		
		for (int i = 0; i < empLst.size(); ++i)
		{
			Employee emp = (Employee)empLst.get(i);
			System.out.println("Id: "+emp.getId() + "    Name: "+emp.getName() + "    Dept :"+emp.getDept());
		}
		
	
		
		System.out.println("\n sorting on Dept..");
		Collections.sort(empLst, new DeptComparator());
		
		for (int i = 0; i < empLst.size(); ++i)
		{
			Employee emp = (Employee)empLst.get(i);
			System.out.println("Id: "+emp.getId() + "    Name: "+emp.getName() + "    Dept :"+emp.getDept());
		}

	}
}
