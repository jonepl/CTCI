package Chapter4;

import java.util.LinkedList;

public class GraphNode <T> {

    public T name;
    public LinkedList<GraphNode<T>> neighbors;

    public GraphNode(T name) {
        this.name = name;
        this.neighbors = new LinkedList<>();
    }

    public void addEdge(GraphNode node) {
        neighbors.add(node);
    }

    public void removeEdge(GraphNode node) {
        neighbors.remove(node);
    }

    public String printNeighbors() {
        String output = "";

        output += "[" + name + "]: ";
        for (GraphNode neighbor: neighbors) {
            if(!(neighbor == neighbors.getLast())) {
                output += neighbor.name.toString() + ", ";
            } else {
                output += neighbor.name.toString();
            }
        }
        return output;
    }
}
