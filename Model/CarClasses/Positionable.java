package Model.CarClasses;

public interface Positionable {

    double getX();

    double getY();

    void setX(double d);

    void setY(double d);
    double getSize();

}
// För att kunna lasta bilar på både ramp och garage utan kod duplicering, skapa en loader (eller platform)
// klass som ramp och garage kan ha som objekt för att kunna lasta på andra Positionables (inklusive bilar, och ev. andra objekt).