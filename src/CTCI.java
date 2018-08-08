import Chapter1.ChapterOne;
import Chapter2.ChapterTwo;
import Chapter3.ChapterThree;
import Chapter4.ChapterFour;
import Chapter4.Graph;

public class CTCI {
    public static void main(String [] args) {

        ChapterOne c1 = new ChapterOne();
        ChapterTwo c2 = new ChapterTwo();
        ChapterThree c3 = new ChapterThree();
        ChapterFour c4 = new ChapterFour();

        Graph graph = new Graph();

        for (int i = 0; i < 7; i++) {
            graph.addGraph(i);
        }

        graph.addDirectedEdge(0,0);
        graph.addDirectedEdge(0,1);
        graph.addDirectedEdge(1,2);
        graph.addDirectedEdge(2,0);
        graph.addDirectedEdge(2,3);
        graph.addDirectedEdge(3,2);
        graph.addDirectedEdge(4,6);
        graph.addDirectedEdge(5,4);
        graph.addDirectedEdge(6,5);

        graph.print();
    }
}
