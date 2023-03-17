abstract class Shape {
  abstract double area();
}
class Square extends Shape {
  double side;
  
  Square(double side) {
    this.side = side;
  }
  
  double area() {
    return side * side;
  }
}
class Circle extends Shape {
  double radius;
  
  Circle(double radius) {
    this.radius = radius;
  }
  
  double area() {
    return Math.PI * radius * radius;
  }
}
class Rectangle extends Shape {
  double width;
  double height;
  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  
  double area() {
    return width * height;
  }
}
class Areas {
  public static void main(String args[]) {
    Shape square = new Square(5);
    Shape circle = new Circle(3);
    Shape rectangle = new Rectangle(5, 7);
    
    System.out.println("Area of Square is : " + square.area());
    System.out.println("Area of Circle is: " + circle.area());
    System.out.println("Area of Rectangle is: " + rectangle.area());
  }
}
