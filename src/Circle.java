//zad 1:
// stwórz klasę Cirvle z polem promień,
// urzyk konstruktora jednoargumentowego + metodę calculateArea() (policzy pole powierzchni koła.)
//zad 1.2:
// nie pozwól na modyfikację promienia spoza klasy, ale pozwól na pobranie go - get i set.

public class Circle {
    public double radius;  //private? do geterów. do 1.2

    public Circle(double radius) {
        this.radius = radius;
    }

//    public double getRadius(){ / getery i setery - zobacz. do 1.2
//        return this.radius;
//    }

    public double calculateArea() {
        return Math.PI*(radius*radius);
    }
}
