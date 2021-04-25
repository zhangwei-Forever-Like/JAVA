import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {
	private int[][] edges;
	List<String> list;
	int numOfEdges;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(5);
		String[] value= {"A","B","C","D","E"};
		for (int i = 0; i < value.length; i++) {
			graph.insertList(value[i]);
		}
		graph.insertEdge(0, 1, 1);
		graph.insertEdge(0, 2, 1);
		graph.insertEdge(1, 2, 1);
		graph.insertEdge(1, 3, 1);
		graph.insertEdge(1, 4, 1);
		graph.showGraph();
	}

	public Graph(int n) {
		edges = new int[n][n];
		list = new ArrayList<String>(n);
		numOfEdges = 0;
	}
    public int getNumOfVertex() {
    	return list.size();
    }
    public int getNumOfEdges() {
    	return numOfEdges;
    }
    public String getValueByIndex(int i) {
    	return list.get(i);
    }
    public int getWeight(int v1,int v2) {
    	return edges[v1][v2];
    }
	public void insertList(String str) {
		list.add(str);
	}

	public void insertEdge(int v1, int v2, int weight) {
		edges[v1][v2] = weight;
		edges[v2][v1] = weight;
		numOfEdges++;
	}

	public void showGraph() {
		for (int[] link : edges) {
			System.out.println(Arrays.toString(link));
		}
	}
}
