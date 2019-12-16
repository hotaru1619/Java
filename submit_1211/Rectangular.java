package submit_1211;

public class Rectangular extends Shape{

	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Rectangular() {
		super();
	}

	public Rectangular(String name, double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	void print() {
		System.out.println(super.getName() + "의 면적은");
	}

	@Override
	double calculationArea() {
		return width*height;
	}

	
}
