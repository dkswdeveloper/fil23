package inh;

public class Rectangle extends Figure{
	private double len,wid;

	public Rectangle(double len, double wid) {
		super();
		this.len = len;
		this.wid = wid;
	}
	@Override
	public double area()
	{
		return len * wid;
	}
	@Override
	public void draw()
	{
		System.out.println("Rectangle is drawn");
	}
	@Override
	public String toString() {
		return "Rectangle [len=" + len + ", wid=" + wid + "]";
	}
	@Override
	public boolean equals(Object obj)
	{
//		if(obj.getClass() != this.getClass()) return false;
		if(! (obj instanceof Rectangle) ) return false;
		
		Rectangle r = (Rectangle) obj;
		return this.len == r.len && this.wid == r.wid ; 
	}
	

}
