import java.io.IOException;

public class TestThrow {

	public static void main(String[] args)    {
		// TODO Auto-generated method stub
		TestThrow t = new TestThrow();
		
		try{
			System.out.println(t.div(10, 0));
		}
		catch(Exception e){
			System.out.println(e);
		}
		//System.out.println(t.div(10, 0));
	}
	
	int div(int a,int b) throws InvalidNumberException {
		
		int c;
		if(b == 0){
			throw new InvalidNumberException("b should not be equal to zero");
			
		}
		else{
			c = a/b; 
		}
		return c;
	}
}
