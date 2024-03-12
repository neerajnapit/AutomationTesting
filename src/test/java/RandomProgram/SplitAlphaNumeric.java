package RandomProgram;

public class SplitAlphaNumeric {
	public static StringBuffer splitAlphaNumeric(String str) {
		StringBuffer alpha=new StringBuffer(),
				num=new StringBuffer(),
				special=new StringBuffer();
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			}
				
		   else if(Character.isAlphabetic(str.charAt(i))) {
			   alpha.append(str.charAt(i));
				}
		   else {
			   special.append(str.charAt(i));
		   }
			
		}
//		System.out.println(num);
//		System.out.println(alpha);
//        System.out.println(special);
		return num;
	}
	public static void main(String[] args) {
		StringBuffer num=splitAlphaNumeric("geeks01for02geeks*&^%!34");
		System.out.println(num);
	}

}
