package gmit;

public class JourneyRoute {
	
	private static JourneyRoute route = new JourneyRoute();
	private Node s;
	
	public static void main(String[] args)
	{
		JourneyRoute.getInstance();
	}
	
	public static JourneyRoute getInstance()
	{
		return route;
	}
	
	private void transverse(Node n)
	{
		 System.out.println(n);
		 n.setVisited(true); //paint the node as visited
		 
		 Node[] children = n.children();
		 for(int i = 0; i < children.length; i++)
		 {
			 if(!children[i].isVisited())
			 {
				 transverse(children[i]);
			 }
		 }	 
	}
	
	public JourneyRoute()
	{
		s = new Node("Abu Tabor", 200);
		
		Node node1 = new Node("Temple Mount", 170);
		node1.setDanger(0.0f);
		node1.setTerrain(0.0f);
		
		Node node2 = new Node("Netanya", 150);
		node2.setDanger(0.1f);
		node2.setTerrain(0.2f);
		
		Node node3 = new Node("Beit She'an", 155);
		node3.setDanger(0.1f);
		node3.setTerrain(0.2f);
		
		Node node4 = new Node("Amman", 150);
		node4.setDanger(0.1f);
		node4.setTerrain(0.2f);
		
		Node node5 = new Node("Beirut", 130);
		node5.setDanger(0.3f);
		node5.setTerrain(0.4f);
		
		Node node6 = new Node("Namar", 135);
		node6.setDanger(0.4f);
		node6.setTerrain(0.4f);
		
		Node node7 = new Node("Palmyra", 130);
		node7.setDanger(0.3f);
		node7.setTerrain(0.4f);
		
		Node node8 = new Node("Al Tal", 120);
		node8.setDanger(0.5f);
		node8.setTerrain(0.4f);
		
		Node node9 = new Node("Tripoli", 105);
		node9.setDanger(0.6f);
		node9.setTerrain(0.6f);
		
		Node node10 = new Node("Zaidal", 100);
		node10.setDanger(0.7f);
		node10.setTerrain(0.6f);
		
		Node node11 = new Node("Al Tabqah", 105);
		node11.setDanger(0.6f);
		node11.setTerrain(0.6f);
		
		Node node12 = new Node("Tartus", 80);
		node12.setDanger(0.8f);
		node12.setTerrain(0.7f);
		
		Node node13 = new Node("Idlib", 80);
		node13.setDanger(0.9f);
		node13.setTerrain(0.7f);
		
		Node node14 = new Node("Aleppo", 80);
		node14.setDanger(0.7f);
		node14.setTerrain(0.7f);
		
		Node node15 = new Node("Latakia", 50);
		node15.setDanger(0.8f);
		node15.setTerrain(0.7f);
		
		Node node16 = new Node("Antioch", 25);
		node16.setDanger(0.9f);
		node16.setTerrain(0.2f);
		
		Node t = new Node("Cyprus", 0);
		t.setGoalNode(true);
		
		s.addChildNode(node1, 25);
		
		node1.addChildNode(node2, 21);
		node1.addChildNode(node3, 32);
		node1.addChildNode(node4, 41);
		
		node2.addChildNode(node1, 21);
		node2.addChildNode(node5, 26);
		node2.addChildNode(node6, 44);
		
		node3.addChildNode(node1, 32);
		node3.addChildNode(node6, 33);
		
		node4.addChildNode(node1, 41);
		node4.addChildNode(node7, 45);
		
		node5.addChildNode(node2, 26);
		node5.addChildNode(node9, 30);
		
		node6.addChildNode(node2, 44);
		node6.addChildNode(node3, 33);
		node6.addChildNode(node8, 40);
		
		node7.addChildNode(node4, 45);
		node7.addChildNode(node8, 39);
		node7.addChildNode(node11, 50);

		node8.addChildNode(node6, 40);
		node8.addChildNode(node7, 39);
		node8.addChildNode(node10, 24);
		node8.addChildNode(node11, 21);
		
		node9.addChildNode(node5, 30);
		node9.addChildNode(node10, 36);
		node9.addChildNode(node12, 23);
		
		node10.addChildNode(node8, 24);
		node10.addChildNode(node9, 36);
		node10.addChildNode(node13, 32);
		
		node11.addChildNode(node7, 50);
		node11.addChildNode(node8, 21);
		node11.addChildNode(node13, 34);
		node11.addChildNode(node14, 42);
		
		node12.addChildNode(node9, 23);
		node12.addChildNode(node13, 30);
		node12.addChildNode(node15, 20);
		
		node13.addChildNode(node10, 32);
		node13.addChildNode(node11, 34);
		node13.addChildNode(node12, 30);
		node13.addChildNode(node16, 39);
		
		node14.addChildNode(node11, 42);
		node14.addChildNode(node16, 51);
		
		node15.addChildNode(node12, 20);
		node15.addChildNode(node16, 19);
		
		node16.addChildNode(node13, 39);
		node16.addChildNode(node14, 51);
		node16.addChildNode(node15, 19);
		node16.addChildNode(t, 60);
	
		transverse(t);
		
	}
	
	public Node getStartNode()
	{
		return s;
	}
}
