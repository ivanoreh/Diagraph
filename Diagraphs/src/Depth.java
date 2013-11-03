
public class Depth {
	private boolean[] visited;
	int[] prije;
	
	public Depth( Diagraph G, int v) {
		visited = new boolean[v];
		prije = new int[v];
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
	public boolean spojen( int v) { return visited[v]; }
}
