
public class TestArraysTwoDimesional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{4,4},{4,4}};
		int b[][] = {{2,2},{2,2}};
		int c[][] = new int[2][2];
		
		for(int i =0;i<2;i++){
			for(int j=0;j<2;j++){
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		int sum =0;
		for(int i =0;i<2;i++){
			for(int j=0;j<2;j++){
			sum+=a[i][j];	
				
			}
		}	
		System.out.println(sum);
	}

}
