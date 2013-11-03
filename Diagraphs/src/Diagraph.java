import java.util.Queue;
import java.util.Vector;
public class Diagraph {
	
	Vector< Vector<Integer>> adj = new Vector< Vector<Integer>> ();
	int Vrhova;
	
	public Diagraph(int V) {
		Vrhova = V;
		Vector<Integer> novi= new Vector<Integer>();
		for( int i=0; i<V; i++) adj.add(novi);
	}
	
	
	public void addEdge( int v, int w){
		adj.elementAt(v).add(w);
	}
	
	public Vector<Integer> veze (int v){
		return adj.elementAt(v);
		}

}
