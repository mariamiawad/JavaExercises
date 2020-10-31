package interviewIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
//https://leetcode.com/problems/subdomain-visit-count/submissions/
public class _01Sample {
	public static void main(String[] args) {
		_01Sample sample = new _01Sample();
		String[] cpdomains = new String[4];
		cpdomains[0]="900 google.mail.com ";
		cpdomains[1]="50 yahoo.com";
		cpdomains[2]="1 intel.mail.com";
		cpdomains[3]="5 wiki.org";
		System.out.println(sample.subdomainVisits(cpdomains).toString());
		
	}
	public List<String> subdomainVisits(String[] cpdomains) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String domain : cpdomains) {
			String [] strings = domain.split(" ");
			int count = Integer.parseInt(strings[0]);
			String[] lowerDomain = strings[1].split("\\.");
			StringBuilder stringBuilder =  new StringBuilder();
			for (int i = lowerDomain.length-1; i >=0; i--) {
				stringBuilder.insert(0, lowerDomain[i]);
				map.put(stringBuilder.toString(), map.getOrDefault(stringBuilder.toString(), 0)+count);
				stringBuilder.insert(0, '.');
			}
		}
		List<String> list = new ArrayList<String>();
		for (Entry<String, Integer> entry : map.entrySet()) {
			list.add(entry.getValue()+" " + entry.getKey());
		}
		return list;
	}
}
