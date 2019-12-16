package submit_1211;

public class Circle extends Shape{

	private double radius;

	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public Circle(String name, double radius) {
		super();
		this.radius = radius;
	}


	@Override
	double calculationArea() {
		return radius*radius*Math.PI;
	}

	@Override
	void print() {
		System.out.println(super.getName() +"의 면적은");
	}
}
