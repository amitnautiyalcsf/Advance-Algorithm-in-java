package TopologicalOrdering;

import java.util.Stack;

public class TopologicalOrderingEx 
{
	
	private Stack<Vertex>stack;
	
	public TopologicalOrderingEx() {
		this.stack= new Stack();
	}
	
	public void dfs(Vertex rootVertex)
	{
		
		rootVertex.setVisited(true);
		for(Vertex v: rootVertex.getNeighbourlist())
		{
			
			if(!v.isVisited())
			{
				
				dfs(v);
			}
			
			
		}
		
		stack.push(rootVertex);
		
	}
	
	public Stack<Vertex> getStack()
	{
		return this.stack;
		
	}

}
