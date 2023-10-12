package inh;

public class Circle extends Figure{
	@Override
	public String toString() {
		return "Circle [rad=" + rad + "]";
	}
	private double rad;

	public Circle(double rad) {
		super();
		this.rad = rad;
	}
	@Override
	public double area()
	{
		return Math.PI * rad * rad;
	}
	@Override
	public void draw()
	{
		System.out.println("Circle is drawn");
	}

}
