package myproject01;

public class exam04 {

	public static void main(String[] args) {
		String line = "1507096390563720195197266839249706211166300673746527173353033868235540146558593627051";
//		System.out.println("line.length : " + line.length());
		StringBuilder sb = new StringBuilder(line);
		int n = line.length();
		while(n - 3 > 0 ) {
			sb.insert(n-3, ",");
//			System.out.println(sb.insert(n-3, ","));
//			System.out.println(sb.toString());
			n -= 3;
		}
		System.out.println(sb.toString());
	}

}
