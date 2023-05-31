
public class jaggedArraydemo {

	public static void main(String[] args) {
	
		int nums[][]= 
			{
					{2,4,6,8},
					{1,4},
					{3,5,2},
					
				
		};
		 
		
		
		for(int i=0 ; i<3 ; i++) 
		{
			for(int j=0 ; j<nums[i].length ; j++) 
			{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

}
