package com.design.pattern.Learning.prototype.pattern;

public class Position {

	private Integer x;
	private Integer y;
	private Integer z;
	
	
	public Position() {
		super();
	}

	public Position(Integer x, Integer y, Integer z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static final Position ZERO = new Position(0, 0, 0);


	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getZ() {
		return z;
	}

	public void setZ(Integer z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
	
}
