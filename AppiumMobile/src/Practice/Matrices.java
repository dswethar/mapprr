package Practice;

public class Matrices {

	public static void main(String[] args) 
	{
		//transpose of matrix
		int r1=2,c1=3;
		int r2=3,c2=2;
		int[][] matrix1= {{2,5,6},{4,7,8}};
		int[][] matrix2= {{4,8},{9,3},{6,7}};
		int[][] product=multiplyMatrix(matrix1,matrix2,r1,c1,c2);
		display(product);	
	}
	public static int[][] multiplyMatrix(int matrix1[][],int matrix2[][],int r1,int c1,int c2)
	{
		int[][] product=new int[r1][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				for(int k=0;j<c2;j++)
				{
				
				product[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		return product;
	}
	public static void display(int[][] matrix)
	{
		System.out.println("The matrix is: ");
		for (int[] row:matrix)
		{
			for(int column:row)
			{
				System.out.print(" "+column);
			}
			System.out.println();
		}
	}

}
