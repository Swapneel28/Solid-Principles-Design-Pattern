package com.design.pattern.Learning.prototype.pattern;

public class General extends GameUnit {

	private String state = "idle";
	
	public void boostMorale() {
		this.state = "MoralBoost";
	}
	
	@Override
	public String toString() {
		return "General "+state+" @ "+getPosition();
	}

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
    	throw new CloneNotSupportedException("There should be only one General");
    }

	@Override
	protected void reset() {
		throw new UnsupportedOperationException("Reset is not supported");
	}
	
	
}
