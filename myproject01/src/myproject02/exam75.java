package myproject02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Character{
	Character() {}
	int level;
	int health;
	int attack;
	int defence;
	int speed;
	int clever;
	int luck;
}
public class exam75 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] snum = sc.nextLine().split(" ");
		List<Character> characters = new ArrayList<>();
		// キャラクターの情報入力
		for(int i=0; i<Integer.parseInt(snum[0]); i++) {
			Character c = new Character();
			String[] t = sc.nextLine().split(" ");
			c.level = Integer.parseInt(t[0]);
			c.health = Integer.parseInt(t[1]);
			c.attack = Integer.parseInt(t[2]);
			c.defence = Integer.parseInt(t[3]);
			c.speed = Integer.parseInt(t[4]);
			c.clever = Integer.parseInt(t[5]);
			c.luck = Integer.parseInt(t[6]);
			
			characters.add(c);
		}
		// イベント発生と結果の保存
		for(int i=0; i<Integer.parseInt(snum[1]); i++) {
			String[] t = sc.nextLine().split(" ");
			Character c = characters.get(Integer.parseInt(t[0])-1);
			if(t[1].equals("levelup")) {
				c.level = c.level + 1;
				c.health = c.health + Integer.parseInt(t[2]);
				c.attack = c.attack + Integer.parseInt(t[3]);
				c.defence = c.defence + Integer.parseInt(t[4]);
				c.speed = c.speed + Integer.parseInt(t[5]);
				c.clever = c.clever + Integer.parseInt(t[6]);
				c.luck = c.luck + Integer.parseInt(t[7]);
			}else if(t[1].equals("muscle_training")) {
				c.health = c.health + Integer.parseInt(t[2]);
				c.attack = c.attack + Integer.parseInt(t[3]);
			}else if(t[1].equals("running")) {
				c.defence = c.defence + Integer.parseInt(t[2]);
				c.speed = c.speed + Integer.parseInt(t[3]);
			}else if(t[1].equals("study")) {
				c.clever = c.clever + Integer.parseInt(t[2]);
			}else if(t[1].equals("pray")) {
				c.luck = c.luck + Integer.parseInt(t[2]);
			}
			characters.set(Integer.parseInt(t[0])-1, c);
		}
		for(Character c : characters) {
			System.out.println(c.level+" "+c.health+" "+c.attack+" "+c.defence+" "+c.speed+" "+c.clever+" "+c.luck);
		}
	}
}
