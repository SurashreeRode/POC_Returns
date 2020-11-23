package com.homedepot.returns.springboot.model;

public class Item {
	
	private Sku sku;
	private String quantity;
	private Double retailPrice;
	private String rtvReasonCode;
	private String returnComment;
	private String rtvLabel;
	
	public Sku getSku() {
		return sku;
	}
	public void setSku(Sku sku) {
		this.sku = sku;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}
	public String getRtvReasonCode() {
		return rtvReasonCode;
	}
	public void setRtvReasonCode(String rtvReasonCode) {
		this.rtvReasonCode = rtvReasonCode;
	}
	public String getReturnComment() {
		return returnComment;
	}
	public void setReturnComment(String returnComment) {
		this.returnComment = returnComment;
	}
	public String getRtvLabel() {
		return rtvLabel;
	}
	public void setRtvLabel(String rtvLabel) {
		this.rtvLabel = rtvLabel;
	}
	
	

}
