import java.util.Scanner;

class Practical4 {
	public static void array2(int... s) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter No. of rows: ");
		int r= sc.nextInt();
		System.out.print("Enter No. of columns: ");
		int c=sc.nextInt();
		
		
		System.out.print(s.length+"\n"); //add
		int[][] b=new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
					b[i][j]=s[];
					System.out.print(b[i][j]+"\n");
			}
		}
		
/*		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(b[i][j]);
			}
		}*/
		
	}
	public static void main(String args[]){
		array2(1,2,3,4,5,6);
	}
}