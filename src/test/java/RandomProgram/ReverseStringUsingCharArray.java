package RandomProgram;

public class ReverseStringUsingCharArray {

	public static void main(String[] args) {
		// Reverse String using char array
		
		 String str = "Saket Saurav";
		 String rev="";
	        char chars[] = str.toCharArray();// converted to character array and printed in reverse order
	        System.out.println(chars[1]);
	        for(int i= chars.length-1;i>=0; i--) {
	        	rev=rev + chars[i];
	            //System.out.print(chars[i]);
	        }
	        System.out.println(rev);

	}

}
