package intf;

public class Rectangle extends Object implements Figure, Picture {
	private double len, wid;

	public Rectangle(double len, double wid) {
		super();
		this.len = len;
		this.wid = wid;
	}

	public double getLen() {
		return len;
	}

	public void setLen(double len) {
		this.len = len;
	}

	public double getWid() {
		return wid;
	}

	public void setWid(double wid) {
		this.wid = wid;
	}

	@Override
	public double area() {
		return len*wid;
	}

	@Override
	public String getType() {
		return "Rectangular" ;
	}
	

}
