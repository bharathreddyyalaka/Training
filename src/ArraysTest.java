import java.util.Scanner;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square();
		Scanner s= new Scanner(System.in); 
		System.out.print("Enter a Number: ");
		int a = s.nextInt();
		int n[] = {10,12,2,21,13};
		ArraysTest A = new ArraysTest();
		//System.out.println(A.search(a));
		//int m[] = A.SortArray(n);
		//for(int i=0;i<m.length;i++){
		//System.out.print(m[i]+" ");
		//}
		//System.out.println(A.SecondLargest(n));
		
		int m[] = A.ReverseArray(n);
		for(int i=0;i<m.length;i++){
			System.out.print(m[i]+" ");
			}
		
/*--------------------------------------------------------------------------------------------------------------------------------------*/		
	}
	/*------------------------------Searching of element in array----------------------*/
	String search(int x){
		int[] Ar ={10,20,30,40,50};
		
		for(int i=0;i<Ar.length;i++){
			if(x == Ar[i]){
				return "Number is present in Array";
			}
			else{
				continue;
			}
		}
		return "Number is not present in Array";
	}
	
	/*------------------------ Sort in Ascending order ---------------------------*/
	int[] SortArray(int x[]){
		
		int z;
		for(int i=0;i<x.length;i++){
			for(int y =i+1;y<x.length;y++){
				if(x[i] > x[y]){
					z= x[i];
					x[i] = x[y];
					x[y] = z;
				}
			}
		}
		return x;
	}
	
	/*-------------------------second largest element*-------------------------------*/
	int SecondLargest(int x[]){
		
		int z;
		for(int i=0;i<x.length;i++){
			for(int y =i+1;y<x.length;y++){
				if(x[y] > x[i]){
					z= x[i];
					x[i] = x[y];
					x[y] = z;
				}
			}
		}
		return x[1];
	}
	
	/*----------------------------Reverse Array-----------------------------*/
	
	int[] ReverseArray(int x[]){
		
		int y[] = new int[x.length];
		int j = x.length;
		for(int i=0;i<x.length;i++){
			y[j-1] = x[i];
			j=j-1;
		}
		return y;
	}
}
