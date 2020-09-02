
public class Student {
	
	public static void main(String args[]){
		
		int Student_Id = 1022;
		String Student_name = "Bharath";
		String Standard = "Tenth";
		Student s = new Student();
		float p = s.calculate(80, 82, 83, 95, 82, 89);
		s.display(Student_Id,Student_name,Standard,p);
	}
	
	float calculate(int FLanguage, int SLanguage, int Eng, int Mat, int sci, int soc){
		
		float percentage = (FLanguage+SLanguage+Eng+Mat+sci+soc)/6;
		return percentage;
	}
	
	void display(int id,String name,String std,float percentage){
		
		System.out.println("Student"+" "+name+" "+"with"+" "+id+"ID"+" "+"got"+" "+ percentage+" "+"in"+" "+std);
	}
}
