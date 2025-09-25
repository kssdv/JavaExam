package myproject02;

import java.util.Scanner;

class Player {

    int hp;
    int[] f, a;

    Player(int hp, int f1, int a1, int f2, int a2, int f3, int a3) {
        this.hp = hp;
        this.f = new int[] { f1, f2, f3 };
        this.a = new int[] { a1, a2, a3 };
    }

    void enhance() {
        for (int i = 0; i < 3; i++) {
            if (a[i] == 0 && f[i] == 0) {
                continue;
            }

            a[i] += 5;
            f[i] = Math.max(f[i] - 3, 1);
        }
    }

    boolean isAlive() {
        return hp > 0;
    }

    void takeDamage(int d) {
        hp -= d;
    }
}

public class exam77 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            int hp = sc.nextInt();
            int f1 = sc.nextInt();
            int a1 = sc.nextInt();
            int f2 = sc.nextInt();
            int a2 = sc.nextInt();
            int f3 = sc.nextInt();
            int a3 = sc.nextInt();
            players[i] = new Player(hp, f1, a1, f2, a2, f3, a3);
        }

        for (int i = 0; i < k; i++) {
            int p1Index = sc.nextInt() - 1;
            int t1 = sc.nextInt() - 1;
            int p2Index = sc.nextInt() - 1;
            int t2 = sc.nextInt() - 1;

            Player p1 = players[p1Index];
            Player p2 = players[p2Index];

            if (!p1.isAlive() || !p2.isAlive()) {
                continue;
            }

            int f1 = p1.f[t1];
            int a1 = p1.a[t1];
            int f2 = p2.f[t2];
            int a2 = p2.a[t2];
            boolean p1Enhance = a1 == 0 && f1 == 0;
            boolean p2Enhance = a2 == 0 && f2 == 0;

            if (p1Enhance && p2Enhance) {
                p1.enhance();
                p2.enhance();
            } else if (p1Enhance) {
                p1.enhance();
                p1.takeDamage(a2);
            } else if (p2Enhance) {
                p2.takeDamage(a1);
                p2.enhance();
            } else {
                if (f1 < f2) {
                    p2.takeDamage(a1);
                } else if (f1 > f2) {
                    p1.takeDamage(a2);
                }
            }
        }

        int numOfAlivePlayers = 0;
        for (Player player : players) {
            if (player.isAlive()) {
                numOfAlivePlayers++;
            }
        }

        System.out.println(numOfAlivePlayers);
    }
}