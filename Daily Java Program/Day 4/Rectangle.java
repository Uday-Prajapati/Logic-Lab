//2) Rectangle with Encapsulation
//Question:
//Create a Rectangle with encapsulated width and height. Validate inputs.
//Requirements:
//
//Private fields: double width, double height
//Getters: getWidth(), getHeight()
//Setters: setWidth(double w), setHeight(double h) — accept only positive values.
//Bonus: If w or h is 0 or negative, silently reject (do not change the value).
//Methods: double area(), double perimeter()
//
//Usage Example:
//
//Rectangle r = new Rectangle();
//r.setWidth(10);
//r.setHeight(5);
//System.out.println(r.area());      // 50.0
//System.out.println(r.perimeter()); // 30.0
//r.setWidth(0); // silently rejected (bonus)

//class Rectangle {
//	private double width;
//	private double height;
//	
//	// setter
//	public void setWidth(double w) {
//		// silent reject
//		if(w>0) {
//			this.width = w;
//		}
//	}
//	
//	// setter
//	public void setHeight(double h) {
//		if(h>0) {
//			this.height = h;
//		}
//	}
//	
//	// getter
//	public double getWidth() {
//		return width;
//	}
//	
//	// getter
//	public double getHeight() {
//		return height;
//	}
//	
//	// method area calculate
//	public double area() {
//		return width * height;
//	}
//	
//	// heigth calcualte
//	public double perimeter() {
//		return 2 * (width + height);
//	}
//	
//	public static void main(String[] args) {
//		Rectangle r = new Rectangle();
//		r.setWidth(10);
//		r.setHeight(5);
//		
//		System.out.println(r.area());      // 50.0
//		System.out.println(r.perimeter()); // 30.0
//		
//		r.setWidth(0); // silently rejected (bonus)
////		System.out.println(r.getWidth()); // still 10
//
//	}
//}

// with user input
import java.util.Scanner;

class Rectangle {

    private double width;
    private double height;

    public void setWidth(double w) {
        if (w > 0) {
            this.width = w;
        }
    }

    public void setHeight(double h) {
        if (h > 0) {
            this.height = h;
        }
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        r.setWidth(w);

        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        r.setHeight(h);

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());

        sc.close();
    }
}

