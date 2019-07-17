package TopologicalOrdering;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String data;
	private boolean visited;
	private List<Vertex> neighbourlist;

	public Vertex(String data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.neighbourlist = new ArrayList<>();

	}

	public void addNeighbour(Vertex vertex) {
		this.neighbourlist.add(vertex);
	}

	@Override
	public String toString() {
		return this.data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbourlist() {
		return neighbourlist;
	}

	public void setNeighbourlist(List<Vertex> neighbourlist) {
		this.neighbourlist = neighbourlist;
	}

}
