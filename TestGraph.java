package graph;
	/**
	*@author Bezet et Gallego
	*@version 1.0
	*/
public class TestGraph implements Graph {

	/**
	*Crée deux vertex et un edge pour les tests de Graph
    *@param 
    */
	public static void main(String[] args) {
		Vertex v1=new Vertex(1);
		Vertex v2=new Vertex(2);
		DirectedEdge e=new DirectedEdge(v1,v2);
	}

	/**
	*@param v le vertex à ajouter à la liste de Vertex
	*@return rien, met le Vertex dans la liste de Vertex	
	*/
	public addVertex(Vertex v) {
	
    }
	/**
	*@param e l'edge à ajouter dans la matrice d'adjacence
	*@return void
	*/
    public addEdge(Edge e) {
	
    }

	/**
	*@param G le Graph dans lequel on veut 
	*@return la matrice ou tableau de vertex
	*/
    public giveMeAllVertices(Graph G) {

    }


}
