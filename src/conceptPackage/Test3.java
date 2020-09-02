package conceptPackage;

class Test3 extends Test1 {
	
	int Fact(int a){
		
		int result = 1;
		while(a>0){
			result*=a;
			a= a-1;
		}
		
		return result;
	}
	
public static void main(String args[]){
		
		Test3 t1 = new Test3();
		
	}
	
}
