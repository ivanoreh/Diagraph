
public class Depth {
	private boolean[] visited;
	int[] prije;
	
	public Depth( Diagraph G, int v) {
		visited = new boolean[G.Vrhova];
		prije = new int[G.Vrhova];
		visited[v] = true;
		dfs(G, v);
	}
	public void dfs ( Diagraph G, int v ){
		for( int i: G.adj.elementAt(v)){
			if( !visited[i]){
				visited[i]  = true;
				prije[i] = v;
				dfs( G, i);
			}
		}
	}
	public boolean connected( int v) { return visited[v]; }
}
