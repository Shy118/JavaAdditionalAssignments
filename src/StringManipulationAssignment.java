
public class StringManipulationAssignment {

	public static String separatedWith(String input, String replace) {
		String output = "";
		for (int i = input.length(); i > 0; i--) {
			output += input.substring(i-1,i);
			if (i != 1 ) {
				output += replace;
			}
		}
		return output;
	} //method
	
	public static String replaceX(String input, String replace) {
		String output = "";
		String replaced = "";
		for (int i = 0; i < input.length(); i++) {
			if (! input.substring(i,i+1).equals(replace)) {
				output += input.substring(i,i+1);
			} //if
			else {
				replaced += input.substring(i,i+1);
			} //else
		} //for
		output += replaced;
		return output;
	}
	
	public static String replaceFirstAndLast(String input) {
		char[] inputArr = input.toCharArray();
		char temp = inputArr[0];
		inputArr[0] = inputArr[inputArr.length-1];
		inputArr[inputArr.length-1] = temp;
		return new String(inputArr);
	}
	
	public static String maxLength(String input) {
		String[] strArr = input.split(" ");
		int maxlength = strArr[0].length();
		String output = "";
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].length() > maxlength) {
				maxlength = strArr[i].length();
				output = strArr[i];
			} //if
		} //for
		return output;
	} //method
	
	public static String firstLetter(String input) {
		String[] strArr = input.split(" ");
		String output = "";
		for (int i = 0; i < strArr.length; i++) {
			output += strArr[i].substring(0,1);
		}
		return output;
	}
	
	public static String charFromSubsequentWord(String input) {
		String[] strArr = input.split(" ");
		String output = "";
		for (int i = 0; i < strArr.length; i++) {
			output += strArr[i].substring(i,i+1);
		}
		return output.toUpperCase();
	}
	
	public static String nextChar(String input) {
		String alphabets = "abcdefghijklmnopqrstuvwxyza";
		String output = "";
		for (int i = 0; i < input.toLowerCase().length(); i++) {
			int idx = alphabets.indexOf(input.toLowerCase().charAt(i));
			if (idx != -1) {
				output += alphabets.substring(idx+1, idx + 2);
			}
			else {
				output += " ";
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Strings Manipulation Assignments");
		System.out.println("===========================================");
		System.out.println("1) Parse the String in the given format separated with '-' \n");
		String input1 = "computer";
		System.out.println("Before parsing: input1 = " + input1);
		String output1 = separatedWith(input1, "-");
		System.out.println("After parsing: output1 = " + output1);
		
		System.out.println("===========================================");
		System.out.println("2) Remove all small 'x' and append at the end of the string \n");
	
		String input2 = "abcxXXcxerxxXXwer";
		System.out.println("Before parsing: input2 = " + input2);
		String output2 = replaceX("abcxXXcxerxxXXwer","x");
		System.out.println("After parsing: output2 = " + output2);
		
		System.out.println("===========================================");
		System.out.println("3) Replace the first and last characters in the given string \n");
		
		String input3 = "Hello World";
		System.out.println("Before parsing: input3 = " + input3);
		String output3 = replaceFirstAndLast("Hello World");
		System.out.println("After parsing: output3 = " + output3);
		
		System.out.println("===========================================");
		
		System.out.println("4) Find the substring which is having max length, if two strings lengths are equal return the first one. \n");
		
		String input41 = "Hi How are you";
		System.out.println("Before parsing: input41 = " + input41);
		String output41 = maxLength(input41);
		System.out.println("After parsing: output41 = " + output41 + "\n");
		
		String input42 = "This is java String program";
		System.out.println("Before parsing: input42 = " + input42);
		String output42 = maxLength(input42);
		System.out.println("After parsing: output42 = " + output42);
		
		System.out.println("===========================================");
		
		System.out.println("5) Given input as : 'Softra Services Limited' \n");
		
		String input5 = "Softra Services Limited";
		System.out.println("Before parsing: input5 = " + input5);
		String output5 = firstLetter(input5);
		System.out.println("After parsing: output5 = " + output5);
		
		System.out.println("===========================================");
		
		System.out.println("6) Given input as : 'Softra Services Limited' < first char from 1st word, 2nd char from second word, 3rd char from 3rd word etc.>> Output should be in capitals at the end. \n");
		
		String input6 = "Softra Services Limited";
		System.out.println("Before parsing: input6 = " + input6);
		String output6 = charFromSubsequentWord(input6);
		System.out.println("After parsing: output6 = " + output6);
		
		System.out.println("===========================================");
		
		System.out.println("7) Get the next character for each and every character of the given String \n");
		
		String input7 = "hello java";
		System.out.println("Before parsing: input7 = " + input7);
		String output7 = nextChar(input7);
		System.out.println("After parsing: output7 = " + output7);
		
	} //main

} //class
