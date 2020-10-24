package week1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Try {
	static int[] fiveLargestSCCs = { 0, 0, 0, 0, 0 }; 
//	int[] leaders = new int[875715];
	int countSCC=0;
	int[] finishing = new int[875715];
	boolean[] visited = new boolean[875715];
	Map<Integer, Integer> count = new HashMap<Integer, Integer>();
	int t = 0;
	int s = 0;

	static class Graph {

		int v;
		Map<Integer, ArrayList<Integer>> adj;

		public Graph(int v) {
			this.v = v;
			adj = new HashMap<Integer, ArrayList<Integer>>();

		}

		public void addEdge(int v, int u) {
			if (!adj.containsKey(v)) {
				adj.put(v, new ArrayList<Integer>());
			}

			adj.get(v).add(u);

		}

	}

	private void DFS(Graph graph, int type) {
		if (type == 1) {
			for (int i = graph.adj.size() - 1; i >= 1; i--) {
				if (!visited[i]) {
					s = i;
					DFS1(graph, i);
				}
			}
		} else {
			for (int i = graph.adj.size() - 1; i >= 1; i--) {
				if (!visited[finishing[i]]) {
					countSCC=0;
					DFS2(graph, finishing[i]);
					pushSCC(countSCC);
				}
			}
		}
	}

	

	private void DFS1(Graph graph, int i) {
		visited[i] = true;
//		if (type == 2) {
//			leaders[i] = s;
//		}

		if (graph.adj.containsKey(i)) {
			ArrayList<Integer> arc = graph.adj.get(i);
//			if (arc != null) {
			for (Integer j : arc) {
				if (!visited[j]) {
					DFS1(graph, j);
				}
//				}
			}

		}
//		if (type==1) {
		t++;
		finishing[i] = t;
		
//		}

	}

	private void DFS2(Graph graph, int i) {
		visited[i] = true;
//		if (type == 2) {
		countSCC++;
//		leaders[i]=countSCC;
//		}

		if (graph.adj.containsKey(i)) {
			Iterator<Integer> endPointIt = graph.adj.get(i).iterator();

			while (endPointIt.hasNext()) {

				int endPoint = endPointIt.next();

				if (!visited[endPoint])
					DFS2(graph, endPoint);

			}

		}
//		if (type==1) {
//			t++;
//			finishing[i] = t;
//		}

	}
	static void pushSCC(int scc) {

		if (scc <= fiveLargestSCCs[4])
			return;

		fiveLargestSCCs[4] = scc;

		for (int i = 3; i >= 0; i--)

			if (fiveLargestSCCs[i] < fiveLargestSCCs[i + 1])

			{

				int t = fiveLargestSCCs[i + 1];

				fiveLargestSCCs[i + 1] = fiveLargestSCCs[i];

				fiveLargestSCCs[i] = t;

			}

	}

//	private void count() {
//		for (int i = 0; i < leaders.length; i++) {
//			if (!count.containsKey(leaders[i])) {
//				count.put(leaders[i], 1);
//			} else {
//				count.put(leaders[i], count.get(leaders[i]) + 1);
//			}
//		}
//
//	}

	public List<Entry<Integer, Integer>> sortByValue(Map<Integer, Integer> map) {
		List<Entry<Integer, Integer>> sortedEntries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());

		Collections.sort(sortedEntries, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
				return e2.getValue().compareTo(e1.getValue());
			}
		});
		return sortedEntries;

	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(
				new File("C:\\Users\\maria\\OneDrive\\Desktop\\_410e934e6553ac56409b2cb7096a44aa_SCC.txt"));
		Graph graph = new Graph(875715);
		Graph reversedGraph = new Graph(875715);
		for (int i = 0; i < 875715; i++) {
			int v = scanner.nextInt();
			int u = scanner.nextInt();
			graph.addEdge(v, u);
			reversedGraph.addEdge(u, v);
			continue;
		}
		Try algorithm = new Try();
		algorithm.DFS(reversedGraph,1);
		algorithm.visited = new boolean[875715];
		algorithm.DFS(graph,2);
//		algorithm.count();
		int i = 0;
		List<Entry<Integer, Integer>> list = algorithm.sortByValue(algorithm.count);
		for (Entry<Integer, Integer> entry : list) {
			if (i < 5) {
				System.out.println(entry.getValue());
				i++;
			} else {
				break;
			}

		}
	}
}
