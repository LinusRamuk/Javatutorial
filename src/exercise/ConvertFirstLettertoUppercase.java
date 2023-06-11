package exercise;

public class ConvertFirstLettertoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "sunil where are you going now";
		String word[] = s.split(" ");
		String s1 = "";
		for (int i = 0; i < word.length; i++) {
			char sword[] = word[i].toCharArray();
			for (int j = 0; j < sword.length; j++) {
				if (j == 0) {
					// System.out.println(sword.charAt(j));
					sword[j] = Character.toUpperCase(sword[j]);
					System.out.println(sword[j]);
				}
				s1 = s1 + sword[j];
			}
			s1 = s1 + " ";
		}
		System.out.println(s1);

	}

}
