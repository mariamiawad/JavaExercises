package graph;

public class GraphSearch {
	
	public Iterable<Integer> bfs(Graph G, int s) {
		// TODO - Implement breadth first search algorithm
		return null;
		
	}
	
	public Iterable<Integer> dfs(Graph G, int s) {
		// TODO - Implement depth first search algorithm
		return null;
		
	}

	public static void main(String[] args) {
		Graph g = new Graph(6);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 5);
		g.addEdge(4, 6);
		g.addEdge(5, 6);
		
		GraphSearch gs = new GraphSearch();
		
		System.out.println(gs.dfs(g, 0));
		System.out.println(gs.bfs(g, 0));

	}

}
