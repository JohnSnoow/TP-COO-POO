package graph;
	/**
	*@author Bezet et Gallego
	*@version 1.0
	*/
public interface Graph {

	
	
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

    /**
    *@param v1,v2 les deux vertex a tester
    *@return un booleen
    */

	public AreRelied(Vertex v1, Vertex v2){

    }


}
