
public class Main {

	public static void main(String[] args) {
		/*input int V = number of Vertex, E number of Edges (directed)
		 * E times 2 ints ( V and W ) describing edge going from V to W
		 */
		int V= Integer.parseInt(args[0]);
		int E =Integer.parseInt( args[1]);
		Diagraph DG = new Diagraph(V);
		
		for( int i= 0; i<E*2; i++){
			int A = Integer.parseInt(args[i+2]);
			int B = Integer.parseInt(args[i+3]);
			DG.addEdge(A, B);
		}
	}

}
