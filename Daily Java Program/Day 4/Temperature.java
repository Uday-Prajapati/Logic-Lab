//8) Temperature (Immutable-like Pattern)
//Question:
//Build an immutable-like Temperature with a Celsius base.
//Requirements:
//
//Field: private final double celsius
//Methods:
//
//double toFahrenheit()
//Temperature withCelsius(double c) — returns new object with updated celsius
//
//Constraint: No setters.
//
//Usage Example:
//Temperature t = new Temperature(25.0);
//System.out.println(t.toFahrenheit()); // 77.0
//Temperature t2 = t.withCelsius(30.0); // t unchanged

public class Temperature {
	
	// immutable field
	private final double celsius;
	
	// construtor
	public Temperature(double celsius){
		this.celsius = celsius;
	}
	
	// convert to Fahrenheit
	public double toFahrenheit() {
		return (celsius * 9 / 5) + 32;

	}
	
	public Temperature withCelsius(double c) {
		return new Temperature(c);
	}
	
	public static void main(String[] args) {
		Temperature t1 = new Temperature(25.0);
		System.out.println(t1.toFahrenheit());
		
		Temperature t2 = t1.withCelsius(30.0);
		
		System.out.println(t1.toFahrenheit()); // still 77.0
		System.out.println(t2.toFahrenheit()); // 86.0

	}

}
