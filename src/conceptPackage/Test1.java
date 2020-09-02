package conceptPackage;

public class Test1 {
	
	
	public static void main(String args[]){
		
		Test1 t = new Test1();
		
	}
	
	
	private int reverse(int a){
		int res1 =0;
		int rev = 0;
		while(a!=0){
			res1 = a%10;
			rev = rev*10+ res1;		
			a = a/10;
		}
		return rev;
		
	}

	private class TestPrivate {
		
		int reverse(int a){
			
			int res1 =0;
			int rev = 0;
			while(a!=0){
				res1 = a%10;
				rev = rev*10+ res1;		
				a = a/10;
			}
			return rev;
		}
		
		
	}

	protected class Test2 {
		public int Subtract(int a,int b){
			
			int c = a-b;
			return c;
		}
	}

	public int Add(int a,int b){
		
		int c = a+b;
		return c;
	}
	
	public int Div(int a,int b){
	
		int c = a+b;
		return c;
	}


}
