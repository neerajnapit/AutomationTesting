package RandomProgram;

import java.util.Scanner;

public class ReverseStringUsingSplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		 String str;
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter your String");
	        str = in.nextLine();
	        String[] token = str.split("");    //used split method to print in reverse order
	        //System.out.println(token[1]);
	        for(int i=token.length-1; i>=0; i--)
	        {
	            System.out.print(token[i] + "");
	        }

	}

}
