package graph;
public class AdjacencyMatrixGraph implements Graph {

    boolean[100][100] Matrix ;
    Vertex[100] vertices;
    int nbVertices=0;

	/**
    *@param int détermine la taille initiale de la matrice
    */
    public AdjacencyMatrixGraph(int size) {
	nbVertices = 0;
	Matrix = new ....
	vertices = new ....
    }


    /**
    *@param v le vertex à ajouter dans la matrice
    */
    public void addVertex(Vertex v) {
	vertices[nbVertices]=v;
	nbVertices+=1;
	
	
    }

    /**
    *@param e l'edge à rajouter dans la matrice
    */
    public void AddEdge(Edge e) {
	int i=0;
	int j=0;
	while(vertices[i]!=e.v1 and i<nbVertices){
	i=i+1;
	}
	if (i==nbVertices){
		vertices[i]=e.v1;
	}
	while(vertices[j]!=e.v2 and j<nbVertices){
	j=j+1;
	}
	if (j==nbVertices){
		vertices[j]=e.v2;
	}
	
	Matrix[i][j]=true;
	}
	

	/**
    *@param e l'edge à retirer de la matrice
    */
    public void removeEdge(Edge e) {
	int i=0;
	int j=0;
	while(vertices[i]!=e.v1 and i<nbVertices){
	i=i+1;
	}
	if (i==nbVertices){
		vertices[i]=e.v1;
	}
	while(vertices[j]!=e.v2 and j<nbVertices){
	j=j+1;
	}
	if (j==nbVertices){
		vertices[j]=e.v2;
	}
	
	Matrix[i][j]=false;
	}
    }

    /**
    *@param v le vertex à retirer de la matrice
    */
	public void removeVertice(Vertex v) {
	int i=0;
	while(vertices[i]!=e.v1 and i<nbVertices){
	i=i+1;
	}
	for (j=i;j<nbVertices;j++)
	vertices[j]=vertices[j+1];
	
	}
}
