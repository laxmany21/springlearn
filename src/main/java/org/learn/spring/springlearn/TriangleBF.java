package org.learn.spring.springlearn;

public class TriangleBF {
	
	private String type;
	private int height;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw()
	{
		System.out.println("Triangle drawn");
	}
}
