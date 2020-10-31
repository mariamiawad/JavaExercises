package week1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class KarajusALgorithm {
	int t = 0;
	int s = 0;
	int n = 875714;
	int[] function = new int[n+1];
	boolean[] visited = new boolean[n+1];
	int countSCC = 0;
	Map<Integer, Integer> count = new HashMap<Integer, Integer>();
	private int[] fiveLargestSCCs = new int[5];

//
	static class Graph {
		int v;
		Map<Integer, List<Integer>> adj;

		public Graph(int v) {
			this.v = v;
			adj = new HashMap<Integer, List<Integer>>();
		}

		public void addEdge(int v, int u) {
			adj.get(v).add(u);

		}
	}

	private void dfs(Graph graph, int i, int x) {
		visited[i] = true;
		if (x == 2) {

			countSCC++;

		}
		List<Integer> arc = graph.adj.get(i);
		if (graph.adj.containsKey(i)) {
			Iterator<Integer> endPointIt = graph.adj.get(i).iterator();

			while (endPointIt.hasNext()) {

				int endPoint = endPointIt.next();

				if (!visited[endPoint])
					dfs(graph, endPoint, x);

			}

		}
		if (x == 1) {
			
			function[t] = i;
			t++;
		}
	}



	private void dfsLoop(Graph graph) {
		for (int i = n; i >= 1; i--) {

			if (!visited[i]) {

				dfs(graph, i, 1);
			}
		}

	}



	private void dfsLoop2(Graph graph) {
		for (int i = n; i >=1; i--) {
			int n = function[i];
			if (!visited[n]) {
				countSCC = 0;
				dfs(graph, n, 2);
				count(countSCC);
			}
		}

	}


	private void count(int scc) {
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




	private void master() throws NumberFormatException, IOException {
		Scanner scanner = new Scanner(
				new File("C:\\Users\\maria\\OneDrive\\Desktop\\_410e934e6553ac56409b2cb7096a44aa_SCC.txt"));
		Graph graph = new Graph(n);
		Graph reversedGraph = new Graph(n);
		FileReader fr = new FileReader(
				"C:\\Users\\maria\\OneDrive\\Desktop\\_410e934e6553ac56409b2cb7096a44aa_SCC.txt");

		BufferedReader br = new BufferedReader(fr);

		String line;

		while ((line = br.readLine()) != null)

		{

			String[] s = line.trim().split(" ");

			System.out.println("S[0] : " + s[0].trim());

			int startPoint = Integer.parseInt(s[0]);

			int endPoint = Integer.parseInt(s[1]);
//		Iterator<Integer> iterator = scanner.itr
//		for (int i = 0; i < 11; i++) {
			int v = startPoint - 1;
			int u = endPoint - 1;
			if (!graph.adj.containsKey(v)) {
				graph.adj.put(v, new ArrayList<Integer>());
			}
			graph.addEdge(v, u);
			if (!reversedGraph.adj.containsKey(u)) {
				reversedGraph.adj.put(u, new ArrayList<Integer>());
			}
			reversedGraph.addEdge(u, v);

		}
//		Set<Integer> set = new HashSet<Integer>();
		dfsLoop(reversedGraph);
//		System.out.println(Arrays.toString(function.toArray()));
		visited = new boolean[n];
		dfsLoop2(graph);
		Arrays.sort(function);
		System.out.println(Arrays.toString(function));
		System.out.println(Arrays.toString(fiveLargestSCCs));

//		List<Entry<Integer, Integer>> list = sortByValue(count);
		System.out.println();
//		for (int i = 0; i < list.size(); i++) {
////			System.out.println(list.get(i).getKey());
//			System.out.println(list.get(i).getValue());
//		}
//		System.out.println();
		scanner.close();
	}

//
	public static void main(String[] args) throws NumberFormatException, IOException {
		KarajusALgorithm algorithm = new KarajusALgorithm();
		algorithm.master();
	}
//	public static void main(String args[]) throws NumberFormatException, IOException {
//		FileReader fr = new FileReader(
//				"C:\\Users\\maria\\OneDrive\\Desktop\\_410e934e6553ac56409b2cb7096a44aa_SCC.txt");
//
//		BufferedReader br = new BufferedReader(fr);
//
//		String line;
//		Graph graph = new Graph(875715);
//		Graph revGraph = new Graph(875715);
//		while ((line = br.readLine()) != null)
//
//		{
//
//			String[] s = line.trim().split(" ");
//
//			System.out.println("S[0] : " + s[0].trim());
//
//			int startPoint = Integer.parseInt(s[0]);
//
//			int endPoint = Integer.parseInt(s[1]);
////
////			if (!graph.adj[startPoint].contains(endPoint))
////				graph.adj[startPoint].add(endPoint);
//
//			graph.addEdge(startPoint, endPoint);
////
////			if (!revGraph.adj[endPoint].contains(startPoint))
////				revGraph.adj[endPoint].add(startPoint);
//
//			revGraph.addEdge(endPoint, startPoint);
//
//		}
//
//		br.close();
//
//		fr.close();
//
//		for (int i = 875714; i >= 1; i--)
//
//			if (!set.contains(i))
//				dfs(revGraph, i, 1);
//
////		isExplored = new boolean[n + 1];
//		set = new HashSet<Integer>();
//		for (int i = 875714; i >= 1; i--)
////
//			if (!set.contains(function.get(i-1))) {
//				s = 0;
//				if (!set.contains(function.get(i-1))) {
//					dfs(graph, function.get(i-1), 2);
//				}
//			
//
//			}
//		count();
//		int i = 0;
//		for (Entry<Integer, Integer> entry : count.entrySet()) {
//			if (i < 5) {
//				System.out.println(entry.getValue());
//				i++;
//			} else {
//				break;
//			}
//		}
//
//	}

}
