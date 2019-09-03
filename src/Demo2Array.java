
public class Demo2Array {

	public static void main(String[] args) {
		/*int marr[][]=new int[3][4];
		int x=1;
		for(int i=0;i<marr.length;i++)
		{
			for(int j=0;j<marr[i].length;j++)
			{
				marr[i][j]=x;
				x++;
			}
		}
		for(int i=0;i<marr.length;i++)
		{
			for(int j=0;j<marr[i].length;j++)
			{
				System.out.print(marr[i][j]+" ");

			}
			System.out.println();
		}
		*/
	/*	int mat[][] = {       
                {1, 2, 3},    
                {4, 5, 6},    
                {7, 8, 9}    
            };    
		*/
		
		
	int mat[][]=new int [2][3];
		int x=4;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=x;
			    x++;
			}
		}
		
		int sumRow;
	       for(int i = 0; i < mat.length; i++)
	       {    
	            sumRow = 0;    
	            for(int j = 0; j < mat[i].length; j++)
	            {    
	                sumRow = sumRow + mat[i][j];    
	            }    
	            System.out.println("Sum of " + (i+1) +" row: " + sumRow);
	            
	        }
		  
		   for(int i = 0; i < mat[i].length; i++)
		   {    
	            int sumCol = 0;    
	            for(int j = 0; j <mat.length; j++)
	            {    
	              sumCol = sumCol + mat[j][i];    
	            }    
	            System.out.println("Sum of " + (i+1) +" column: " + sumCol);      
		  }
		
	}

}


