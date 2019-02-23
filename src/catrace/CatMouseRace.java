package catrace;

import java.util.Scanner;

public class CatMouseRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		String[] input=scanner.nextLine().split(" ");
		int x=Integer.parseInt(input[0]);
		int y=Integer.parseInt(input[1]);
		int z=Integer.parseInt(input[2]);
		
		CatMouseRace c=new CatMouseRace();
		c.catMouseRace(x,y,z);
		
			
	}

	private void catMouseRace(int x, int y, int z) {
		
		int d1=Math.abs(x-z);
		int d2=Math.abs(y-z);
		if(d1==d2)
		{
			System.out.println("Mouse C");
			
		}
		else if(d1<d2)
		{
			System.out.println("Cat A");
		}
		else
		{
			System.out.println("Cat B");
		}
	}

}
