package mars;

import java.util.ArrayList;
import java.util.Scanner;

public class MarsMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarsMessage m=new MarsMessage();
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		
		m.marsMessage(input);
		
		
		
		
	}

	private void marsMessage(String input) {
		int count=0;
		for (int i = 0; i < input.length(); i++) {
			
			for (int j = 0; j < 3; j++) {
				
				if(input.charAt(j)!='S') {
					count++;
					j++;
				}
					
				if(input.charAt(j)!='O')
					count++;
					j++;
				}
				if(input.charAt(j)!='S')
				{
					count++;
					j++;
				}
				
		}
		System.out.println(count);
		
	}

}
