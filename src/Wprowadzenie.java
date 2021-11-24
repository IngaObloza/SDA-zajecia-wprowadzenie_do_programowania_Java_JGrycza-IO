//zad 1:
// stwórz klasę Cirvle z polem promień,
// urzyk konstruktora jednoargumentowego + metodę calculateArea() (policzy pole powierzchni koła.)
//zad 1.2:
// nie pozwól na modyfikację promienia spoza klasy, ale pozwól na pobranie go - get i set.


// napisanie metody i wywołanie ich.
//this.colour - odwołuje sie do pola
//colour - odwołuje się do konkretnej zmiennej, konkretnego parametru.
// konstruktor i komstruktor wieloargumentowy.



import java.util.Scanner;
public class Wprowadzenie {
    public static void main(String[] args)  {
//zad 2
// Stwórz klasę MyPoin, reprezentującą punkt w układzie współrzędnych
// klasa ma mieć odpowiedni konstruktor oraz pozwalać na odczyt współrzędnych
// oraz na obliczanie odległości od innego punktu przekazanego jako argument
// Nie pozwól na modyfikację współrzędnych spoza klasy MyPoint.
//zad 2.1
// Stwórz klasę reprezentującą trójkąt, pola to trzy punkty,
// napisz odpowiednie gettery i settery.
// Trójkąt powinien mieć metodę, która obliczy obwód.
// upewnij się, że punkty są różne.

        MyPoint newPoint = new MyPoint (0, 0);
        System.out.println(newPoint.getX());
        System.out.println(newPoint.getY());

        MyPoint newPoint2 = new MyPoint (3,4);
        System.out.println(newPoint.calculateDistance(3,4));
        System.out.println(newPoint2.calculateDistance(6,8));

//// do klasy Circle: zad 1 i 1.2
//        Circle myCircle = new Circle (5.5); // wywołanie klasy Circle i wywołanie metody z klasy Circle.
//        myCircle.radius = 5.5; // nie konieczne - możemy tu zmienić wartość radius, w tym momencie powtarzamy wartość.
//        System.out.println("promień myCircle = " + myCircle.radius);
////        circle.radius = 10;
//        double area = myCircle.calculateArea();
////        double area = new Circle(Circle.calculateArea());
//        System.out.println("pole myCircle = " + area);

    }
}

//zad 2
// Stwórz klasę MyPoin, reprezentującą punkt w układzie współrzędnych
// klasa ma mieć odpowiedni konstruktor oraz pozwalać na odczyt współrzędnych
// oraz na obliczanie odległości od innego punktu przekazanego jako argument
// Nie pozwól na modyfikację współrzędnych spoza klasy MyPoint











//        Apple myApple = new Apple(); //możemy urzyć tej klasy - Apple, bo stworzyliśmy ją wcześniej // tu powołujemy też zmienną - konkretne jabłko
//        System.out.println(myApple.colour); //teraz mają wartości domyslne null i 0
//        System.out.println(myApple.size);
//
//        myApple.colour = "red";
//        myApple.size = 3;
//
//        System.out.println(myApple.colour); //teraz mają określone wartości.
//        System.out.println(myApple.size);
//// drukuje w kolejności: null, 0, red, 3.
//
//        Apple myApple2 = new Apple(); // nowy obiekt - drugie jabłko
//        myApple2.colour = "green"; // określa dane konkretne jabłko
//        myApple2.size = 4;
//
//        myApple.rot(5, "black");
//        System.out.println(myApple.colour);
//}
//}







