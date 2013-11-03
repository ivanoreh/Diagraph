
public class Depth {
	private boolean[] visited;
	
	public Depth( Diagraph G, int v) {
		visited = new boolean[v];
	}
	public void dfs ( Diagraph G, int v ){
		for( int i: G.adj.elementAt(v)){
			if( !visited[i]){
				visited[i]  = true;
				dfs( G, i);
			}
		}
	}
	public boolean spojen( int v) { return visited[v]; }
}
