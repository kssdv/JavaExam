package exmethod;

import java.util.Arrays;

public class exam01 {

	public static void main(String[] args) {
		String[] names = {"Alice", "Bob", "Charlie"};
		
		// 通常のラムダ式
		Arrays.stream(names).forEach(name -> System.out.print(name));
		
		// メソッド参照を使用
		// System.out::printlnはメソッド参照をし変数を入力する必要なし
		Arrays.stream(names).forEach(System.out::println);
	}
	public static String changeName(String data, String lastName) {
		String[] temp =data.split(" ");
		temp[0] = lastName;
		data = String.join(" ", temp);
		
		return data;
	}
}
