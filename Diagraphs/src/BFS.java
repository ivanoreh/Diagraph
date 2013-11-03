import java.util.ArrayList;

public class BFS {
	
	int[] dist;
	boolean[] visited;
	
	public BFS(Diagraph G, int start) {
		visited = new boolean[G.Vrhova];          // Initialize
		dist = new int[G.Vrhova];
		visited[start] = true;
		
		ArrayList<Integer> q = new ArrayList<Integer>();	
		q.add(start);
		
		while( q.size() != 0){					//algorithm
			for( int next: G.adj.elementAt(q.get(0)) ){
				if( !visited[next] ){
					visited[next] = true;
					dist[next] = dist[q.get(0)] + 1;
					q.add(next);
				}
			}
			q.remove(0);
		}
	}
	
}
