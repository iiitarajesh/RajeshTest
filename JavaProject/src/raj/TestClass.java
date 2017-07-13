package raj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class TestClass {
	public static void main(String args[]) throws Exception {
		// Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		TestClass tc = new TestClass();
		// String line = sc.nextLine();
		String line = br.readLine();
		HashMap<Integer, String[]> hm = new HashMap<>();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			int P = Integer.parseInt(input);
			String K[] = new String[P];

			for (int j = 0; j < P; j++) {
				K[j] = br.readLine().trim();
			}
			hm.put(i, K);
		}
		// sc.close();
		ArrayList<Integer> output = tc.findDualNumber(hm);
		for (Integer integer : output) {
			System.out.println(integer);
		}
	}

	public ArrayList<Integer> findDualNumber(HashMap<Integer, String[]> input) {

		ArrayList<Integer> output = new ArrayList<>();
		for (Integer key : input.keySet()) {
			String[] str = input.get(key);
			ArrayList<Integer> arl = new ArrayList<>();
			for (int i = 0; i < str.length; i++) {
				int num = Integer.parseInt(str[i]);

				int mid = num / 2;
				int flag = 0;
				if (num == 1) {
					flag = 1;
				}
				for (int j = 2; j <= mid; j++) {
					if (num % j == 0) {
						// System.out.println("Number is not prime");
						flag = 1;
					}
				}
				if (flag == 0) {
					arl.add(num);
				}
			}
			if (arl.size() == 0 || arl.isEmpty()) {
				output.add(-1);
			} else if (arl.size() == 1) {
				int prime = arl.get(0);
				output.add(prime * prime);
			} else {
				output.add(arl.get(arl.size() - 1) * arl.get(arl.size() - 2));
			}
		}
		return output;
	}
}