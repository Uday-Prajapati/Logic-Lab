public class VolumeCalculator {
	// Fill the code
	private int length;
	private int breadth;
	private int height;
	private double radius;
	
	// method
	// cylinder
	public double calculateVolume(double radius, double height) {
		double volumeOfTheCylinder = 3.14*radius*radius*height;
		return volumeOfTheCylinder;
	}
	
	//cuboid
	public double calculateVolume(int length, int breadth, int height) {
		double volumeOfTheCuboid = length*breadth*height;
		return volumeOfTheCuboid;
	}
	
}
