
public class Main {

	public static void main(String[] args) {
		/*input int V = number of Vertex, E number of Edges (directed)
		 * E times 2 ints ( V and W ) describing edge going from V to W
		 */
		int V= Integer.parseInt(args[0]);
		int E =Integer.parseInt( args[1]);
		Diagraph DG = new Diagraph(V);
		
		for( int i= 0; i<E*2; i+=2){
			int A = Integer.parseInt(args[i+2]);
			int B = Integer.parseInt(args[i+3]);
			System.out.println( A + " " + B);
			DG.addEdge(A, B);
		}
		
		Depth dfs = new Depth(DG, 0);  // start dfs on diagraph DG starting at 
										// node 0
		System.out.println(dfs.connected(4) + " povezan je \n");  // check if 0 is connected with 4
		if( dfs.connected(4)){
			BFS bfs  = new BFS(DG, 0);
			System.out.println( bfs.dist[4]); // write dist from 0 -> 4
		}
	}

}
