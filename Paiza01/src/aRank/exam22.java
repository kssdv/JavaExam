package aRank;

import java.math.BigInteger;

public class exam22 {

	public static void main(String[] args) {
		BigInteger num1 = new BigInteger("1234567");
		num1 = num1.add(BigInteger.ONE);
		System.out.println(num1);
		num1 = num1.mod(new BigInteger("10000"));
		System.out.println(num1);
	}

}
