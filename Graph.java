import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph<T extends Comparable<T>> {
	//undirected, unweighed graph
	private Map<T, LinkedList<T>> adj = new HashMap<T, LinkedList<T>>();
	public void addEdge(T begin, T end) {
		if(adj.get(begin) == null)
			adj.put(begin, new LinkedList<T>());
		if(adj.get(end) == null)
			adj.put(end, new LinkedList<T>());
		LinkedList<T> beginList = adj.get(begin);
		beginList.add(end);
		Collections.sort(beginList, Collections.reverseOrder());
		LinkedList<T> endList = adj.get(end);
		endList.add(begin);
		Collections.sort(endList, Collections.reverseOrder());
	}
	public void DFS(T start) {
		Map<T, Boolean> visited = new HashMap<>(); // visited[3] = false 
		for(T t:adj.keySet()) {
			visited.put(t, false);
		}
		Gstack<T> stack = new Gstack<>();
		stack.push(start);
		while(!stack.isEmty()) {
			T poppedElement = stack.pop();// take the top element out of stack
			visited.put(poppedElement, true);
			System.out.println(poppedElement);
			for(T t: adj.get(poppedElement)) {
				if(visited.get(t) == false && stack.contains(t) == false)
					stack.push(t);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph<String> graph = new Graph<>();
		graph.addEdge("A", "B");
		graph.addEdge("A", "C");
		graph.addEdge("A", "G");
		graph.addEdge("B", "C");
		graph.addEdge("B", "D");
		graph.addEdge("C", "D");
		graph.addEdge("C", "E");
		graph.addEdge("C", "F");
		graph.addEdge("C", "G");
		graph.addEdge("E", "F");
		graph.DFS("F");



	}

}
