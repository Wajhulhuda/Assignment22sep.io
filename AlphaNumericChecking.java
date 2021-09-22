package september21;

import java.util.Scanner;

public class AlphaNumericChecking {
	
	public static Boolean isAlphaNumeric(String str) {
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			if(!(c>='a' && c<='z') && 
					!(c>='A' && c<='Z') &&
					(!(c>='0' && c<='9'))) {
				return Boolean.FALSE;
			}
		}
		
		return Boolean.TRUE;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string..");
		String str = sc.nextLine();
		System.out.println("IsAlphanumeric : "+ isAlphaNumeric(str));
	}
	
}
