package september21;

import java.util.Scanner;

public class UpperCaseString {
	
	public static void UpperCase(String str) {
		String str1= str.toUpperCase();
		System.out.println(str1);
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string..");
		String str = sc.nextLine();
		sc.close();
		
		UpperCase(str);
	}

}
