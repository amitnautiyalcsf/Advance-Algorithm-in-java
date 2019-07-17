package TopologicalOrdering;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {
	public static void main(String[] args) {

		TopologicalOrderingEx ex = new TopologicalOrderingEx();
		List<Vertex> v = new ArrayList<>();

		v.add(new Vertex("A"));
		v.add(new Vertex("B"));
		v.add(new Vertex("C"));
		v.add(new Vertex("D"));
		v.add(new Vertex("E"));

		v.get(0).addNeighbour(v.get(3));
		v.get(0).addNeighbour(v.get(2));
		v.get(1).addNeighbour(v.get(3));
		v.get(2).addNeighbour(v.get(1));
		v.get(2).addNeighbour(v.get(4));
		v.get(4).addNeighbour(v.get(1));
		v.get(4).addNeighbour(v.get(3));

		for (int i = 0; i < v.size(); i++) {
			if (!v.get(i).isVisited()) 
			{
				
				ex.dfs(v.get(i));

			}
		}
		
		Stack<Vertex>stack=ex.getStack();
		for(int i =0;i<v.size();i++ )
		{
			
			Vertex vertex= stack.pop();
			System.out.println(vertex + "---->");
			
		}
		

	}
}
