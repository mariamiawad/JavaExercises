package week1;
import java.util.HashMap;
import java.util.Map;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.DirectedCycle;
import edu.princeton.cs.algs4.In;


public class WordNet {
	private Map<String, Bag<Integer>> words;
	private SAP sap;
	private Map<Integer, String> synSet;
	private Digraph digraph;
	// constructor takes the name of the two input files
	public WordNet(String synsets, String hypernyms) {
		this.words = new HashMap<>();
		this.synSet = new HashMap<>();
		int numSet = parseSynset(synsets);
		digraph = new Digraph(numSet);
		parseHypernyms(hypernyms, numSet);
		this.sap = new SAP(digraph);
//		parseHypernyms(hypernyms, numSet);

	}

	// returns all WordNet nouns
	public Iterable<String> nouns() {
		return words.keySet();
	}

	// is the word a WordNet noun?
	public boolean isNoun(String word) {
		if (word == null) {
			throw new IllegalArgumentException();
		}
		return words.containsKey(word);
	}

	// distance between nounA and nounB (defined below)
	public int distance(String nounA, String nounB) {
		Bag<Integer> bag1 = words.get(nounA);
		Bag<Integer> bag2 = words.get(nounB);
		return sap.length(bag1, bag2);
	}

	// a synset (second field of synsets.txt) that is the common ancestor of nounA
	// and nounB
	// in a shortest ancestral path (defined below)
	public String sap(String nounA, String nounB) {
		Bag<Integer> bag1 = words.get(nounA);
		Bag<Integer> bag2 = words.get(nounB);
		int root = sap.ancestor(bag1, bag2);
		return synSet.get(root);
	}

	private int parseSynset(String synSet) {
		if (synSet == null) {
			throw new IllegalArgumentException();
		}
		int count = 0;
		In in = new In(synSet);
		String line = null;
		while ((line = in.readLine()) != null) {
			if (line.equals("")) {
				continue;
			}
			String[] strings = line.split(",");
			if (strings.length < 2) {
				throw new IllegalArgumentException();
			}
			int id = Integer.parseInt(strings[0]);
			this.synSet.put(id, strings[1]);
			String[] strings2 = strings[1].split(" ");
			for (String w : strings2) {
				Bag<Integer> bag;
				if (words.containsKey(w)) {
					bag = this.words.get(w);
				} else {
					bag = new Bag<>();
				}
					bag.add(id);
				
					words.put(w, bag);

				
			}
			count++;
		}
		in.close();
		return count;
	}

	
	private void parseHypernyms(String hyper, int numSet) {
		if (/* numSet == 0 || */ hyper == null) {
			throw new IllegalArgumentException();
		}
		In in = new In(hyper);
		String line = null;
		while ((line = in.readLine()) != null) {
			if (line.equals("")) {
				continue;
			}
			String[] strings = line.split(",");
			int from = Integer.parseInt(strings[0]);
			for (int i = 1; i < strings.length; i++) {
				int to = Integer.parseInt(strings[i]);
				digraph.addEdge(from, to);

			}
		}
		in.close();
		DirectedCycle directedCycle = new DirectedCycle(digraph);
		if (directedCycle.hasCycle()) {
			throw new IllegalArgumentException();
		}
		int root = 0;
		for (int i = 0; i < numSet; i++) {
			if (!digraph.adj(i).iterator().hasNext()) {
				root++;
			}
		}
		if (root > 1) {
			throw new IllegalArgumentException();
		}

	}

	// do unit testing of this class
	public static void main(String[] args) {
		WordNet wordNet = new WordNet(
				"file:///C:/Users/maria/eclipse-workspace/courseraAlgoritmsPart2/input/week1/synsets.txt",
				"file:///C:/Users/maria/eclipse-workspace/courseraAlgoritmsPart2/input/week1/hypernyms.txt");
		System.out.println(wordNet.distance("Queen_Anne's_lace", "delta"));
	}
}
