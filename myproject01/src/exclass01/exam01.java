package exclass01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		List<SupersupersuperCar> ssscars = new ArrayList<>();
		
		for(int i=0; i<Integer.parseInt(num[0]); i++) {
			String[] t = sc.nextLine().split(" ");
			if(t[0].equals("supercar")) {
				SupersupersuperCar s = new SupersupersuperCar();
				s.fuel = Integer.parseInt(t[1]);
				s.FuelEfficiency = Integer.parseInt(t[2]);
				ssscars.add(s);
			}else if(t[0].equals("supersupercar")) {
				SupersupersuperCar s = new SupersupersuperCar();
				s.fuel = Integer.parseInt(t[1]);
				s.FuelEfficiency = Integer.parseInt(t[2]);
				ssscars.add(s);
			}else if(t[0].equals("supersupersupercar")) {
				SupersupersuperCar s = new SupersupersuperCar();
				s.fuel = Integer.parseInt(t[1]);
				s.FuelEfficiency = Integer.parseInt(t[2]);
				ssscars.add(s);
			}
			
		}
		for(int i=0; i<Integer.parseInt(num[1]); i++) {
			String[] temp = sc.nextLine().split(" ");
			int idx = Integer.parseInt(temp[0]) - 1;
			SupersupersuperCar s = ssscars.get(idx);
			String cmd = temp[1];
			if(cmd.equals("run")) {
				s.run();
			}else if(cmd.equals("fly")) {
				s.fly();
			}else if(cmd.equals("teleport")) {
				s.teleport();
			}
			ssscars.set(idx, s);
		}
		
		// print
		for(SupersupersuperCar s : ssscars) {
			System.out.println(s.distance);
		}
	}

}
