package com.homedepot.returns.springboot.model;

public class Sku {
	private Integer number;
	private Integer departmentNumber;
	private Integer classNumber;
	private Integer subClassNumber;
    private String description;
    
    
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(Integer departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public Integer getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(Integer classNumber) {
		this.classNumber = classNumber;
	}
	public Integer getSubClassNumber() {
		return subClassNumber;
	}
	public void setSubClassNumber(Integer subClassNumber) {
		this.subClassNumber = subClassNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
    

}
