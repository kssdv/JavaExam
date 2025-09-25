//package myproject02;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class Player{
//	int hp;
//	int[][] flame = new int[3][2];
//	int flame1;
//	int attack1;
//	int flame2;
//	int attack2;
//	int flame3;
//	int attack3;
//	boolean isDead=false;
//	boolean isAlreadyStrengthen=false;
//}
//public class exam76 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		List<Player> players = new ArrayList<>();
//		String[] snum = sc.nextLine().split(" ");
//		
//		for(int i=0; i<Integer.parseInt(snum[0]); i++) {
//			String[] t = sc.nextLine().split(" ");
//			Player p = new Player();
//			p.hp = Integer.parseInt(t[0]);
//			
//			p.flame[0][0] = Integer.parseInt(t[1]);
//			p.flame[0][1] = Integer.parseInt(t[2]);
//			p.flame[1][0] = Integer.parseInt(t[3]);
//			p.flame[1][1] = Integer.parseInt(t[4]);
//			p.flame[2][0] = Integer.parseInt(t[5]);
//			p.flame[2][1] = Integer.parseInt(t[6]);
//			
//			players.add(p);
//		}
//		for(int i=0; i<Integer.parseInt(snum[1]); i++) {
//			String[] temp = sc.nextLine().split(" ");
//			Player p1 = players.get(Integer.parseInt(temp[0])-1);
//			Player p2 = players.get(Integer.parseInt(temp[2])-1);
//			
//			// 強化の際
//			if(p1.flame[Integer.parseInt(temp[1])-1][0] == 0 && !p1.isAlreadyStrengthen) {
//				int t = Integer.parseInt(temp[1])-1;
//				for(int j=0; j<3; j++) {
//					if(p1.flame[t][0] != i) {
//						p1.flame[t][0] -= 3;
//						p1.flame[t][0] = p1.flame[t][0] < 1 ? 1 : p1.flame[t][0];
//						p1.flame[t][1] += 5;
//					}
//				}
//			}
//			if(p2.flame[Integer.parseInt(temp[1])-1][0] == 0 && !p2.isAlreadyStrengthen) {
//				int t = Integer.parseInt(temp[1])-1;
//				for(int j=0; j<3; j++) {
//					if(p2.flame[t][0] != i) {
//						p2.flame[t][0] -= 3;
//						p2.flame[t][0] = p2.flame[t][0] < 1 ? 1 : p2.flame[t][0];
//						p2.flame[t][1] += 5;
//					}
//				}
//			}
//			
//			// 戦いの際
//			if(p1.flame[Integer.parseInt(temp[1])-1][0] < p2.flame[Integer.parseInt(temp[1])-1][0] && (!p1.isDead || !p2.isDead)) {
//				p2.hp -= p1.flame[Integer.parseInt(temp[1])-1][1];
//				if(p2.hp <= 0) {
//					p2.hp = 0;
//					p2.isDead = true;
//				}
//			}else if(p1.flame[Integer.parseInt(temp[1])-1][0] > p2.flame[Integer.parseInt(temp[1])-1][0] && (!p1.isDead || !p2.isDead)) {
//				p1.hp -= p1.flame[Integer.parseInt(temp[1])-1][1];
//				if(p1.hp <= 0) {
//					p1.hp = 0;
//					p1.isDead = true;
//				}
//			}
//			if(p1.flame[Integer.parseInt(temp[3])-1][0] < p2.flame[Integer.parseInt(temp[3])-1][0] && (!p1.isDead || !p2.isDead)) {
//				p2.hp -= p1.flame[Integer.parseInt(temp[3])-1][1];
//				if(p2.hp <= 0) {
//					p2.hp = 0;
//					p2.isDead = true;
//				}
//			}else if(p1.flame[Integer.parseInt(temp[3])-1][0] > p2.flame[Integer.parseInt(temp[3])-1][0] && (!p1.isDead || !p2.isDead)) {
//				p1.hp -= p1.flame[Integer.parseInt(temp[1])-1][1];
//				if(p1.hp <= 0) {
//					p1.hp = 0;
//					p1.isDead = true;
//				}
//			}
//			players.set(Integer.parseInt(temp[0])-1, p1);
//			players.set(Integer.parseInt(temp[2])-1, p2);
//		}
//		int cnt = 0;
//		for(Player p : players) {
//			cnt += !p.isDead ? 1 : 0;
//		}
//		System.out.println(cnt);
//	}
//}
