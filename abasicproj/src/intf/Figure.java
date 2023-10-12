package intf;

public interface Figure {
	public static final String TYPE = "General Shap"; //by default public static final
	//no data
	//no constructor
	//a class can implement more than one interface
	
	public double area(); //by default public, abstract
	// two new features (java 8)
	//default methods can be overridden or not
	public default void draw() {
		System.out.println("A Figure is drawn");
	}
	public static double sum(Figure f1, Figure f2)
	{
		return f1.area() + f2.area();
	}
	
}
