package graph;

public class UndirectedEdge extends Edge {
	
	private Vertex s2;
	private Vertex s1;
	public UndirectedEdge(Graph g,Vertex sommet1, Vertex sommet2) {
		this.graph=g;
		s1 = sommet1;
		s2 = sommet2;
		// TODO Auto-generated constructor stub
	}

}
