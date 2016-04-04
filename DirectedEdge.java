package graph;
	/**
	*@author Bezet et Gallego
	*@version 1.0
	*/
public class DirectedEdge extends Edge{
	
	Boolean dir;
	/**
    *@param d, f les deux vertex de l'edge
    *@param dir sert à connaitre le sens (de v1 vers v2 si true, de v2 vers v1 si false)
    */
	public DirectedEdge(Vertex d, Vertex f, Boolean dir) {
		v1=d;
		v2=f;
		this.dir=dir;
		
	}

}
