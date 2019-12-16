package submit_1211;

public abstract class Shape {
	
	private double area;  //??????
	private String name;
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shape() {
		super();
	}

	public Shape(double area, String name) {
		super();
		this.area = area;
		this.name = name;
	}
	
	
	abstract double calculationArea();
	
	abstract void print();
}
