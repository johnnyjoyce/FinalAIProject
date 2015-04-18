package gmit;

import java.util.HashMap;
import java.util.Map;

public class Node {
	private String nodeName;
	private Node parent;
	private Map<Node,Integer> children = new HashMap<Node, Integer>();
	private boolean visited = false;
	private boolean goalNode;
	private int approxDistance = 0;
	private int distanceTravelled = 0;
	private float terrain = 0.0f;
	private float danger = 0.0f;
	
	public Node(String name, int goalDistance) 
	{
		this.nodeName = name;
		this.approxDistance = goalDistance;
	}

	public String getNodeName() 
	{
		return nodeName;
	}
	
	public void setNodeName(String nodeName) 
	{
		this.nodeName = nodeName;
	}
	
	public Node getParent() 
	{
		return parent;
	}
	
	public void setParent(Node parent) 
	{
		this.parent = parent;
	}
	
	public Node[] children()
	{
		return(Node[]) children.keySet().toArray(new Node[children.size()]);
	}
	
	public boolean isLeaf()
	{
		if(children.size() > 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public float getScore() {
		return HeuristicCalculator.getHeuristicValue(distanceTravelled, approxDistance, terrain, danger);
	}
	
	public boolean isVisited() 
	{
		return visited;
	}
	
	public void setVisited(boolean visited) 
	{
		this.visited = visited;
	}
	
	public boolean isGoalNode() 
	{
		return goalNode;
	}
	
	public void setGoalNode(boolean goalNode) 
	{
		this.goalNode = goalNode;
	}
	
	public int getApproxDistance() 
	{
		return approxDistance;
	}
	
	public void setApproxDistance(int approxDistance) 
	{
		this.approxDistance = approxDistance;
	}
	
	public int getDistanceTravelled() 
	{
		return distanceTravelled;
	}
	
	public void setDistanceTravelled(int distanceTravelled) 
	{
		this.distanceTravelled = distanceTravelled;
	}
	
	public int getGoalDistance()
	{
		return approxDistance;
	}
	
	public void setGoalDistance(int goalDistance)
	{
		this.approxDistance = goalDistance;
	}
	
	public float getTerrain() 
	{
		return terrain;
	}
	
	public void setTerrain(float terrain) 
	{
		this.terrain = terrain;
	}
	
	public float getDanger() 
	{
		return danger;
	}
	
	public void setDanger(float danger) 
	{
		this.danger = danger;
	}
	
	public void addChildNode(Node child, int distance)
	{
		children.put(child, new Integer(distance));
	}
	
	public void removeChild(Node child)
	{
		children.remove(child);
	}
	
	public String toString() 
	{
		return super.toString();
	}

	public int getDistanceToNode(Node child) {
		return children.get(child);
	}

}