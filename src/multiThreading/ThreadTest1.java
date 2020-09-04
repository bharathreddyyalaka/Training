package multiThreading;

public class ThreadTest1 extends Thread {
	
	Thread t1;
	ThreadTest1(){
		t1 = new Thread(this,"child Thread");
		System.out.println("in Child Thread");
		t1.start();
	}
	public void run(){
		try{
			for(int i=5; i<50; i+=5){
				System.out.println( "Five table"+"-"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadTest1 t1 = new ThreadTest1();
		
		try{
			for(int i=0; i<40; i+=2){
				System.out.println("Even Numbers"+"-" + i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	

}
