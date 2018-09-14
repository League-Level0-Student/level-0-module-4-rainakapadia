package charAt_scanners_optionDialogs;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods1 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
String a = "peanut";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		char third=a.charAt(3);
		System.out.println(third);
		// 3. Print the length of your String to the console.
		
		//System.out.println(a.length());
		//    HINT: .length()

		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
for(int i=0;i<a.length();i++) {
	a.charAt(i);
	System.out.println(a.charAt(i));
}
		for(int b=0;b<a.length();b++) {
			a.indexOf("n");
			System.out.println(a.indexOf("n"));
		}
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


