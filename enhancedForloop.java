
public class enhancedForloop 
{

	public static void main(String[] args) 
	{
		
		int nums[][]= 
			{
				{2,4,6,8,4,5,3},
				{1,4,7,9},
				{9,6,3,1,3},
		    };
		for (int a[]: nums) 
		{
			for(int b : a) 
			{
				System.out.print( b+ " ");
			}
			System.out.println(" ");
		}

	}
}
