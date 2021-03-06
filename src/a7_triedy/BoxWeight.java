package a7_triedy;

public class BoxWeight extends Box {
	
	private double weight;
	
	public BoxWeight() {
		super();
		weight = -1;
	}
	
	public BoxWeight(double dimension, double weight) {
		super(dimension);
		this.weight = weight;
	}
	
	public BoxWeight(double height, double width, double depth, double weight) {
		super(height, width, depth);
		this.weight = weight;
	}
	
	public BoxWeight(BoxWeight boxWeight, double weight) {
		super(boxWeight);
		this.weight = weight;
	}
	
	public double getWeigth() {
		return this.weight;
	}
}
