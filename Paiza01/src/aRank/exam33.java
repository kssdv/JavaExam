package aRank;

import java.util.Hashtable;
import java.util.Scanner;

public class exam33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<Character, int[]> ht = new Hashtable<>();
		ht.put('N', new int[] {-1, 0});
		ht.put('E', new int[] {0, 1});
		ht.put('S', new int[] {1, 0});
		ht.put('W', new int[] {0, -1});
		int h = sc.nextInt();
		int w = sc.nextInt();
		int sy = sc.nextInt();
		int sx = sc.nextInt();
		char direction = sc.next().charAt(0);
		int[] new_position = {sy + ht.get(direction)[0], sx + ht.get(direction)[1]};
		char[][] grid = new char[h][w];
		
		for(int i=0; i<h; i++) {
			char[] tmp = sc.next().toCharArray();
			grid[i] = tmp;
		}
		
		if(new_position[0] >= 0 && new_position[1] >= 0 && 
				new_position[0] < grid.length && new_position[1] < grid[0].length) {
			if(grid[new_position[0]][new_position[1]] == '#') {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}else {
			System.out.println("No");
		}
	}

}
