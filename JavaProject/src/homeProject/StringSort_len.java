package homeProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringSort_len implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o1.length() - o2.length();
	}

	public static void main(String[] args) {
		String input = "My name is Rajesh who are you";
		String output = sortBasedOnLength(input);
		System.out.println(output);
	}

	private static String sortBasedOnLength(String str) {
		StringSort_len sl = new StringSort_len();
		StringBuilder sb = new StringBuilder();
		String input = str;
		String[] inArr = input.split(" ");
		ArrayList<String> arr = new ArrayList<>();
		for (String string : inArr) {
			arr.add(string);
		}
		Collections.sort(arr, sl);
		for (String string : arr) {
			sb.append(string+" ");
		}

		return sb.toString();
	}
}
