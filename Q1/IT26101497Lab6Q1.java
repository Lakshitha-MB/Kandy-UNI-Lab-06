import java.util.Scanner;
class IT26101497Lab6Q1
{
	public static void main(String args[])
	{
		double number;
		number=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		number=input.nextDouble();
		if(number>0)
			
			{
				double sqr=number*number;
				System.out.println("the square of"+number+"is:"+sqr);
				double root=Math.sqrt(number);
				System.out.println("the square root of"+number+"is:"+root);
			}
	}
}
