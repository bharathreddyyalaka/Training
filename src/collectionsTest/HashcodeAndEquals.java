package collectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashcodeAndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDept e = new EmployeeDept(1, "Bharath", "DNADE", "Systems Engineer");
		EmployeeDept e1 = new EmployeeDept(2, "manoj", "Oracle", "Assc Trainee");
		EmployeeDept e2 = new EmployeeDept(3, "white", "Visa", "Technology Lead");
		EmployeeDept e4 = new EmployeeDept(1, "Bharath", "DNADE", "Systems Engineer");
		System.out.println(e.getDept());
		
		HashSet<EmployeeDept> hsObj = new HashSet <EmployeeDept>();
		hsObj.add(e);
		hsObj.add(e1);
		hsObj.add(e2);
		hsObj.add(e4);
		
		
		for(EmployeeDept ed : hsObj){
			System.out.println(ed.getId());
		}
		
		ArrayList<EmployeeDept> al=new ArrayList<EmployeeDept>();  
		al.add(new EmployeeDept(1,"Vijay","sna","Systems Engineer"));  
		al.add(new EmployeeDept(3,"Ajay","sna","Assc Trainee"));  
		al.add(new EmployeeDept(2,"Jai","sna", "Technology Lead"));  
		
		//Collections.sort(hsObj);
		
		for(EmployeeDept ed : al){
			System.out.println(ed.getId()+" "+ed.getDept()+" "+ed.getName());
		}
	}

}
