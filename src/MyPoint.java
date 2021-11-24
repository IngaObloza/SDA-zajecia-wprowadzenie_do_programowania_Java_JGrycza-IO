//zad 2
// Stwórz klasę MyPoin, reprezentującą punkt w układzie współrzędnych
// klasa ma mieć odpowiedni konstruktor oraz pozwalać na odczyt współrzędnych
// oraz na obliczanie odległości od innego punktu przekazanego jako argument
// Nie pozwól na modyfikację współrzędnych spoza klasy MyPoint.



public class MyPoint {
//    //mój
//    double coordinateX;
//    double coordinateY;
//    public Mypoint (double coordinateX, double coordinateY) {
//    }
//    }

    //Andrzej

    private double x;
    private double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calculateDistance(double xPoint, double yPoint) {
        return Math.sqrt(Math.pow((xPoint-x), 2)+Math.pow((yPoint-y), 2));
    }

    public double calculatePerimeter() {
        return x.calculateDistance(y) + y.calculateDistance(z) + z.calculateDistance(x);
    }

    //   public double getDistance(MyPoint b) {
    }







































}

//// Arleta:
//
//public class MyPoint {
//    private double x;
//    private double y;
//
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//    public MyPoint( double x, double y){
//        this.x = x;
//        this.y = y;
//    }
//    public double getDistanceTo(MyPoint point){
//        return Math.sqrt(Math.pow(this.x - point.x,2) + Math.pow(this.y - point.y,2));
//}
//    }

//public class Circle {
//    public double radius;  //private? do geterów. do 1.2
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
////    public double getRadius(){ / getery i setery - zobacz. do 1.2
////        return this.radius;
////    }
//
//    public double calculateArea() {
//        return Math.PI*(radius*radius);
//    }
//}