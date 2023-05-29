
public class ifElseDemo {

	public static void main(String[] args) {
		
		int age=776;
		
		if(age>=18 && age<60)
		{
			System.out.println("you are adult.");
		}
		else if(age<12 && age>2)
		{
			System.out.println("you are a kid.");
		}
		else if(age>60 && age<100)
		{
			System.out.println("you are an old man");
			
		}
		else if (age>12 && age<18)
		{
			System.out.println("you are a teenager.");
		}
		else
		{
			System.out.println("No data found.");
		}
			
	}

}
