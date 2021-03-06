package a7_triedy;

public class Box {
	private double height;
	private double width;
	private double depth;
	
	public Box() {
		height = -1;
		width = -1;
		depth = -1;
	}
	
	public Box(double dimension) {
		height = width = depth = dimension;
	}
	
	public Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public Box(Box box) {
		this.height = box.height;
		this.width = box.width;
		this.depth = box.depth;
	}
	
	public double getVolume() {
		return (height * width * depth);
	}
	
}
