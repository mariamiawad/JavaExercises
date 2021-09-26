package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import jdk.internal.jshell.tool.resources.l10n;

public class MakingAnagrams {
	public static int makeAnagram(String a, String b) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) {
			int ct = map.containsKey(a.charAt(i)) ? map.get(a.charAt(i)) : 0;
			map.put(a.charAt(i), (ct + 1));
		}
		for (int i = 0; i < b.length(); i++) {
			int ct = map.containsKey(b.charAt(i)) ? map.get(b.charAt(i)) : 0;
			map.put(b.charAt(i), (ct - 1));
		}
		 List<Integer> values = new ArrayList<>( map.values() );
	        int total = 0;
	        for( Integer v: values ) {
	            total += Math.abs(v);
	        }
	        return total;
	}

//gilmrsvw
	public static Map<Character, Integer> makeAnagram(String a) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) {
			if (map.containsKey(a.charAt(i))) {
				map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
			} else {
				map.put(a.charAt(i), 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		String a = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		String b = "fcrxzwscanmligyxyvym";
		System.out.println(makeAnagram(a, b));
		a = "cde";
		b = "abc";
		System.out.println(makeAnagram(a, b));
		a = "cde";
		b = "dcf";
		System.out.println(makeAnagram(a, b));
	}

}
