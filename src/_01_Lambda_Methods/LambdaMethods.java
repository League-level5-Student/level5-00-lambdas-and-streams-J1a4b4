package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
		//Done.
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		SpecialPrinter backwards = (s) -> {
			String s1 = "";
			for (int i = 0; i < s.length(); i++) {
				s1 += s.charAt(i);
			}
			s = "";
			for (int i = s1.length() - 1; i >= 0; i--) {
				s += s1.charAt(i);
			}
		};
		printCustomMessage(backwards, "String");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		SpecialPrinter mixCase = (s) -> {
			String s1 = "";
			for (int i = 0; i < s.length(); i++) {
				s1 += s.charAt(i);
			}
			s = "";
			for (int i = 0; i < s1.length(); i++) {
				if (i % 2 == 0) {
					s += s1.substring(i, i + 1).toLowerCase();
				}else if (i % 2 == 1) {
					s += s1.substring(i, i + 1).toUpperCase();
				}
			}
		};
		printCustomMessage(mixCase, "String");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		SpecialPrinter periodPuntuated = (s) -> {
			String s1 = "";
			for (int i = 0; i < s.length(); i++) {
				s1 += s.charAt(i);
			}
			s = "";
			for (int i = 0; i < s1.length(); i++) {
				s += s1.charAt(i) + ".";
			}
		};
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
