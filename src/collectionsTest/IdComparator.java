package collectionsTest;

import java.util.Comparator;

class IdComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;		
		
		if(e1.getId() > e2.getId()){  
			return 1;  
		}
		else if(e1.getId() < e2.getId())  {
			return -1;  
		}
		else  {
			return 0;  
			}  
		
		//return ((e1.getId() >e2.getId())?1:((e1.getId()<e2.getId())?-1:0));
	}
	
}

class NameComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;		
		
		if(e1.getId() > e2.getId()){  
			return 1;  
		}
		else if(e1.getId() < e2.getId())  {
			return -1;  
		}
		else  {
			return 0;  
			} 
		
		//return (e1.getName().compareTo(e2.getName()));
	}
	
}

class DeptComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;		
		
		return (e1.getDept().compareTo(e2.getDept()));
	}
	
}