import java.util.Scanner;
/*
 * EXERCÍCIOPARCIAL02-BUSCAS
 * Autor: Hélio Potelicki
 */
public class Main {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        buildGraph(graph);
         int steps = -1;

        steps += graph.BFS("Entrada", "*");
        graph.clearVisitedNodes();
        steps += graph.BFS("*", "Saida");
        System.out.println(steps);
    }

    public static void buildGraph(Graph<String> g) {
        Scanner myReader = new Scanner(System.in);
        myReader.nextLine();
        while (myReader.hasNextLine()) {
            String[] data = myReader.nextLine().split(" ");
            if (!g.hasVertex(data[0])){
                g.addVertex(data[0]);
            }
            if (!g.hasVertex(data[1])){
                g.addVertex(data[1]);
            }
            g.addEdge(data[0], data[1]);
            g.addEdge(data[1], data[0]);
        }
        myReader.close();
    }
}
