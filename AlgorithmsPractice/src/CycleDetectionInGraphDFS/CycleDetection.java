package CycleDetectionInGraphDFS;

import java.util.List;

public class CycleDetection 
{
	public void detectCycle(List<Vertex>vertexList)
	{
		
		for(Vertex v: vertexList)
		{
			if(!v.isVisited())
			{
				
				dfs(v);
				
			}
			
		}
		
	}

	private void dfs(Vertex vertex) {
		System.out.println("DFS on Vertex" + vertex);
		vertex.setBeingVisited(true);
		for(Vertex v: vertex.getNeighbourList() )
		{
			System.out.println("Visiting the neighbour vertex" + vertex);
			
			if(v.isBeingVisited())
			{
				
				System.out.println("There is a backward edge so there is a Cycle!!!");
				return;
			}
			
			if(!v.isVisited())
			{
				System.out.println("Visiting vertex" +v+"Recursively" );
			
				v.setVisited(true);
				dfs(v);
			}
			
			
			
			
		}
		System.out.println("Set Vertex" +vertex+ "setBeingVisited(false) and visited(True)....");
	
		vertex.setVisited(true);
		vertex.setBeingVisited(false);
	
	
	}
	

}
