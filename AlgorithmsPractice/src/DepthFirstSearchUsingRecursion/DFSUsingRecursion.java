package DepthFirstSearchUsingRecursion;

import java.util.List;
import java.util.Stack;

import DepthFirstSearchUsingRecursion.Vertex;

public class DFSUsingRecursion 
{
	

	private Stack<Vertex>stack;
	
	public DFSUsingRecursion() {
	
		this.stack = new Stack<>();
		
	}
	
	
	public void dfs(List<Vertex>vertexList)
	{
		
		for(Vertex v : vertexList) // if we have multiple Culsters of vertex and we want to visit every vertex.
		{
			if(!v.isVisited())
			{
				v.setVisited(true);
				
				
			//	dfsWithStack(v);
				
				dfsRecursive(v);
				
				
				
			}
			
			
		}
		
	}

	
// No matter weather we use Stack abstract Data type as we used in the comment section the operating system will use stack memory space when we used a method recursively
	
	private void dfsRecursive(Vertex rootVertex) {
		System.out.println(rootVertex + "");
		for(Vertex vertex: rootVertex.getNeighbourList())
		{
			if(!vertex.isVisited())
			{
				vertex.setVisited(true);
				dfsRecursive(vertex);
				
				
			}
			
		}
		
	}


//	private void dfsWithStack(Vertex rootVertex) 
//	{
//		this.stack.add(rootVertex);
//		rootVertex.setVisited(true);
//		
//		while(!stack.isEmpty())
//		{
//			
//			Vertex actualVertex= this.stack.pop();
//			System.out.println(actualVertex + " ");
//			
//			for(Vertex v : actualVertex.getNeighbourList())
//			{
//				if(!v.isVisited())
//				{
//					v.setVisited(true);
//					this.stack.push(v);
//					
//				}
//				
//			}
//			
//			
//			
//		}
//		
//		
//		
//	
//		
//	}
	

}
