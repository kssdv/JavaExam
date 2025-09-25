package myproject01;

import java.text.NumberFormat;

public class exam03 {

	public static void main(String[] args) {
//		long number = 150709639056372019519726683924970621116630067374652717335303386823554014655859362705;
		int number = 123456789;
		// 方法１
		NumberFormat formatter = NumberFormat.getInstance();
		String formattedNum = formatter.format(number);
		System.out.println(formattedNum);
		
		// 方法２
		String formattedNumber = String.format("%,d", number);
		System.out.println(formattedNumber);
	}

}
