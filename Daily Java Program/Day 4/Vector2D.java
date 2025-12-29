//12) Vector2D with Final Constants and Static Factory
//Question:
//Implement a 2D vector with constants and polar factory.
//Requirements:
//
//Fields: private double x, y
//Constants: public static final Vector2D ZERO, UNIT_X, UNIT_Y
//Static factory: public static Vector2D fromPolar(double r, double theta)
//Instance methods: Vector2D add(Vector2D other), Vector2D scale(double s), double magnitude()
//Constraint: Ensure constants are immutable — either make fields final and no mutators, or return new objects for operations without modifying the constants.
//
//Usage Example:
//
//Vector2D v = Vector2D.fromPolar(2, Math.PI/2); // (0,2)
//Vector2D w = Vector2D.UNIT_X.add(v);           // (1,2)

class Vector2D {
	// field immutable
	private final double x, y;
	
	// constants shareed immutable
	public static final Vector2D ZERO  = new Vector2D(0,0);
	public static final Vector2D UNIT_X  = new Vector2D(1,0); 
	public static final Vector2D UNIT_Y  = new Vector2D(0,1);
	
	// Constructor (private fields, no setters immutable)
	public Vector2D(double d, double e) {
		this.x = d;
		this.y = e;
	}

	// Static factory: Create from polar coordinates (r, theta)
    // x = r*cos(theta), y = r*sin(theta)
	public static Vector2D fromPolar(double r, double theta) {
	    double x = r*Math.cos(theta);
	    double y = r*Math.sin(theta);
	    return new Vector2D(x,y);
	}
	
	// Inastance method
	// Add two vectors & return new object (
	public Vector2D add(Vector2D other) {
        return new Vector2D(this.x + other.x, this.y + other.y);
    }

    // Scale vector by a factor & return new object (immutable)
    public Vector2D scale(double s) {
        return new Vector2D(this.x * s, this.y * s);
    }

    // Calculate magnitude of vector
    public double magnitude() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    
	public static void main(String[] args) {
		Vector2D v = Vector2D.fromPolar(2, Math.PI / 2); // (0,2)
        Vector2D w = Vector2D.UNIT_X.add(v);            // (1,2)

        // Print explicitly x and y
        System.out.printf("v = (%.1f, %.1f)%n", v.x, v.y);
        System.out.printf("w = (%.1f, %.1f)%n", w.x, w.y);
        System.out.println("Magnitude of w = " + w.magnitude());
	}
}
