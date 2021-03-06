package edu.ycp.cs320.ShopEZ.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import edu.ycp.cs320.ShopEZ.model.Location;


public class Node {
	private List<Integer> itemIds = new ArrayList<Integer>();
    private int orderNumber;
    private List<Node> shortestPath = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;
    private Map<Node, Integer> adjacentNodes = new HashMap<>();
    private Location coordinates = new Location();
    
    public void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }
    
    // getters and setters
    public void setOrder(int num) {
        this.orderNumber = num;
    }

    public int getOrder() {
    	return orderNumber;
    }

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Map<Node, Integer> getAdjacentNodes() {
		return adjacentNodes;
	}

	public void setShortestPath(LinkedList<Node> shortestPath2) {
		shortestPath = shortestPath2;
	}

	public LinkedList<Node> getShortestPath() {
		return (LinkedList<Node>) shortestPath;
	}

	public List<Integer> getItemIds() {
		return itemIds;
	}
	
	public void addToItemIdsList(int item_id) {
		this.itemIds.add(item_id);
	}

	public Location getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(int x, int y) {
		coordinates.setX(x);
		coordinates.setY(y);
	}
    
}