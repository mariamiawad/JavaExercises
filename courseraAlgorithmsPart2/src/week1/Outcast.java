package week1;



import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Outcast {

	private WordNet wordnet;

	public Outcast(WordNet wordnet) {
		this.wordnet = wordnet;
	}

	public String outcast(String [] nouns) {
		String [] nounString = Arrays.copyOf(nouns, nouns.length);
		int distance =0;
		String outcast = "";
		int tempDistance = 0;
		for (int i = 0; i < nounString.length; i++) {
			tempDistance = outcast(nounString, nounString[i]);
			if (tempDistance> distance) {
				distance = tempDistance;
				outcast = nounString[i];
			}
		}
		return outcast;
		// given an array of WordNet nouns, return an outcast
	}
	private int outcast(String [] nouns , String string) {
		
		int distance = 0;
		for (String string2 : nouns) {
			distance +=wordnet.distance(string, string2);
		}
		return distance;
		// given an array of WordNet nouns, return an outcast
	}

	public static void main(String[] args) {
			WordNet wordnet = new WordNet(
					"file:///C:/Users/maria/eclipse-workspace/courseraAlgoritmsPart2/input/week1/synsets.txt",
					"file:///C:/Users/maria/eclipse-workspace/courseraAlgoritmsPart2/input/week1/hypernyms.txt");
			
		Outcast outcast = new Outcast(wordnet);
//		for (int t = 2; t < args.length; t++) {
			In in = new In( "file:///C:/Users/maria/eclipse-workspace/courseraAlgoritmsPart2/input/week1/outcast10.txt");
			String[] nouns = in.readAllStrings();
			StdOut.println(outcast.outcast(nouns));
//		}
	}

}
