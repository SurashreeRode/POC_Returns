package com.homedepot.returns.springboot.model;




public class Returns {
	
	private String romeId;
	private String status;
	private String source;
	private String type;
	private String userId;
	private Item item;
	private Location location; 
	
	
	public String getRomeId() {
		return romeId;
	}
	public void setRomeId(String romeId) {
		this.romeId = romeId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	


}
