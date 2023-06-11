package baiscjava;

import java.util.Map;
import java.util.HashMap;

public class StringsInterviewPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To reverse string
		String s = "Sunil";
		String r = "";

		for (int i = 0; i < s.length(); i++) {
			r = s.charAt(i) + r;
		}
		System.out.println("reversed string: " + r);
		System.out.println("");

		// To check for duplicates of letters in a string

		String s1 = "sreevalli is here";
		int count;
		char letters[] = s1.toCharArray();

		for (int i1 = 0; i1 < letters.length; i1++) {
			count = 1;
			for (int j1 = i1 + 1; j1 < letters.length; j1++) {
				if (letters[i1] == letters[j1] && letters[i1] != ' ') {
					count++;
					letters[j1] = 0;
				}
			}
			if (count > 1 && letters[i1] != 0) {
				System.out.println("duplicate letter is: " + letters[i1]);
				System.out.println("word repeated times: " + count);
			}
		}
		System.out.println();

		// To check for duplicates of words in a string

		String s2 = "sunil unlun uhnt sunil";
		int count1;
		String words[] = s2.split(" ");

		for (int i1 = 0; i1 < words.length; i1++) {
			count1 = 1;
			for (int j1 = i1 + 1; j1 < words.length; j1++) {
				if (words[i1] == words[j1]) {
					count1++;
					words[j1] = "0";
				}
			}
			if (count1 > 1 && words[i1] != "0") {
				System.out.println("duplicate word is: " + words[i1]);
				System.out.println("word repeated times: " + count1);
			}
		}

		// find duplicates in string
		String str = "JavaProgram";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] chararr = str.toCharArray();
		
		for (char c : chararr) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}

		System.out.println(charMap);
		System.out.println("");

		// reverse individual words in a sentence

		String s3 = "Sunil Kumar";
		String char1[] = s3.split(" ");
		String output = "";

		for (int i = 0; i < char1.length; i++) {
			String r1 = char1[i];
			System.out.println(r1);
			String r2 = "";
			for (int j = 0; j < r1.length(); j++) {
				r2 = r1.charAt(j) + r2;
			}
			output = output + r2 + " ";
		}
		System.out.println(output);
		
		System.out.println("");
		
		
						
		// Remove junk/special chars in a string
				
				String s5 = "SUnil.Godala@gmail.com//**^^%%";
				System.out.println(s5);
				s5 = s5.replaceAll("[^a-zA-Z0-9]", "");
				System.out.println(s5);
				System.out.println();
				
		// remove spaces in a string
		
				String s6 = "sunil     Hi    how    r  u  ?";
				s6=s6.replaceAll("\\s", "");
				System.out.println(s6);
				System.out.println();
	}
}
