package Chapter4;

import java.util.LinkedList;

public class Graph {

    private LinkedList<GraphNode<Integer>> nodes;

    public Graph(){
        nodes = new LinkedList<>();
    }

    public void addGraph(int edge) {
        if(!nodes.contains(getEdge(edge)))
            nodes.add(new GraphNode(edge));
    }

    public void removeGraph(int edge) {
        GraphNode removeNode = getEdge(edge);
        if(nodes.contains(removeNode)) {
            nodes.remove(removeNode);
            for (GraphNode node : nodes) {
                if(node.neighbors.contains(removeNode)){
                    node.removeEdge(removeNode);
                }
            }
        }
    }

    public void addDirectedEdge(int edge1, int edge2) {
        addEdge(edge1, edge2, true);
    }

    public void addUndirectedEdge(int edge1, int edge2) {
        addEdge(edge1, edge2, false);
    }

    private void addEdge(int edge1, int edge2, boolean directed) {

        GraphNode<Integer> node1 = getEdge(edge1);
        GraphNode<Integer> node2 = getEdge(edge2);

        if(node1 != null && node2 != null) {
            node1.addEdge(node2);
            if(!directed)
                node2.addEdge(node1);
        }
    }

    public void removeDirectedEdge(int edge1, int edge2) {
        removeEdge(edge1, edge2, true);
    }

    public void removeUndirectedEdge(int edge1, int edge2) {
        removeEdge(edge1, edge2, false);
    }

    private void removeEdge(int edge1, int edge2, boolean directed) {

        GraphNode<Integer> node1 = getEdge(edge1);
        GraphNode<Integer> node2 = getEdge(edge2);

        if(node1 != null && node2 != null) {
            node1.removeEdge(node2);
            if(!directed)
                node2.removeEdge(node1);
        }
    }

    public GraphNode<Integer> getEdge(int edge) {
        for (GraphNode<Integer> node: nodes) {
            if(node.name == edge) {
                return node;
            }
        }
        return null;
    }

    public void print() {
        for (GraphNode<Integer> node: nodes) {
            System.out.println(node.printNeighbors());
        }
    }

    public void hasConnection_dfs() {}

    public void hasConnection_bfs() {}
}
