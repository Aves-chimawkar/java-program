interface Shape {
    double area();
    double volume();
}
class Sphere implements Shape {
    double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public double area() {
        return 4 * Math.PI * radius * radius;
    }
    public double volume() {
        return 4.0 / 3.0 * Math.PI * radius * radius * radius;
    }
}
class Cone implements Shape {
    double radius;
    double height;
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double area() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }
    public double volume() {
        return 1.0 / 3.0 * Math.PI * radius * radius * height;
    }
}
class Cylinder implements Shape {
    double radius;
    double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double area() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
public class Shapes {
    public static void main(String args[]) {
        Shape sphere = new Sphere(2.0);
        Shape cone = new Cone(2.0, 3.0);
        Shape cylinder = new Cylinder(2.0, 3.0);
        
        System.out.println();
        System.out.println("Sphere");
        System.out.println("Area: " + sphere.area());
        System.out.println("Volume: " + sphere.volume());
        System.out.println("----------------------------");
        
        System.out.println("Cone");
        System.out.println("Area: " + cone.area());
        System.out.println("Volume: " + cone.volume());
        System.out.println("----------------------------");
        
        System.out.println("Cylinder");
        System.out.println("Area: " + cylinder.area());
        System.out.println("Volume: " + cylinder.volume());
    }
}
