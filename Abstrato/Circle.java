package Abstrato;

public class Circle extends Shape {
	
	private Double radius;
	
	public Circle() {
		
	}
	
	public Circle(Color color, Double radios) {
		super(color);
		this.radius = radios;
	}

	public Double getRadios() {
		return radius;
	}

	public void setRadios(Double radios) {
		this.radius = radios;
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	

}
