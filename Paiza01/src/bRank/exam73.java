package bRank;

import java.util.Scanner;

public class exam73 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] xyz = str2int(sc.nextLine().split(" "));
		String[][][] d3 = new String[xyz[0]][xyz[1]][xyz[2]];
		String[][] syomen = new String[xyz[2]][xyz[1]];
		
		for(int z=xyz[2]-1; z>=0; z--) {
			String[] tlst = new String[xyz[1]];
			fulldot(tlst);
			for(int x=0; x<xyz[0]; x++) {
//				for(int y=0; y<xyz[1]; y++) {
					String tmp = sc.nextLine();
					for(int i=0; i<tmp.length(); i++) {
						if(tmp.charAt(i) == '#') {
							tlst[i] = "#";
						}
					}
//				}
			}
			sc.nextLine();
			syomen[z] = tlst;
		}
		
		for(String[] s : syomen) {
			System.out.println(String.join("", s));
		}
	}
	
	static void fulldot(String[] str) {
		for(int i=0; i<str.length; i++) {
			str[i] = ".";
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
