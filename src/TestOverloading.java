
public class TestOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOverloading t = new TestOverloading();
		System.out.println(t.toPrint(3));
		System.out.println(t.toPrint(12.12));
		System.out.println(t.toPrint("Hello World"));
	}
	int toPrint(int a){
		
		return a*a*a;
	}
	
	double toPrint(double a){
		
		return a*a;
	}
	
	String toPrint(String a){
		
		return a;
	}

}
