package homeProject;
import java.util.Scanner;
import java.util.Stack;

public class Snippet {

	static String super_reduced_string(String s) {
		char[] ch = s.toCharArray();
		//int count = 1;
		Stack<Character> stch = new Stack<>();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0) {
				stch.push(ch[i]);
			} else {
				if (ch[i] == ch[i - 1]) {
					Character tmp = stch.peek();
					if (tmp == null || tmp != ch[i]) {
						stch.push(ch[i]);
					} else {
						stch.pop();
					}
				}else {stch.push(ch[i]);}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Character character : stch) {
			sb.append(character);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = super_reduced_string(s);
		System.out.println(result);
		if(result.length()<1) {
			System.out.println("Empty String");
		}
	}
}
