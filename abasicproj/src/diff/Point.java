package diff;

public class Point implements Comparable<Point>{
	int x, y;
	static int orgx = 0, orgy = 0;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y= y;
	}
	public Point()
	{
		x = 0; y = 0;
	}
	public void show()
	{
		System.out.println("point wiht " + this.x + ","  + this.y);
	}
	public double distance()
	{
		//returns distance from origin
		return Math.sqrt(x*x + y*y);
	}
	public double distance(Point p2)
	{
		//return the distance of this from p2
		double xdiff = this.x - p2.x;
		double ydiff = this.y - p2.y;
		return Math.sqrt(xdiff*xdiff + ydiff * ydiff);
	}
	public Point fartherFromOrigin(Point p2) {
		// which one is far away from origin : this or p2
		if(this.distance() > p2.distance())
			return this;
		else return p2;
	}
	@Override
	public int compareTo(Point o) {
		if(this.x < o.x) return -1;
		else if(this.x > o.x ) return 2;
		return 0;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof Point)) return false;
		Point pt = (Point) obj;
		return x == pt.x && y == pt.y;
//		return super.equals(obj);
	}
	@Override
	public int hashCode()
	{
		return x*10 + y;
	}
	
	
	

}
