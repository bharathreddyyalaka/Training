import java.util.Stack;

public class StackImplement implements StackInterface {
	static Stack<Integer> s = new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplement si = new StackImplement();
		System.out.println(si.insert(10));
		System.out.println(s);
		System.out.println(si.delete());
		System.out.println(s);
	}

	@Override
	public String insert(int a) {
		// TODO Auto-generated method stub
		
		s.push(a);
		
		return "Inserted succesfully";
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		s.pop();
		return "deleted succesfully";
	}

}
