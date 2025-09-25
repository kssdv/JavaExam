package bRank;

import java.util.Scanner;

public class exam90 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<n; i++) {
			String word = sc.nextLine();
			System.out.println(addES(word));
		}
		
	}
	
	static String addES(String word) {
		// + es
		if(word.charAt(word.length()-1) == 's' || 
				word.charAt(word.length()-1) == 'o' || 
				word.charAt(word.length()-1) == 'x' || 
				word.substring(word.length()-2).equals("sh") || 
				word.substring(word.length()-2).equals("ch")
				) {
			return word+"es";
		}else if(word.charAt(word.length()-1) == 'f' ||
				word.substring(word.length()-2).equals("fe")) {
			word = word.substring(word.length()-2).equals("fe") ? 
					word.substring(0, word.length()-2)+"ves" : 
						word.substring(0, word.length()-1)+"ves";
			return word;
		}else if(word.charAt(word.length()-1) == 'y' && (
				word.charAt(word.length()-2) != 'a' && 
				word.charAt(word.length()-2) != 'i' && 
				word.charAt(word.length()-2) != 'u' && 
				word.charAt(word.length()-2) != 'e' && 
				word.charAt(word.length()-2) != 'o')) {
			word = word.substring(0, word.length()-1)+"ies";
			return word;
		}else {
			return word+"s";
		}
	}
	
	static int[] str2int(String[] str) {
		int[] lst = new int[str.length];
		for(int i=0; i<str.length; i++) {
			lst[i] = Integer.parseInt(str[i]);
		}
		return lst;
	}
}
