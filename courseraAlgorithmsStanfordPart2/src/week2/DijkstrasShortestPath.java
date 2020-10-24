package week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class DijkstrasShortestPath {
	int[] cost;
	static int n = 200;

	static class Edge {
		int v;
		int u;
		int weigth;

		public Edge(int v, int u, int weight) {
			this.v = v;
			this.u = u;
			this.weigth = weight;
		}

	}

	static class WeightedGraph {

		int v;
		LinkedList<Edge>[] adj;

		public WeightedGraph(int v) {
			this.v = v;
			adj = new LinkedList[v];
			for (int i = 0; i < adj.length; i++) {
				adj[i] = new LinkedList<Edge>();
			}
		}

		private void addEdge(int v, int u, int weight) {
			Edge edge = new Edge(v, u, weight);
			Edge edge2 = new Edge(u, v, weight);
			adj[v].add(edge);
//			adj[u].addFirst(edge2);

		}

	}

	public void dijkstra(WeightedGraph graph, int s) {
		cost = new int[graph.adj.length];
		Set<Integer> visited = new HashSet<Integer>();
		LinkedList<Edge>[] edges = graph.adj;
		Arrays.fill(cost, Integer.MAX_VALUE);
		int min = Integer.MAX_VALUE;
		int node = s;
		visited.add(s);
		cost[s] = 0;
		while (visited.size() < graph.v) {
			min = Integer.MAX_VALUE;
//			node = 0;
			for (int i = 0; i < graph.v; i++) {
				LinkedList<Edge> edge = edges[i];
				for (int j = 0; j < edge.size(); j++) {
					if (visited.contains(i) && !visited.contains(edge.get(j).u)) {
						int costWeight = cost[i];
						int weight = edge.get(j).weigth;
						if (min > costWeight + weight) {
							min = costWeight + weight;
							node = edge.get(j).u;

						}
					}
				}
			}
			visited.add(node);
			cost[node] = min;

		}
//		Object [] objects = visited.toArray();
		System.out.println(cost[6] + "," + cost[36] + "," + cost[58] + "," + cost[81] + "," + cost[98] + "," + cost[114]
				+ "," + cost[132] + "," + cost[164] + "," + cost[187] + "," + cost[196]);

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		FileReader fr = new FileReader(
				"C:\\Users\\maria\\Downloads\\Documents\\_dcf1d02570e57d23ab526b1e33ba6f12_dijkstraData.txt");

		BufferedReader br = new BufferedReader(fr);

		String line;
		WeightedGraph graph = new WeightedGraph(n);
		
		while ((line = br.readLine()) != null)

		{
			String string = line.replaceAll("\\s", " ");
			String string2 = string.replaceAll(",", " ");
			String[] strings = string2.split(" ");
			int v = Integer.parseInt(strings[0] + "")-1;
			for (int i = 1; i < strings.length - 1; i += 2) {
				graph.addEdge(v, Integer.valueOf(strings[i])-1, Integer.valueOf(strings[i + 1]));
			}

		}
		DijkstrasShortestPath path = new DijkstrasShortestPath();
		path.dijkstra(graph, 0);
		br.close();
	}
}
