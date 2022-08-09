package com.design.pattern.Learning.prototype.pattern;

public abstract class GameUnit implements Cloneable{
	
	private Position position;

	public GameUnit() {
		super();
		position = Position.ZERO;
	}

	public GameUnit(Integer x, Integer y, Integer z) {
		super();
		this.position = new Position(x, y, z);
	}
	
	protected void initiliaze() {
		this.position = Position.ZERO;
		reset();
	}
	
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		GameUnit unit = (GameUnit)super.clone();
		unit.initiliaze();
		return unit;
	}
    protected abstract void reset();
    
    public void move(Integer x, Integer y, Integer z) {
    	this.position = new Position(x, y, z);
    }
    
    public Position getPosition() {
    	return position;
    }

}

