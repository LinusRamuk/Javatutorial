package exercise;

public class CountOccurenceofCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Sunil where are you sunil";
		s = s.toLowerCase();
		int repeat;
		char[] ch = s.toCharArray();
		
		for (int i=0; i<ch.length;i++) {
			repeat = 1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j] && ch[i]!=' ') {
					repeat++;
					ch[j]=0;
				}
			}
			if(repeat>1 && ch[i]!=0) {
				System.out.println(ch[i]+" repeated for "+repeat+" times");
			}
		}

	}

}
