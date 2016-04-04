package graph;
	/**
	*@author Bezet et Gallego
	*@version 1.0
	*/
public abstract class Edge {
	
	Vertex v1;
	Vertex v2;
	/**
    *@param un edge est créé à partir de 2 vertex (v1 et v2)
    */
	public Edge(Vertex v1, Vertex v2) {

		this.v1=v1;
		this.v2=v2;		
	}

}
