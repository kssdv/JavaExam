package bRank;

import java.util.Scanner;

public class exam91 {
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
    	if(word.charAt(word.length()-1) == 'y' && (
				word.charAt(word.length()-2) != 'a' && 
				word.charAt(word.length()-2) != 'i' && 
				word.charAt(word.length()-2) != 'u' && 
				word.charAt(word.length()-2) != 'e' && 
				word.charAt(word.length()-2) != 'o')) {
			word = word.substring(0, word.length()-1)+"ies";
			return word;
		}else{
		    return word+"s";
		}
    }
}
