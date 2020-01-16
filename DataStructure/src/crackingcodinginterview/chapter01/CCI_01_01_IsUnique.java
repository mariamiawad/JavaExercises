package crackingcodinginterview.chapter01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CCI_01_01_IsUnique {

	public boolean isUnique(String str) {
		Map<Character, Integer> map = new HashMap<>();
		Character[] characters = str.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
		for (int i = 0; i < characters.length; i++) {
			if (map.containsKey(characters[i])) {
				map.put(characters[i], map.get(characters[i])+1);
			}
			else {
				map.put(characters[i], 1);
			}
			
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue()>1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		CCI_01_01_IsUnique client = new CCI_01_01_IsUnique();
		System.out.println(client.isUnique("khaled")); // should be true;
		System.out.println(client.isUnique("mariam")); // should be false;

	}

}
