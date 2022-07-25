package matrix;

public class mulitipilication {
	public static void main(String[] args) {
		int a[][] = {{2,1,3},{2,2,3},{1,2,3}};
		int b[][] = {{2,2,2},{1,2,3},{2,1,2}};
		int[][] c = new int[3][3];
		int i,j,k;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j] = 0;
				for(k=0;k<3;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
				}
}
