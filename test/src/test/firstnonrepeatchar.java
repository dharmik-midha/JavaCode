package test;

import java.util.*;

public class firstnonrepeatchar {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();

		LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			if (mp.containsKey(s1.charAt(i))) {
				mp.put(s1.charAt(i), mp.get(s1.charAt(i)) + 1);
			} else {
				mp.put(s1.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> i : mp.entrySet()) {
			if (i.getValue() == 1)
				System.out.println("Unique Character "+i.getKey() );
			break;
		}
	}

}
