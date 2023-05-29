
public class ternaryDemo2 {

	public static void main(String[] args)
	{
		int a=20;
		int b=30;
		int c=10;
		
		int reasult= (c>a)? (c>b? a:b): (b>a? a+c:b-a);
		System.out.println(reasult);
		

	}

}
