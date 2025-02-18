package string_functions;

public class Main {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG       ";
		
		String s01 = original.toLowerCase();
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		String s02 = original.toUpperCase();
		
		System.out.println("toUpperCase: -" + s02 + "-");
		
		String s03 = original.trim();
		System.out.println("trim: -" + s03 + "-");
		String s04 = original.substring(2);
		System.out.println("substring: -" + s04 + "-");
		String s05 = original.substring(2, 9);
		System.out.println("Substring (2, 9): -" + s05 + "-");
		String s06 = original.replace('a', 'x');
		System.out.println("Replace: -" + s06 + "-");
		String s07 = original.replace("abc", "xy");
		System.out.println("Replace: -" + s07 + "-");
		int i = original.indexOf("bc");
		System.out.println("IndexOf: -" + i + "-");
		int j = original.lastIndexOf("bc");
		System.out.println("LastIndexOf: -" + j + "-");
		
		// SPLIT
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.println("word1: " + word1 + "\nWord2: " + word2 + "\nWord3: " + word3);
	}

}
