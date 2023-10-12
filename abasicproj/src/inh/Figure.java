package inh;

//a final class can not be inherited
// final method can not be overidden
// final identifier can not be changed

public abstract class Figure {
	double dim1, dim2;
	
	public abstract double area();
	public abstract void draw();
	final public String getColor() //can not override it 
	{
		return "White";
	}
}
